class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hashmap=new HashMap<Character,Integer>();
        int value=0;
        for(int i=0;i<s.length();i++){
            if(hashmap.containsKey(s.charAt(i))){
                value=hashmap.get(s.charAt(i));
                hashmap.put(s.charAt(i),value+1);
            }
            else
                hashmap.put(s.charAt(i),1);
        }
        List<Character> list = new ArrayList<Character>(hashmap.keySet());
        Collections.sort(list,(a,b)->hashmap.get(b)- hashmap.get(a));
        String str="";
        for(int i=0;i<list.size();i++){
            for(int j=0;j<hashmap.get(list.get(i));j++)
                str=str+list.get(i);
        }
        return str;
    }
}
