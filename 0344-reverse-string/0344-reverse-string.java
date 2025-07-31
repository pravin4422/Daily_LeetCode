class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int start = 0;
        int end =n-1;
        while(start<end){
            char temp = s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
    // int start=0;
    // int end=s.length-1;
    // while(start<end){
    //     char temp=s[start];
    //     s[start]=s[end];
    //     s[end]=temp;
    //     start++;
    //     end--;
    // }
    // System.out.println(Arrays.toString(s));

    }
}