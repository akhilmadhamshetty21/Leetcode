class Solution {
    public void sortColors(int[] nums) {
       int num0=getCount(0,nums);
        int num1=getCount(1,nums);
        int num2=getCount(2,nums);
        
    for(int i = 0; i < num0; ++i)
        nums[i] = 0;
    for(int i = 0; i < num1; ++i)
        nums[num0+i] = 1;
    for(int i = 0; i < num2; ++i)
        nums[num0+num1+i] = 2;
        
    }
    private int getCount(int num,int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num)
                count++;
        }
        return count;
    }
}
