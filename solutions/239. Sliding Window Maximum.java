class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> res=new ArrayList();
        int start=0;
        int max=getMax(nums,0,k);
        res.add(max);
        for(int end=k;end<nums.length;end++){
            if(nums[start]==max){
                max=getMax(nums,start+1,end);
            }
            if(nums[end]>max)
                max=nums[end];
            res.add(max);
            start++;
        }
        return res.stream().mapToInt(i->i).toArray();
    }
    private int getMax(int[] nums,int start,int end){
        int max=Integer.MIN_VALUE;
        for(int i=start;i<end;i++){
            if(nums[i]>=max)
                max=nums[i];
        }
        return max;
    }
}
