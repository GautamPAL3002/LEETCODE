class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();  
        int add = 0;  
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);  
            } else {  
                if (!stack.isEmpty()) {
                    stack.pop(); 
                } else {
                    add++;  
                }
            }
        }return add + stack.size();
    }
}
