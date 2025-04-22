class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
           HashMap<String ,List<String>> map = new HashMap<>();
           for(String s : strs){
                char[] cha = s.toCharArray();
                Arrays.sort(cha);
                String str = new String(cha);
                if(!(map.containsKey(str))){
                    map.put(str,new ArrayList<>());
                }
                map.get(str).add(s);
           }
           List<List<String>> res = new ArrayList<> (map.values());
           return res;
    }
}
