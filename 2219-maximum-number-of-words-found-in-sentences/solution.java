class Solution {
    public int mostWordsFound(String[] sentences) {
        int m =0 ;
        for( String s : sentences){
            String[] words = s.split(" ");
            m=Math.max(m,words.length);
        }
        return m;
    }
}
