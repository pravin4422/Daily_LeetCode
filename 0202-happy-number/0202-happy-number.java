import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        int m = n;
        
        while (m >= 1) {
            if (m == 1) {
                return true;
            } 
            
            if (set.contains(m)) return false; 
            set.add(m); 
            
            sum = 0;
            String str = String.valueOf(m);  
            for (char i : str.toCharArray()) {
                int c = i - '0';
                sum += c * c;
            }
            
            m = sum;
        }
        return false;
    }
}
