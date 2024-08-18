class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String x="" , y="";
        for ( int i = 0 ; i < word1.length;i++){
            x=x+word1[i];
        }
        for(int j=0;j<word2.length;j++){
            y=y+word2[j];
        }
    return x.equals(y);
    }
}
