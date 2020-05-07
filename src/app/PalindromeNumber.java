package app;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < Integer.MIN_VALUE || x > Integer.MAX_VALUE || x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revX = reverseInt(x);
        return (x == revX);
    }

    private int reverseInt(int x) {
        int result = 0;
        int y = x;
        while (y !=0) {
            int digit = y % 10;
            y /= 10;
            result = result * 10 + digit;
        }
        return result;
    }
}