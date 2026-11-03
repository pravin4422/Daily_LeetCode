class Solution {
    public int minCut(String s) {
        int n = s.length();
        int[] cuts = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            cuts[i] = i - 1;
        }

        for (int center = 0; center < n; center++) {
            for (int l = center, r = center;
                 l >= 0 && r < n && s.charAt(l) == s.charAt(r); l--, r++) {
                cuts[r + 1] = Math.min(cuts[r + 1], cuts[l] + 1);
            }
            for (int l = center, r = center + 1;
                 l >= 0 && r < n && s.charAt(l) == s.charAt(r); l--, r++) {
                cuts[r + 1] = Math.min(cuts[r + 1], cuts[l] + 1);
            }
        }
        return cuts[n];
    }
}