class Solution {
    public int[] finalPrices(int[] prices) {
        // List<Integer> result=new ArrayList<Integer>();
        int[] result=new int[prices.length];
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]>=prices[j]){
                    result[i]=prices[i]-prices[j];
                    break;
                }
                result[i]=prices[i];
            }
        }
        result[prices.length-1]=prices[prices.length-1];
        return result;
    }
}
