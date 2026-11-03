class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int[] p : points) {
            map.clear();
            for (int[] q : points) {
                int dx = p[0] - q[0];
                int dy = p[1] - q[1];
                int dist = dx * dx + dy * dy;
                int count = map.getOrDefault(dist, 0);
                result += 2 * count; 
                map.put(dist, count + 1);
            }
        }
        return result;
    }
}