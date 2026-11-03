class Solution {
    public int longestPalindrome(String s) {
        boolean[] odd = new boolean[128];
        int length = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (odd[c]) {
                length += 2;
            }
            odd[c] = !odd[c];
        }
        return length < s.length() ? length + 1 : length;
    }
}