class Solution {
    public boolean isAnagram(String s, String t) {
        char[] cs=s.toCharArray();
        char[] ts=t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ts);
        if(Arrays.equals(cs,ts))
           return true;
        else
           return false;
    }
}
