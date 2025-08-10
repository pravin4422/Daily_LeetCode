class Solution {
    public double myPow(double x, int n) {
        
        // double value = Math.pow(x,n);
        // return value;

        // double value =1;
        // if (n > 0) { 
        //     for (int i = 0; i < n; i++) {
        //         value = value * x;
        //     }
        // } 
        // else if (n < 0) { 
        //     for (int i = 0; i < -n; i++) {
        //         value = value * x;
        //     }
        //     value = 1 / value;
        // }
        // if n == 0, value remains 1
         long N = n; // use long to handle overflow when n = Integer.MIN_VALUE
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        
        double result = 1.0;
        while (N > 0) {
            if ((N & 1) == 1) { // if N is odd
                result *= x;
            }
            x *= x;
            N >>= 1; // divide N by 2
        }
        
        return result;
    }
}