class Solution {
    private List<String> result = new ArrayList<>();

    public List<String> removeInvalidParentheses(String s) {
        int left = 0, right = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                left++;
            } else if (c == ')') {
                if (left > 0) left--;
                else right++;
            }
        }
        dfs(s, 0, left, right);
        return result;
    }

    private void dfs(String s, int start, int left, int right) {
        if (left == 0 && right == 0) {
            if (isValid(s)) result.add(s);
            return;
        }
        for (int i = start; i < s.length(); i++) {
            if (i > start && s.charAt(i) == s.charAt(i - 1)) continue;
            char c = s.charAt(i);
            if (c == '(' && left > 0) {
                dfs(s.substring(0, i) + s.substring(i + 1), i, left - 1, right);
            } else if (c == ')' && right > 0) {
                dfs(s.substring(0, i) + s.substring(i + 1), i, left, right - 1);
            }
        }
    }

    private boolean isValid(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                if (--count < 0) return false;
            }
        }
        return count == 0;
    }
}