class Solution {
    public boolean canAliceWin(int[] nums) {

        int S_alice = 0;
        int D_alice =0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(nums[i]<10){
                S_alice +=nums[i];
            }else {
                D_alice +=nums[i];
            }
        }
        if(S_alice > D_alice){
            return true;
        }else if(S_alice < D_alice){
            return true;
        }
        return false;
        
    }
}