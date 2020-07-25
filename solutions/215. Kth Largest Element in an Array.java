class Solution {
    public int findKthLargest(int[] nums, int k) {
        int min=0;
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(nums.length,new ValueComparator());
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        Iterator value=pq.iterator();
        for(int i=0;i<=k-1;i++){
            min=(int)pq.poll();
        }
        return min;
    }
    class ValueComparator implements Comparator<Integer>{ 
​
            public int compare(Integer s1, Integer s2) { 
                if (s1 < s2) 
                    return 1; 
                else if (s1 > s2) 
                    return -1; 
                                return 0; 
                } 
        } 
}
