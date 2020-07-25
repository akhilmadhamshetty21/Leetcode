class Solution {
    Map<Integer,List<Integer>> adjmatrix=new HashMap<>();
    int[] color;
    public int[] gardenNoAdj(int N, int[][] paths) {
        color=new int[N];
        for(int i=1;i<=N;i++){
            adjmatrix.putIfAbsent(i,new ArrayList<>());
        }
        for(int[] path:paths){
            List<Integer> list=adjmatrix.get(path[0]);
            list.add(path[1]);
            adjmatrix.put(path[0],list);
        }
        for(int i=0;i<N;i++){
            color[i]=getValidColor(i+1,N);
        }
        return color;
    }
    public int getValidColor(int index,int N){
        List<Integer> neighbours=adjmatrix.get(index);
        neighbours.add(adjmatrix)
        System.out.println(neighbours);
        int flag=0;
        for(int i=1;i<=N;i++){
           flag=0;
           for(int j=0;j<neighbours.size();j++){
               if(color[neighbours.get(j)-1]==i){
                   System.out.println(color[neighbours.get(j)-1]);
                   flag=1;
                   break;
               }
           }
            if(flag==0)
                return i;
        }
        return -1;
    }
   
}
