class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    // Binary search for the first occurrence
    private int findFirst(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            if (nums[mid] == target) {
                index = mid; // record position but keep going left
            }
        }

        return index;
    }

    // Binary search for the last occurrence
    private int findLast(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            if (nums[mid] == target) {
                index = mid; // record position but keep going right
            }
        }

        return index;
    }
}
