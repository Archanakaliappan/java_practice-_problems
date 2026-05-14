class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;   // get last digit (works for negative too)
            x = x / 10;           // remove last digit

            // check overflow before adding digit
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;  // overflow on positive side
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;  // overflow on negative side
            }

            rev = rev * 10 + digit;
        }
        return rev;
    }
}
