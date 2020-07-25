class Solution {
    public int strStr(String haystack, String needle) {
        int size=needle.length();
        
        if(haystack.equals("") && !needle.equals(""))
            return -1;
        if(haystack.equals("") )
            return 0;
        if(haystack.equals(needle))
            return 0;
        for(int i=0;i<haystack.length()-size+1;i++){
            if(haystack.substring(i,i+size).equals(needle))
                return i;
        }
        return -1;
    }
}
