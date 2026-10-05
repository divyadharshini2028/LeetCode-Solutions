class Solution {
    public int countRangeSum(int[] nums, int lower, int upper) {

        long[] prefix = new long[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        return mergeSort(prefix, 0, prefix.length, lower, upper);
    }

    private int mergeSort(long[] nums, int left, int right,
                          int lower, int upper) {

        if (right - left <= 1) {
            return 0;
        }

        int mid = left + (right - left) / 2;

        int count = mergeSort(nums, left, mid, lower, upper)
                  + mergeSort(nums, mid, right, lower, upper);

        int j = mid;
        int k = mid;

        for (int i = left; i < mid; i++) {

            while (j < right && nums[j] - nums[i] < lower) {
                j++;
            }

            while (k < right && nums[k] - nums[i] <= upper) {
                k++;
            }

            count += k - j;
        }

        long[] temp = new long[right - left];

        int i = left;
        int p = mid;
        int t = 0;

        while (i < mid && p < right) {

            if (nums[i] <= nums[p]) {
                temp[t++] = nums[i++];
            } else {
                temp[t++] = nums[p++];
            }
        }

        while (i < mid) {
            temp[t++] = nums[i++];
        }

        while (p < right) {
            temp[t++] = nums[p++];
        }

        for (int x = 0; x < temp.length; x++) {
            nums[left + x] = temp[x];
        }

        return count;
    }
}