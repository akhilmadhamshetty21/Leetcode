class Solution{
    public int twoCitySchedCost(int[][] costs) {
        int sumA=0;
        int N=costs.length/2;
        int minCost=0;
        int[] sumB=new int[costs.length];
        for(int i=0;i<costs.length;i++){
            sumA=sumA+costs[i][0];
            sumB[i]=costs[i][1]-costs[i][0];
        }
        
        Arrays.sort(sumB);
        for(int i = 0; i < N; i++){
            minCost += sumB[i];
        }
        return minCost+sumA;
    }
}
