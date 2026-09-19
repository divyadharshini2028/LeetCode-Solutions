class Solution {
    public int strongPasswordChecker(String password) {

        int n = password.length();

        boolean lower = false;
        boolean upper = false;
        boolean digit = false;

        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lower = true;
            } else if (Character.isUpperCase(c)) {
                upper = true;
            } else if (Character.isDigit(c)) {
                digit = true;
            }
        }

        int missing = 0;

        if (!lower) missing++;
        if (!upper) missing++;
        if (!digit) missing++;

        // Find groups of 3 or more same characters
        int replace = 0;
        int one = 0;
        int two = 0;

        for (int i = 0; i < n; ) {

            int j = i;

            while (j < n && password.charAt(j) == password.charAt(i)) {
                j++;
            }

            int len = j - i;

            if (len >= 3) {
                replace += len / 3;

                if (len % 3 == 0) {
                    one++;
                } else if (len % 3 == 1) {
                    two++;
                }
            }

            i = j;
        }

        // Case 1: password is too short
        if (n < 6) {
            return Math.max(6 - n, missing);
        }

        // Case 2: password length is okay
        if (n <= 20) {
            return Math.max(replace, missing);
        }

        // Case 3: password is too long
        int delete = n - 20;

        // Delete characters from groups where deletion reduces replacements
        int use = Math.min(delete, one);
        replace -= use;
        delete -= use;

        use = Math.min(delete / 2, two);
        replace -= use;
        delete -= use * 2;

        use = delete / 3;
        replace -= use;

        return (n - 20) + Math.max(replace, missing);
    }
}