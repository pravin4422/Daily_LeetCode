class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int n = s.length(), m = p.length();
        if (n < m) return result;

        int[] count = new int[26];
        for (int i = 0; i < m; i++) {
            count[p.charAt(i) - 'a']++;
        }

        int need = m;
        for (int i = 0; i < n; i++) {
            if (count[s.charAt(i) - 'a']-- > 0) {
                need--;
            }
            if (i >= m && count[s.charAt(i - m) - 'a']++ >= 0) {
                need++;
            }
            if (need == 0) {
                result.add(i - m + 1);
            }
        }
        return result;
    }
}