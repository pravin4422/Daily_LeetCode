class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        int operations = 0;

        for (int x : nums) {
            int need = k - x;
            int available = count.getOrDefault(need, 0);
            if (available > 0) {
                count.put(need, available - 1);
                operations++;
            } else {
                count.merge(x, 1, Integer::sum);
            }
        }
        return operations;
    }
}