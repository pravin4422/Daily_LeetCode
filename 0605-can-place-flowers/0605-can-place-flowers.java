class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int d = flowerbed.length;
         
        for (int i = 0; i < d; i++) { // ✅ loop over flowerbed length
            // ✅ check bounds and use i instead of n
            if ((flowerbed[i] == 1) || (i > 0 && flowerbed[i - 1] == 1) ||  (i < d - 1 && flowerbed[i + 1] == 1)) {
                continue; // can't plant here
            }
            flowerbed[i] = 1; // plant here
            n--; // planted one
            if (n == 0) return true; // all flowers planted
        }
        return n <= 0;
    }
}
