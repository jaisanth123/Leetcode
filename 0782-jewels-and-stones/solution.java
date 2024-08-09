class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap <Character,Integer>hm=new HashMap<>();
        for(int c =0 ; c <jewels.length();c++){
            char i = jewels.charAt(c);
            if (hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }
            else{
                hm.put(i,1);
            }
        }
        int c=0;
        for(int j=0;j<stones.length();j++){
            char t= stones.charAt(j);
            if(hm.containsKey(t)){
                c++;
            }
        }
        return c;
        
    }
}
