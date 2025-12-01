class Solution {
    private boolean isVowel(char s)
    {
        return  s=='a' || s=='e' || s=='i' || s=='o' || s=='u';
    
    }
    public int maxVowels(String s, int k) {
        
        char[] arr = s.toCharArray();
        int count = 0 ;
        for(int i = 0; i < k;i++ ){
            if(isVowel(s.charAt(i)))
                count++;
        }
        int maxcount =  count;

        for(int i = k ; i < s.length();i++ ){
               if(isVowel(s.charAt(i))) count++;
               if(isVowel(s.charAt(i-k))) count--;
                if(count>maxcount)
                    maxcount = count;
        }
        return maxcount;
    }
}
