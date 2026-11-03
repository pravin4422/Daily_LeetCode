class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
        int n = s.length();
        if (n < 10) return result;

        int[] code = new int[128];
        code['C'] = 1;
        code['G'] = 2;
        code['T'] = 3;

        byte[] seen = new byte[1 << 20];
        int mask = (1 << 20) - 1;
        int hash = 0;

        for (int i = 0; i < n; i++) {
            hash = ((hash << 2) | code[s.charAt(i)]) & mask;
            if (i >= 9) {
                if (seen[hash] == 1) {
                    result.add(s.substring(i - 9, i + 1));
                }
                if (seen[hash] < 2) {
                    seen[hash]++;
                }
            }
        }
        return result;
    }
}