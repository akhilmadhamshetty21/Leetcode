class Solution {
    public int romanToInt(String s) {
        int sum=0,i;
        char str[];
        str=s.toCharArray();
        int max=str.length-1;
        for(i=0;i<=max-1;i++) {
            if(valueOf(str[i])<valueOf(str[i+1])) {
                sum = sum - valueOf(str[i]);
            }
            else
                sum =sum + valueOf(str[i]);
        }
        sum = sum + valueOf(str[max]);
        return sum;  
    }
    public int valueOf(char c) {
        if(c=='I') {
            return 1;
        }
        if(c=='V') {
            return 5;
        }
        if(c=='L') {
            return 50;
        }
        if(c=='X') {
            return 10;
        }
        if(c=='C') {
            return 100;
        }
        if(c=='M') {
            return 1000;
        }
        if(c=='D') {
            return 500;
        }
        return -1;
