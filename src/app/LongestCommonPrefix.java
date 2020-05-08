package app;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs ==null || strs.length < 1) {
            return "";
        }

        String p = "";
        String first = strs[0];
        for (int j = 1; j <= first.length(); j++) {
            String t = first.substring(0, j);
            if (isLongestCommonPrefix(strs, t)) {
                p = t;
            }
            else {
                break;
            }
        }
        return p;        
    } 
    
    private boolean isLongestCommonPrefix(String[] strs, String s) {
        for (int i = 1; i <= strs.length - 1; i++) {
            if (!strs[i].startsWith(s)) {
                return false;
            }
        }
        return true;
    }
}