class Solution {
    public int minimumMoves(String s) {
        int n = s.length();
        int v = 0;
        int i = 0;

        while (i < n) {
            if (s.charAt(i) == 'X') {
                v++;
                i += 3;  
            } else {
                i++;
            }
        }

        return v;
    }
}
