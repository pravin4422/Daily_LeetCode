class Solution {
    public boolean judgeSquareSum(int c) {
        int start =0;
        int end = (int)Math.sqrt(c);
        
        while(start<=end){
           long value = (long)start*start + (long) end*end;
           if(value==c){
            return true;
           }else if(value<c){
            start++;
           }else if(value>c){
            end--;
           }
        }
        return false;
        
    }
}