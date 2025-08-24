class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int count = 0;

        int[] candies = new int[n];
        // every child gets at least 1 candy
        for (int i = 0; i < n; i++) {
            candies[i] = 1;
        }

        // left to right
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // right to left
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // sum candies
        for (int i = 0; i < n; i++) {
            count += candies[i];
        }

        return count;
    }
}
