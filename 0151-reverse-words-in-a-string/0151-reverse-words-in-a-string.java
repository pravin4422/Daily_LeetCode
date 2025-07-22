class Solution {
    public String reverseWords(String s) {
        String []name = s.trim().split("\\s+");
        int start = 0;
        int end = name.length-1;

        while(start<end){
            String temp=name[start];
            name[start]=name[end];
            name[end]=temp;
            start++;
            end--;
        }
        
        return String.join(" ",name);
    }
}