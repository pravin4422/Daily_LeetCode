import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // Remove element outside the window (i - k)
            if (i > k) {
                window.remove(nums[i - k - 1]);
            }

            // If duplicate exists in the window
            if (!window.add(nums[i])) {
                return true;
            }
        }

        return false;
    }
}
