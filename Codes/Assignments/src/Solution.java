class Solution {
    public int reverse(int x) {
        int reverseNum = 0;

        while (x != 0) {
            int digit = x % 10;

            // Check for overflow before updating reverseNum
            if (reverseNum > Integer.MAX_VALUE / 10 || (reverseNum == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow case
            }
            if (reverseNum < Integer.MIN_VALUE / 10 || (reverseNum == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Underflow case
            }

            reverseNum = reverseNum * 10 + digit;
            x = x / 10;
        }

        return reverseNum;
    }
}
