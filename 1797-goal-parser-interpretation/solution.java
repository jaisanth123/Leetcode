class Solution {
    public String interpret(String c) {
     StringBuilder str = new StringBuilder ();;
     boolean flag = false;
     for (char ch : c.toCharArray()){
        if(ch <= 'z' && ch >= 'a' || ch <= 'Z' && ch >= 'A'){
            str.append(ch);
            flag = false;}
        if(ch == '(')
            flag = true;
        if(ch ==')' && flag)
            str.append('o');
     }
     return str.toString();

    }
}
