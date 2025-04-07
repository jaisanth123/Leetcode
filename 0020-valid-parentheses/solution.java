class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack <>();
        //char [] ch = str.newCharArray(s);
        
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='['){
                    stack.push(s.charAt(i));
            }
            if (s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']'){
                if(stack.isEmpty()){
                    return false;
                }
                if((s.charAt(i)==')'&& stack.pop() != '(')||
                    (s.charAt(i)==']'&& stack.pop() != '[')||
                    (s.charAt(i)=='}'&& stack.pop() != '{')                
                ){
                    return false;
                }


                }
        }
        return stack.isEmpty();
        
    }
}
