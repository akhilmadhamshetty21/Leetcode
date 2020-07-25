class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = Arrays.stream(nums).sum();
        if (sum % k > 0) return false;
        int target=sum/k;
        Arrays.sort(nums);
        int rows=nums.length-1;
        if(nums[rows]>target)
            return false;
        while(rows>=0 && nums[rows]==target){
            rows--;
            k--;
        }
        return doPartition(new int[k],nums,rows,target);
    }
    private boolean doPartition(int[] buckets,int[] nums,int rows,int target){
        if(rows<0)
            return true;
        int v=nums[rows--];
        for(int i=0;i<buckets.length;i++){
            if(buckets[i]+v<=target){
                buckets[i]+=v;
                if(doPartition(buckets,nums,rows,target))
                    return true;
                buckets[i]=buckets[i]-v;
            }
            if(buckets[i]==0)
                break;
        }
        return false;
        
    }
}
