class Solution {
    public boolean detectCapitalUse(String word) {
        int flag=0,count=0;
        for(char ch:word.toCharArray()){
            if(Character.isUpperCase(ch))
                count++;
        }
        if(count==word.length())
            return true;
        if(word.equals(word.toLowerCase()))
            return true;
        if(count==1 && Character.isUpperCase(word.charAt(0)))
            return true;
        return false;
    }
}
