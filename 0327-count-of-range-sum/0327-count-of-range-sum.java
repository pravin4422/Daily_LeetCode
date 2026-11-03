class Solution {
    private long[] prefix;
    private long[] temp;
    private int lower, upper;

    public int countRangeSum(int[] nums, int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
        int n = nums.length;
        prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        temp = new long[n + 1];
        return sort(0, n);
    }

    private int sort(int lo, int hi) {
        if (lo >= hi) return 0;
        int mid = (lo + hi) >>> 1;
        int count = sort(lo, mid) + sort(mid + 1, hi);

        int start = mid + 1, end = mid + 1;
        for (int i = lo; i <= mid; i++) {
            while (start <= hi && prefix[start] - prefix[i] < lower) start++;
            while (end <= hi && prefix[end] - prefix[i] <= upper) end++;
            count += end - start;
        }

        int i = lo, j = mid + 1, k = lo;
        while (i <= mid && j <= hi) {
            temp[k++] = prefix[i] <= prefix[j] ? prefix[i++] : prefix[j++];
        }
        while (i <= mid) temp[k++] = prefix[i++];
        while (j <= hi) temp[k++] = prefix[j++];
        System.arraycopy(temp, lo, prefix, lo, hi - lo + 1);
        return count;
    }
}