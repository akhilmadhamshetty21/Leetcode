class Solution {
    public void rotate(int[] nums, int k) {
        int temp=0;
        int temp1=0;
        int num=0;
        while(num<k){
        num++;    
        temp=nums[0];
        temp1=temp;
        int size=nums.length;
        nums[0]=nums[size-1];
        for(int i=1;i<nums.length;i++){
            temp1=nums[i];
            nums[i]=temp;
            temp=temp1;
        }
    }
    }
}
