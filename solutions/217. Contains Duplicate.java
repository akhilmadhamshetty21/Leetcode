class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hset=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(hset.add(nums[i]))
                continue;
            else
                return true;
        }
        return false;
    }
}
