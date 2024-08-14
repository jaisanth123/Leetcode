class Solution {
    public int findPermutationDifference(String s, String t) {
        int x =0;
        for(int i =0 ; i < s.length();i++){
            int y = 0;
            for (int j = 0 ; j <t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    y=Math.abs(i-j);
                 
                    break;
            }
        }
           x+=y;
        }
        return x;
    }
}
