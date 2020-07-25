class Solution {
    public String removeDuplicates(String S) {
        Stack stack=new Stack();
        String str="";
        for(int i=0;i<S.length();i++){
            stack.push(S.charAt(i));
        }
        while(stack.size()!=1 && stack.size()!=0){
            char ch=(char)stack.pop();   
            if(ch==(char)stack.peek()){
                stack.pop();
                continue;
            }
            str= ""+ch+str;
        }
        if(stack.size()==1)
            str= ""+stack.pop()+str;
       if(str.equals(S)){
           return str;
       }
       else{
           str=removeDuplicates(str);
           
       }
        return str;
    }
   
}
