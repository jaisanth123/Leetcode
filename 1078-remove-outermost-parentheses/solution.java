class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> sta = new Stack<>();
        StringBuilder str = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (!sta.isEmpty()) { 
                    str.append(ch);
                }
                sta.push(ch);
            } else { 
                sta.pop();
                if (!sta.isEmpty()) { 
                    str.append(ch);
                }
            }
        }
        return str.toString();
    }
}



