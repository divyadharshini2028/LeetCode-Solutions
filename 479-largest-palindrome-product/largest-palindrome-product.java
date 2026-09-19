class Solution {
    public int largestPalindrome(int n) {

        if (n == 1) {
            return 9;
        }

        int upper = (int)Math.pow(10, n) - 1;
        int lower = (int)Math.pow(10, n - 1);

        for (int left = upper; left >= lower; left--) {

            String s = String.valueOf(left);
            String reverse = new StringBuilder(s).reverse().toString();

            long palindrome = Long.parseLong(s + reverse);

            for (long i = upper; i * i >= palindrome; i--) {

                if (palindrome % i == 0) {

                    long other = palindrome / i;

                    if (other >= lower && other <= upper) {
                        return (int)(palindrome % 1337);
                    }
                }
            }
        }

        return 0;
    }
}