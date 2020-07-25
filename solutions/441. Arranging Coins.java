class Solution {
    public int arrangeCoins(int n) {
        long sum=0;
        int i=0;
        while(sum<=n){
            sum=sum +i;
            i++;
        }
        if(sum>n)
            return i-2;
        else
            return i-1;
       
    }
}
