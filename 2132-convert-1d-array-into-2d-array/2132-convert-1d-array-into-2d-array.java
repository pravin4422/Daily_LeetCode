class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int s = original.length;

        
        if (s != m * n) {
            return new int[0][0];
        }

        int[][] values = new int[m][n];
        int k = 0;

        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                values[i][j] = original[k++];
            }
        }
        return values;
    }
}
