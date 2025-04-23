class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack <>();
        for(char i : s.toCharArray()){
            if(i == '('||i == '['||i == '{')
                stack.push(i);
            else if(i == ')'||i == ']'||i == '}'){
                if(stack.isEmpty())   
                    return false;
                if ((i ==')' && stack.pop() !='(')||
                (i ==']' && stack.pop() !='[')||
                (i =='}' && stack.pop() !='{'))
                    return false ;

            }

        }
        return stack.isEmpty();
       
        
    }
}
