class Solution {
    public static int getKey(Map<Integer, Integer> map, int value) {
        for (Integer key : map.keySet()) {
            if (value==map.get(key)) {
                return key;
            }
        }
        return 0;
    }
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hashmap=new HashMap<Integer,Integer>();
        int value=0;
        for(int i=0;i<nums.length;i++){
            if(hashmap.containsKey(nums[i])){
                value=hashmap.get(nums[i]);
                hashmap.put(nums[i],value+1);
            }
            else
                hashmap.put(nums[i],1);
        }
        int ans=getKey(hashmap,1);
        return ans;
    }
        
}
