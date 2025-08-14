class Solution {
    public String interpret(String c) {
        StringBuilder str = new StringBuilder();
        boolean flag = false;
        for(char ch : c.toCharArray()){
            if(ch >= 'A' && ch<= 'Z' || ch >='a' && ch<= 'z' ){
                str.append(ch);
                flag=false;
            }
            else if(ch=='(')
                flag = true;
            else if(ch==')' && flag){
                str.append('o');
            }

        }
        return str.toString();
    }
}
