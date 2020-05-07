package app;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s == null || s.length() < 1) {
            return true;
        }

        Stack<Character> store = new Stack<Character>();
        
        for (int i = 0; i <= s.length() -1; i++) {
            if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) =='}') {
                if (store.empty()) return false;
                if (s.charAt(i) != getClosure(store.pop())) 
                    return false;
            }
            else {
                store.push(s.charAt(i));
            }
        }
        return store.empty();
    }

    private Character getClosure(Character s) {
        switch(s) {
            case '[':
                return ']';
            case '{':
                return '}';
            default:
                return ')';
        }        
    }

    public boolean isValidLeet(String s) {
        if (s == null || s.length() < 1) return true;
        Stack<Character> a = new Stack<Character>();
        int i = 0;
        while( i < s.length()) {
            if (s.charAt(i) == '(') {
                a.push(')');
            }
            else if (s.charAt(i) == '[') {
                a.push(']');
            }
            else if (s.charAt(i) == '{') {
                a.push('}');
            }
            else if (a.isEmpty() || s.charAt(i) != a.pop()) {
                return false;
            }
        }
        return a.isEmpty();
    }
}