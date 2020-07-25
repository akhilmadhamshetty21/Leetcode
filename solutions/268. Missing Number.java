class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> hset=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            hset.add(nums[i]);
        }
        for(int i=0;i<=nums.length;i++){
            if(!hset.contains(i))
                return i;
        }
        return 0;
    }
}
