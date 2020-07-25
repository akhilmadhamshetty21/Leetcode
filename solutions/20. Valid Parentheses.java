class Solution {
    public boolean isValid(String s) {
        
       if(s.length()==1)
        {   return false;   }
       
​
        Stack<Character> st=new Stack<Character>();
​
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='[')
            {
                st.push(c);
            }
            else if(c==')' || c=='}' || c==']')
            {
                if(st.isEmpty() ||  balanceValue(c)!=st.pop())
                {
                    return false;
                }
            }
​
        }
        
    return st.isEmpty();    
    }
​
    private static Character balanceValue(char c)
    {
        switch (c)
        {
            case '}':
                return '{';
            case ')':
                return '(';
            case ']':
                return '[';
