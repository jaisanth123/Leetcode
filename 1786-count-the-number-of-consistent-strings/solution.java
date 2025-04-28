class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int [] arr = new int[26];
        int count=0;
        for(char i  : allowed.toCharArray())
            arr[i-'a']=1;
        boolean flag = false;
        for(String s : words){
            for(char c : s.toCharArray()){
                if(arr[c-'a'] == 0){
                    flag=false;
                    break;}
                else
                flag=true;
                    
            }
            if(flag)
                count++;
        }
        return count;
        
    }
}
