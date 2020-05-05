import java.util.*;
public class reverseintegers {
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.reverse(-123));
    }
}

class Solution {
    public int reverse(int x) {
        var input = String.valueOf(x);
        var result = new StringBuilder();
        try {
            for (int i = input.length() -1; i >= 0; i--) {
                if (i == 0 && input.charAt(i) == '-') {
                    result.insert(0,"-");
                    continue;
                }
                result.append(input.charAt(i));
            }
            var output = Integer.parseInt(result.toString());
            return output;
        }
        catch(NumberFormatException ex) {
            return 0;
        }
    }
};