class Solution {
    public void setZeroes(int[][] matrix) {
        
        
        ArrayList<Integer> rows=new ArrayList();
        ArrayList<Integer> columns=new ArrayList();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    columns.add(j);
                }      
            }
        }
        System.out.println(rows);
        System.out.println(columns);
        for(int i=0;i<rows.size();i++){
            for(int j=0;j<matrix[rows.get(i)].length;j++){
                matrix[rows.get(i)][j]=0;
            }
        }
        for(int i=0;i<columns.size();i++){
            for(int j=0;j<matrix.length;j++){
                matrix[j][columns.get(i)]=0;
            }
        }
       for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[i].length;j++){
               System.out.println(matrix[i][j]);
           }
       }
        
    }
}
