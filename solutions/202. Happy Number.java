class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> values=new ArrayList<>();
        while(n>0){
            if(n==1)
                return true;
            else{
                if(!values.contains(n)){
                    values.add(n);
                    n=squaresnumber(n);
                }
                else
                    return false;
            }
        }
        return false;
    }
    public int squaresnumber(int num){
        int d=0,sum=0;
        while(num>0){
            d=num%10;
            sum=sum+d*d;
            num=num/10;
        }
        
        return sum;
    }
}
