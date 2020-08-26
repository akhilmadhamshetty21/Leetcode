class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int min=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length && min!=0;i++){
            int lo=i+1,hi=nums.length-1;
            while(lo<hi){
                int sum=nums[i]+nums[lo]+nums[hi];
                if (Math.abs(target - sum) < Math.abs(min))
                    min = target - sum;
                if(sum<target)
                    ++lo;
                else
                    --hi;
            }
        }
        return target-min;
    }
}
