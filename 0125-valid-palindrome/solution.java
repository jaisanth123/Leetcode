class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder ();
        boolean num = false;
        for(char ch : s.toCharArray()){
            if((ch<='z' && ch>='a') || (ch<='9' && ch >= '0') ){
                str.append(ch);
            }
            else if(ch<='Z' && ch>='A'){
                str.append((char)(ch+32));
            }
        }
        String st = str.toString();
        System.out.println(st);
        int n = st.length();
        int l = 0;
        int r = n-1;
        while(l<r){
            System.out.println(st.charAt(l));
            if(st.charAt(l)!=st.charAt(r))
                return false;
            l++;
            r--;
        }

        return true;
    }
}
