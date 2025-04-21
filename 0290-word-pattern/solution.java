class Solution {
    public boolean wordPattern(String p, String s) {

        HashMap <Character , String> map1 = new HashMap <>(); 
        HashMap <String ,Character> map2 = new HashMap<>();
        String [] stri = s.split(" ");
         if(p.length() != stri.length ){
            return false;
         }
        for(int i = 0 ; i < p.length();i++){
            String str = stri[i];
            char ch = p.charAt(i);
            if(map1.containsKey(ch) && !(map1.get(ch).equals(str))){
                return false;
            }
            if(map2.containsKey(str) && map2.get(str)!=ch){
                return false;
            }
            map1.put(ch,str);
            map2.put(str,ch);
        }

        return true;
    }
}
