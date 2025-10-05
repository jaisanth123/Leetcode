class Solution {
    public int longestSubsequence(int[] nums) {
          int n = nums.length;
        int totalXor = 0;
        for (int v : nums) totalXor ^= v;

        int[] drovantila = nums; 

        if (totalXor != 0) {
            return n;         
        }

        for (int v : drovantila) {
            if (v != 0) return n - 1;
        }
        return 0;
    }
}
