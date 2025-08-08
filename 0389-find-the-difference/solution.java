class Solution {
    public char findTheDifference(String s, String t) {
        char x = 0;

        for(int i = 0  ; i < s.length() ;  i++){
            x^=s.charAt(i);
            x^=t.charAt(i);
        }
        x^= t.charAt(t.length()-1);    
        return x;
    }
}
