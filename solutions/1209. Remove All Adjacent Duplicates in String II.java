class Solution {
    class Data{
        char c;
        int count;
        Data( int count,char c){
            this.c=c;
            this.count=count;
        }
    }
    public String removeDuplicates(String s, int k) {
        Deque<Data> stack = new ArrayDeque<>();
        stack.push(new Data(0,'#'));
​
        for (char c : s.toCharArray()) {
            if (stack.peek().c != c) {
                stack.push(new Data(1, c));
            } else {
                int count = stack.peek().count + 1;
                stack.pop();
                if (count != k)
                    stack.push(new Data(count, c));
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            for (int i = 0; i < stack.peek().count; i++) {
                stringBuilder.append(stack.peek().c);
            }
            stack.pop();
        }
        return stringBuilder.reverse().toString();
       }
        
    }
​
