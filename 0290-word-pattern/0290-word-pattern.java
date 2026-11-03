class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;

        int[] charIndex = new int[26];
        Map<String, Integer> wordIndex = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            int c = pattern.charAt(i) - 'a';
            Integer w = wordIndex.put(words[i], i + 1);
            if (charIndex[c] != (w == null ? 0 : w)) return false;
            charIndex[c] = i + 1;
        }
        return true;
    }
}