class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hashmap=new HashMap<Integer,Integer>();
        int value=0;
        for(int i=0;i<nums.length;i++){
            if(hashmap.containsKey(nums[i])){
                value=hashmap.get(nums[i]);
                hashmap.put(nums[i],value+1);
            }
            else
                hashmap.put(nums[i],1);
        }
        List<Map.Entry<Integer, Integer> > list = 
               new LinkedList<Map.Entry<Integer, Integer> >(hashmap.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
            public int compare(Map.Entry<Integer, Integer> o1,  
                               Map.Entry<Integer, Integer> o2) 
            { 
                return (o2.getValue()).compareTo(o1.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>(); 
        for (Map.Entry<Integer, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        Iterator hmIterator = temp.entrySet().iterator(); 
        int res[]=new int[k];
        int t=0;
        System.out.println(temp);
        while (t<k ) { 
            Map.Entry mapElement = (Map.Entry)hmIterator.next(); 
            res[t++] = (int)mapElement.getKey(); 
        }
        return res;
    }
