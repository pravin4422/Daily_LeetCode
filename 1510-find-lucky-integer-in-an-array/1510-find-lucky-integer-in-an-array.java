class Solution {
    public int findLucky(int[] arr) {
        int[] count = new int[501]; 
        for (int i : arr) {
            count[i] += 1;
        }

        int result = -1;
        for (int i = 1; i < count.length; i++) {
            if (count[i] == i) {
                result = i; 
            }
        }
        return result;
    }
}
