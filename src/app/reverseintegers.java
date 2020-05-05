package app;
public class reverseintegers {
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
};