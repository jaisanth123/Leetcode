class Solution {
    public String maximumOddBinaryNumber(String s) {
        int z=0;
        int o=0;
        for(int i =0 ;i < s.length();i++){
            if(s.charAt(i)== '1')
                o++;
            else
                z++;
        }
        String ans="";
        for(int i =0 ; i<o-1;i++)
            ans+="1";
        
        for(int i =0 ; i<z;i++)
            ans+="0";
        ans+="1";
    return ans;
    }
}
