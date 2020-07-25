class Solution {
    public int countPrimes(int n) {
        int count =0;
        for(int i=2;i<n;i++){
            if(isPrime(i))
                count++;
        }
        return count;    
    }
    public boolean isPrime(int num){
        int count=(int)Math.sqrt(num);
        for(int i=2;i<=count;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}
