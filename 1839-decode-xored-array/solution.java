class Solution {
    public int[] decode(int[] n, int first) {
        int arr[] = new int [n.length + 1];
        arr[0] = first;
        for(int i = 0 ;i < n.length ; i++)
            arr[i+1] = arr[i] ^ n[i];

        return arr;
    }
}
