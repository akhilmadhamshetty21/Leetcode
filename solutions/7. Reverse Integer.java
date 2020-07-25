public class Solution {
    public int reverse(int x) {
        int d=0,reverse=0;
        long rev=0;
              //if (digitsLength >= 10) 
            //return 0;
        //System.out.println(x)
        if(x>0){
        while(x>0){
            d=x%10;
            rev=rev*10+d;
            x=x/10;
        }
        }
        else if(x<0){
            while(x<0){
            d=x%10;
            rev=rev*10-d;
            x=x/10;
        }
            rev=-rev;
        }
        if(rev>Integer.MAX_VALUE) {
            return 0;
        }
        if(rev<Integer.MIN_VALUE) {
            return 0;
        }
        reverse=(int) rev;
        return reverse;
    }
}
​
​
