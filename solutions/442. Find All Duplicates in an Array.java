class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> hset=new HashSet();
        List<Integer> res=new ArrayList();
        for(int num:nums){
            if(!hset.add(num))
                res.add(num);
        }
            return res;
    }
}
