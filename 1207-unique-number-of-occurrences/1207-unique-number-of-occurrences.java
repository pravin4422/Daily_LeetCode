class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] count = new int[2001];
        for (int x : arr) {
            count[x + 1000]++;
        }

        boolean[] used = new boolean[arr.length + 1];
        for (int c : count) {
            if (c == 0) continue;
            if (used[c]) return false;
            used[c] = true;
        }
        return true;
    }
}