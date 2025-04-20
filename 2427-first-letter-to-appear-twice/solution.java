class Solution {
    public char repeatedCharacter(String s) {
       ArrayList<Character> list = new ArrayList <>();
       for(char ch:s.toCharArray()){
            if(list.contains(ch)){
                return ch;
            }
            else{
                list.add(ch);
            }}
    return 0;
    }
}
