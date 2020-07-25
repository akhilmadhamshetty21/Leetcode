class Solution {
    public boolean isPalindrome(String s) {
        String s1="";
        StringBuilder input=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if((Character.isDigit(s.charAt(i))) || Character.isLetter(s.charAt(i)))
                s1=s1+""+s.charAt(i);
        }
        input.append(s1);
        StringBuilder s2=input.reverse();
        if(s1.equalsIgnoreCase(s2.toString()))
            return true;
        return false;
    }
}
