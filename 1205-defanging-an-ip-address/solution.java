class Solution {
    public String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();
        for(char i: address.toCharArray()){
                if(i == '.')
                    str.append("[.]");
                else
                    str.append(i);
        }
        return str.toString();
    }
}
