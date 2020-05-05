package app;
public class ReverseInteger {
    public int reverse(int x) {
        String input = String.valueOf(x);
        StringBuilder result = new StringBuilder();
        try {
            for (int i = input.length() -1; i >= 0; i--) {
                if (i == 0 && input.charAt(i) == '-') {
                    result.insert(0,"-");
                    continue;
                }
                result.append(input.charAt(i));
            }
            Integer output = Integer.parseInt(result.toString());
            return output;
        }
        catch(NumberFormatException ex) {
            return 0;
        }
    }

    public int reverseLeet(int x) {
        if(x == 0 || x == Integer.MIN_VALUE){
            return 0;
        }
        
        long res = 0;
        
        while(x != 0){
            int digit = x % 10;
            x /= 10;
            
            res = res*10 + digit;
            
            if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE){
                return 0;
            }
        }
        
        return (int) res;
    }
};