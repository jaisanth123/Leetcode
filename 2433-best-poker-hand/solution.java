class Solution {
    public String bestHand(int[] ranks, char[] suits) {
    HashMap<Integer,Integer> map1 = new HashMap<>();
    HashMap<Character,Integer> map2 = new HashMap<>();

    for(int i : ranks){
        map1.put(i,map1.getOrDefault(i,0)+1);
    }
     for(char i : suits){
        map2.put(i,map2.getOrDefault(i,0)+1);
    }

    if(map2.containsValue(5))
        return "Flush";

    for(int c : map1.values()){
        if(c>=3)
            return "Three of a Kind";
    }
    for(int c : map1.values()){
        if(c==2)
            return "Pair";

    }
    return "High Card";
    }
}
