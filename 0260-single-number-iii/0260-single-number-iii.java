class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (set.contains(i)) {
                set.remove(i);  
            } else {
                set.add(i);    
            }
        }

       
        int[] arr2 = set.stream().mapToInt(Integer::intValue).toArray();
        return arr2;
    }
}
