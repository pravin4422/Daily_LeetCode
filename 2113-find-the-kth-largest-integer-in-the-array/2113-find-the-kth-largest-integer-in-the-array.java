import java.util.*;
import java.math.BigInteger;   // ✅ Needed for BigInteger

class Solution {
    public String kthLargestNumber(String[] strArr, int k) {

        // Convert string array to BigInteger array
        BigInteger[] nums = new BigInteger[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            nums[i] = new BigInteger(strArr[i]);
        }

        // Sort in descending order
        Arrays.sort(nums, Collections.reverseOrder());

        // Return kth largest number as String
        return nums[k - 1].toString();
    }
}
