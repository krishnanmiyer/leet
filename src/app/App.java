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

        // ValidParentheses v = new ValidParentheses();
        // String input = System.console().readLine();
        // boolean output = v.isValid(input);
        
        // LongestCommonPrefix p = new LongestCommonPrefix();
        // String output = p.longestCommonPrefix(new String[] {"flower"});
        /*
        MergeSortedLists m = new MergeSortedLists();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode output = m.mergeTwoLists(l1, l2);

        while(output.next != null) {
            System.out.println(output.val);
            output = output.next;
        }
        */
        RemoveElement r = new RemoveElement();
        int output = r.removeElement(new int[] {0,1,2,2,3,0,4,2}, 2);
        System.out.println(output);

    }
}