class Solution {
    public boolean validPalindrome(String s) {
        int l =0 , r=s.length()-1;
        if(r==0)
            return true;
        while(l<r){
            if(s.charAt(l) != s.charAt(r))
                return vp(s,l+1,r) || vp(s,l,r-1);
            l++;
            r--;   
        }
        return true;
        }

    private boolean vp(String str , int l , int r){
        while (l<r){
            if(str.charAt(l) != str.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}
