class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindrome
        // Also, if number ends with 0 but isn't 0, it can't be a palindrome (e.g., 10, 100)
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;

        // Reverse only half of the number
        while (x > reversed) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        // If x is even-length → x == reversed
        // If x is odd-length → x == reversed/10 (middle digit doesn't matter)
        return (x == reversed || x == reversed / 10);
    }
}
