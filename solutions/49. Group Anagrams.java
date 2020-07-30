class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
//         List<String> arrs=new ArrayList();
//         for(String str:strs)
//             arrs.add(str);
//         List<List<String>> result=new LinkedList();
//         for(int i=0;i<arrs.size();i++){
//             ArrayList<String> temp=new ArrayList();
//             temp.add(arrs.get(i));
//             for(int j=i+1;j<arrs.size();j++){
//                 if(checkIfAnagram(arrs.get(i),arrs.get(j))){
//                     temp.add(arrs.get(j));
//                     arrs.remove(j);
//                     j=j-1;
           
//                 }
//             }
//             int index=result.indexOf(temp);
//             if(index>=0){
//                 result.get(index).addAll(temp);
//             }
//             else
//                 result.add(temp);
//         }
//         return result;
        List<String> arrs=new ArrayList();
        for(String str:strs)
            arrs.add(str);
        List<List<String>> result=new LinkedList();
        int i=0,j=arrs.size();
        int flag=0;
        while(i<j){
            for(int k=0;k<result.size();k++){
                if(checkIfAnagram(result.get(k).get(0),arrs.get(i))){
                    result.get(k).add(arrs.get(i));
                    flag=1;
                }
                   }
             
                   if(flag==0){
                       ArrayList<String> temp=new ArrayList();
