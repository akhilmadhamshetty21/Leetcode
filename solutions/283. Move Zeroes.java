class Solution {
    public void moveZeroes(int[] nums) {
         int index = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i] == 0){
                index++;
            } else if(index > 0){
                nums[i-index] = nums[i];
            }
        }
        
        for(int i=nums.length-1; i>=nums.length-index; i--){
            nums[i] = 0;
        }
 
    }
}
