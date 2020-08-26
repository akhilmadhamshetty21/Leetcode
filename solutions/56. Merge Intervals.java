class Solution {
    public int[][] merge(int[][] arr) {
       LinkedList<int[]> merged = new LinkedList<>();
       Arrays.sort(arr,(a,b)->a[0]-b[0]);
        for(int[] interval:arr){
            if(merged.isEmpty() || merged.getLast()[1] <interval[0])
                merged.add(interval);
            else
                merged.getLast()[1]=Math.max(merged.getLast()[1],interval[1]);
        }
        return merged.toArray(new int[merged.size()][]);
        
    }
}
