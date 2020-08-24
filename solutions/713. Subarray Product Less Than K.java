class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)
            return 0;
        int start=0;
        int res=0;
        int product=1;
        for(int i=0;i<nums.length;i++){
            product=product*nums[i];
            while(product>=k){
                product=product/nums[start];
                start++;
            }
            res=res+i-start+1;
        }
        return res;
    }
}
