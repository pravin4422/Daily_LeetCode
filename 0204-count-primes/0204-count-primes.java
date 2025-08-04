class Solution {
    public static int countPrimes(int n) {
        if (n < 2) return 0;

        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                // Uncomment below line if you want to print primes (disable for large n)
                // System.out.print(i + " ");
                count++;
            }
        }

        // System.out.println(); // newline after printing primes
        return count;
    }

}
