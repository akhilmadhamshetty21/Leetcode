class Solution {
    public int removeElement(int[] nums, int val) {
        int i,count=0;
        for(i=0;i<nums.length;i++) {
            if(nums[i]!=val) {
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}
