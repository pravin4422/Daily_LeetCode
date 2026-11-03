class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Long, Integer> edges = new HashMap<>();
        int maxEdges = 0;

        for (List<Integer> row : wall) {
            long pos = 0;
            for (int i = 0; i < row.size() - 1; i++) {
                pos += row.get(i);
                int count = edges.merge(pos, 1, Integer::sum);
                maxEdges = Math.max(maxEdges, count);
            }
        }
        return wall.size() - maxEdges;
    }
}