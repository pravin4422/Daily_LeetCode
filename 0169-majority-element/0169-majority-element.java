class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n =nums.length;
    //     int[] returns = new int[n+2];
    //    int  count=0;
    //    for(int i : nums){
    //     returns[i]=count++;
    //    } 
    //    int max = Integer.MIN_VALUE;
    //    for(int i: nums){
    //     // if(n/2>i){
    //     //     return i;
    //     // }
    //     int cur =i;
    //     max=Math.max(max,cur);
        
    //    }
       return nums[n/2];
    }
}