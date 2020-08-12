class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int start=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                start=i+1;
            }
            max=Math.max(max,i-start+1);
        }
        return max;
    }
}
