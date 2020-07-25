class Solution {
    public int[][] kClosest(int[][] points, int K) {
        int[] distance =new int[points.length];
        int min=0;
        for(int i=0;i<points.length;i++){
            distance[i]=dist(points[i]);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(5,new ValueComparator());
        for(int i=0;i<distance.length;i++){
            pq.add(distance[i]);
        }
        System.out.println(pq);
        Iterator value=pq.iterator();
        for(int i=0;i<=K-1;i++){
            min=(int)pq.poll();
        }
        int[][] res=new int[K][2];
        int t = 0;
        System.out.println(min);
        for (int i = 0; i < points.length; i++)
            if (dist(points[i]) <= min && t<K)
                res[t++] = points[i];
        return res;
    }
    class ValueComparator implements Comparator<Integer>{ 
              
            
            public int compare(Integer s1, Integer s2) { 
                if (s1 > s2) 
                    return 1; 
                else if (s1 < s2) 
                    return -1; 
                                return 0; 
                } 
        } 
         public int dist(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}
