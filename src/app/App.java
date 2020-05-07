package app;

import java.time.Duration;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) throws Exception {
        
        LocalDateTime start = LocalDateTime.now();
        Execute();        
        LocalDateTime end = LocalDateTime.now();

        Duration totalElapsed = Duration.between(start, end);
        System.out.println(String.format("Time take : - %s milliseconds", totalElapsed.toMillis()));
    }

    private static void Execute() {
        //ReverseInteger rev = new ReverseInteger();
        //int output = rev.reverse(12345);
        //int output = rev.reverseLeet(12345);
        
        // PalindromeNumber p = new PalindromeNumber();
        // boolean output = p.isPalindrome(10);

        ValidParentheses v = new ValidParentheses();
        String input = System.console().readLine();
        boolean output = v.isValid(input);
        System.out.println(output);
    }
}