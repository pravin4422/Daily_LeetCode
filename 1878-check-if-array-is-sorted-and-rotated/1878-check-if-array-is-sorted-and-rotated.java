class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        // Count how many times the order breaks
        for (int i = 0; i < n; i++) {
            int next = (i + 1) % n;  // wrap around
            if (nums[i] > nums[next]) {
                count++;
            }
        }

        // A sorted+rotated array can break the order only once
        return count <= 1;
    }
}
