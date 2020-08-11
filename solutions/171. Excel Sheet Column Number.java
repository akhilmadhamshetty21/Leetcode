class Solution {
    public int titleToNumber(String s) {
        int count=0;
        int res=0;
        for(int i=s.length()-1;i>=0;i--){
            res=res+(int)Math.pow(26,count)*((int)s.charAt(i)-64);
            count++;
        }
        return res;
    }
}
