package app;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length < 1) return 0;
        
        int len = nums.length;
        for(int i = 0; i < len; i++) {
            if (nums[i] == val) {
                int c = i + 1;
                while (c <= nums.length -1) {
                    nums[c - 1] = nums[c];
                    nums[c] = 0;
                    c++;
                }
                len--;
                i--;
            }
        }
        return len;
    }
}