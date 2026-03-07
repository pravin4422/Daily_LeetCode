class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n= nums.length;
        double max=1;
        double start =0;
        for(int i=0;i<k;i++){
            start +=nums[i];
        }
        max = start/k;

        for(int i =k;i<n;i++){
            start=start+nums[i]-nums[i-k];
            double div = start/k;
            max = Math.max(div,max);
        }
        return max;
    }
}