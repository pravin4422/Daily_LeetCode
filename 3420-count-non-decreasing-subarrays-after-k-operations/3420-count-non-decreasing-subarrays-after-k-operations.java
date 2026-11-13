
import java.util.*;

class Solution {
    public long countNonDecreasingSubarrays(int[] nums, int k) {
        int n = nums.length;
        long ans = 0;
        long operations = 0;

        Deque<Integer> deque = new ArrayDeque<>();
        int left = n - 1;

        for (int right = n - 1; right >= 0; right--) {

            while (!deque.isEmpty() &&
                   nums[deque.peekLast()] < nums[right]) {

                int j = deque.pollLast();

                int prev = deque.isEmpty()
                        ? left + 1
                        : deque.peekLast();

                operations += (long) (prev - j)
                        * (nums[right] - nums[j]);
            }

            deque.addLast(right);

            while (operations > k) {
                int j = deque.peekFirst();

                operations -= (long) (Math.max(0,
                        nums[j] - nums[left]));

                left--;

                if (!deque.isEmpty() && deque.peekFirst() > left) {
                    deque.pollFirst();
                }
            }

            ans += left - right + 1;
        }

        return ans;
    }
}
