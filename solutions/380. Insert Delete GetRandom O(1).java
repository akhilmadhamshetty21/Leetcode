class RandomizedSet {
    ArrayList<Integer> list;
    HashMap<Integer,Integer> hmap;
    java.util.Random rand=new java.util.Random();;
    
    /** Initialize your data structure here. */
    public RandomizedSet() {
        list=new ArrayList<Integer>();
        hmap=new HashMap<Integer,Integer>();
        
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(list.contains(val))
            return false;
        hmap.put(val,list.size());
        list.add(val);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!hmap.containsKey(val))
            return false;
        int ix=hmap.get(val);
        if(ix<list.size()-1){
            int value=list.get(list.size()-1);
            list.set(ix,value);
            hmap.put(value,ix);
        }
        hmap.remove(val);
        list.remove(list.size()-1);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));        
