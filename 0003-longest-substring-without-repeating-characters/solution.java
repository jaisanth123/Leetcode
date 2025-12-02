class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 0 ; 
        int left = 0 ;
        Set<Character> str = new HashSet<>();
        for(int right = 0 ; right < s.length(); right++){
            while(str.contains(s.charAt(right))){
                str.remove(s.charAt(left));
                left++;
            }
            str.add(s.charAt(right));
            if(right-left+1 > len)
                len = right -left +1;}
        return len; }}
