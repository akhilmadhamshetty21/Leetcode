class Solution {
    public int longestOnes(int[] A, int K) {
        int num0=0;
        int start=0;
        int max=Integer.MIN_VALUE;
        for(int j=0;j<A.length;j++){
            if(A[j]==0)
                num0++;
            if(num0==K){
                if(A[start]==0)
                    num0--;
                if(A[j]==0)
                    num0++;
                start++;
            }
            max=Math.max(max,j-start+1);
        }
        return max;
// Brute force approach        
//         for(int i=0;i<A.length;i++){
//                 for(int j=i;j<A.length;j++){
//                     if(A[j]==1){
//                         count++;
//                     }
//                     if(A[j]==0){
//                         if(k==0){
//                             break;
//                         }
//                         else{
//                             k--;
//                             count++;
//                         }
//                     }
//                 }
//                 if(count>max)
//                     max=count;
//                 count=0;
//                 k=K;
            
//         }
//         return max;
