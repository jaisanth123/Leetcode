class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder ();
        char [] arr1 = a.toCharArray();
        char [] arr2 = b.toCharArray();

        int i = arr1.length-1 , j = arr2.length-1;
        int carry=0;
        while(i >=0 || j >=0 || carry > 0 ){
            int aNum = i>=0 ? arr1[i]-'0':0;
            int bNum = j>=0 ? arr2[j]-'0':0;
            int sum = aNum + bNum + carry;
            int digit = sum %2;
            carry = sum /2 ;
            i--;
            j--;

            sb.append((char) (digit+'0'));
        }
        return sb.reverse().toString();
    }
}
