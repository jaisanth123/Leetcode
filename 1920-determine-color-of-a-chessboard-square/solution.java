class Solution {
    public boolean squareIsWhite(String c) {
        char a = c.charAt(0);
        int b = Integer.parseInt (String.valueOf(c.charAt(1)));
        int a1 = a-'a';
        if((a1%2==0 && b%2==0) || (a1%2!=0 && b%2!=0))
            return true ;
        return false;
}}
