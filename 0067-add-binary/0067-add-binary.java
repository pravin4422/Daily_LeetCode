import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger aa = new BigInteger(a, 2); // parse as binary
        BigInteger bb = new BigInteger(b, 2);
        BigInteger sum = aa.add(bb); // add
        return sum.toString(2); // convert back to binary
    }
}
