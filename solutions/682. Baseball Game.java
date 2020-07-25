class Solution {
    public int calPoints(String[] ops) {
        Stack stack=new Stack();
        int sum=0;
      
        for(int i=0;i<ops.length;i++){
            
            if(ops[i].equals("C") && !stack.isEmpty()){
                stack.pop();
            }
            else if(ops[i].equals("D")){
                int num=Integer.parseInt(stack.peek().toString()); 
                stack.push(2*num);
            }
            else if(ops[i].equals("+")){
                int num1=Integer.parseInt(stack.pop().toString()); 
                int num2=Integer.parseInt(stack.pop().toString()); 
                stack.push(num2);
                stack.push(num1);
                int sum1=num1+num2;
                stack.push(sum1);
            }
            else
                stack.push(ops[i]);
        }
        while(!stack.isEmpty()){
           int k=Integer.parseInt(stack.pop().toString()); 
           sum=sum+k;
        }
        return sum;
    }
}
