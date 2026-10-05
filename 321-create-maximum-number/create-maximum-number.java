class Solution {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {

        int[] best = new int[k];

        for (int i = Math.max(0, k - nums2.length);
             i <= Math.min(k, nums1.length); i++) {

            int[] a = maxArray(nums1, i);
            int[] b = maxArray(nums2, k - i);

            int[] merged = merge(a, b);

            if (greater(merged, 0, best, 0)) {
                best = merged;
            }
        }

        return best;
    }

    private int[] maxArray(int[] nums, int k) {

        int[] result = new int[k];
        int top = 0;
        int remove = nums.length - k;

        for (int num : nums) {

            while (top > 0 && remove > 0
                    && result[top - 1] < num) {
                top--;
                remove--;
            }

            if (top < k) {
                result[top++] = num;
            } else {
                remove--;
            }
        }

        return result;
    }

    private int[] merge(int[] a, int[] b) {

        int[] result = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length || j < b.length) {

            if (greater(a, i, b, j)) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        return result;
    }

    private boolean greater(int[] a, int i, int[] b, int j) {

        while (i < a.length && j < b.length
                && a[i] == b[j]) {
            i++;
            j++;
        }

        return j == b.length
                || (i < a.length && a[i] > b[j]);
    }
}