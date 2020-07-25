class Solution {
    public int lastStoneWeight(int[] numbers) {
        List<Integer> stones=new ArrayList<Integer>();
       for(int num:numbers){
           stones.add(num);
       }
       Collections.sort(stones);
        Collections.reverse(stones);
        while(stones.size()>1){
            int val1=stones.get(0);
            int val2=stones.get(1);
            if(val1==val2){
                stones.remove(stones.indexOf(val1));
                stones.remove(stones.indexOf(val2));
            }
            if(val1>val2){
                int res=val1-val2;
                stones.remove(stones.indexOf(val1));
                stones.remove(stones.indexOf(val2));
                stones.add(res);
            }
            Collections.sort(stones);
            Collections.reverse(stones);
            
        }
        return (stones.size()==1)?stones.get(0):0;
        
    }
    
}
