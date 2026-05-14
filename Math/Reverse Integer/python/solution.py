
            // check overflow before adding digit
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 
        while (x != 0) {
            int digit = x % 10;   // get last digit (works for negative too)
            x = x / 10;           // remove last digit
    public int reverse(int x) {
        int rev = 0;
class Solution {
