class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        Map <Character,String> dl = new HashMap<>();
        dl.put('2',"abc");
        dl.put('3',"def");
        dl.put('4',"ghi");
        dl.put('5',"jkl");
        dl.put('6',"mno");
        dl.put('7',"pqrs");
        dl.put('8',"tuv");
        dl.put('9',"wxyz");
        helper (digits , res , 0 , new StringBuilder(),dl);
        return res;
    }
    private void helper (String digits , List<String> res , int index ,StringBuilder comb , Map <Character,String> dl)
{
        if (index == digits.length()){
            res.add(comb.toString());
            return;
        }
        String letters = dl.get(digits.charAt(index));
        for(char ch : letters.toCharArray()){
            comb.append(ch);
            helper(digits,res,index+1,comb,dl);
            comb.deleteCharAt(comb.length()-1);
        }
    }  
}
