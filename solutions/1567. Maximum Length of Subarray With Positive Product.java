class Solution {
    public int getMaxLen(int[] nums) {
        int res = 0;
        int startIndex = 0;
        boolean isNegative = false;
        int negativeIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                startIndex = i + 1;
                negativeIndex = -1;
                isNegative = false;
            } else {
                if (nums[i] < 0) {
                    isNegative = !isNegative;
                    if (negativeIndex == -1)
                        negativeIndex = i;
                }
                res = Math.max(res, isNegative ? i - negativeIndex : i - startIndex + 1);
            }
        }
        
        return res;
    }
}
