class Solution {
    public String truncateSentence(String s, int k) {
        String[] sh = s.split(" "); 
        if (sh.length <= k) {
            return s;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < k; i++) {
            result.append(sh[i]);
                if (i < k - 1) {
                result.append(" ");
            }
        }

        return result.toString();

    }
}