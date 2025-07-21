import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int start = 0;
        int end = n - 1;
        int pos = n - 1;

        while (start <= end) {
            int left = nums[start] * nums[start];
            int right = nums[end] * nums[end];

            if (left > right) {
                result[pos] = left;
                start++;
            } else {
                result[pos] = right;
                end--;
            }
            pos--;
        }

        return result;
    }
}
