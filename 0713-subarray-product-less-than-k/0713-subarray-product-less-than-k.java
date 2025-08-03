class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;  // Edge case

        int left = 0, product = 1, count = 0;

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];

            // Shrink window while product >= k
            while (product >= k) {
                product /= nums[left];
                left++;
            }

            // Count subarrays ending at right
            count += right - left + 1;
        }

        return count;
    }
}
