class Solution {
    public String convertToTitle(int cn) {
        StringBuilder str = new StringBuilder();
        while(cn>0){
            cn--;
            str.append((char)(cn%26+'A'));
            cn/=26;
        }

        return str.reverse().toString();
    }
}


