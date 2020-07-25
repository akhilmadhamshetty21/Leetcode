class Solution {
    public static int[] listToarray(List<Integer> l)
    {
        int[] num=new int[l.size()];
        for(int i=0;i<l.size();i++)
        {
            num[i]=l.get(i);
        }
        return num;
    }
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        int [] num;
       ArrayList<Integer> l=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
       int k=0;
       int i=0,j=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]==nums2[j])
            {
               l.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j])
                i++;
            else
                j++;
        }
        return l.stream().mapToInt(p->p).toArray();
        //return listToarray(l);
        
    }
}
