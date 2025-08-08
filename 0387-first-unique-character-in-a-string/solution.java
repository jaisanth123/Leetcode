class Solution {
    public int firstUniqChar(String s) {
      boolean [] arr = new boolean [26];
      boolean [] arr2 = new boolean [26];

      for(char c : s.toCharArray()){
        if(arr[c-'a'] == false)
            arr[c-'a'] = true;
        else
            arr2[c-'a'] = true;
      }
       
       for(char c : s.toCharArray())
        {  
            if((arr[c-'a']) == true  && arr2[c-'a']==false)
                return s.indexOf(c);
         }
        return -1;


    }

  }
