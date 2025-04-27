class Solution {
    public boolean checkTwoChessboards(String c1, String c2) {
        // char a1 = c1.charAt(0);
        // int b1 = Integer.parseInt (String.valueOf(c1.charAt(1)));
        // char a2 = c2.charAt(0);
        // int b2 = Integer.parseInt (String.valueOf(c2.charAt(1)));

        // if(((a1-a2)%2==0 && (b1-b2)%2==0) || ((a1-a2)%2!=0 && (b1-b2)%2!=0))
        //     return true;
        // return false;
        
        int col1 = c1.charAt(0) - 'a';
        int row1 = c1.charAt(1) - '1';
        int col2 = c2.charAt(0) - 'a';
        int row2 = c2.charAt(1) - '1';
        return (col1 + row1) % 2 == (col2 + row2) % 2;
    }


}
