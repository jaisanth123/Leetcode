class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> res = new ArrayList<>();
        int place = 1;
        while (n!=0){
            int digit = n%10;
            int value = digit*place;
            if(value!=0)
                    res.add(value);
            n/=10;
            place*=10;
        }
        Collections.reverse(res);
        int arr [] = new int [res.size()];
        for(int i = 0 ;i < res.size();i++){
            arr[i] = res.get(i);
        }
        return arr;
    }
}
