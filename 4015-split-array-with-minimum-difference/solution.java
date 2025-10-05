class Solution {
    // NOTE: changed return type to long
    public long splitArray(int[] nums) {
        int n = nums.length;
        if (n < 2) return -1L;

        // use long for sums to avoid overflow
        long totalSum = 0L;
        for (int v : nums) totalSum += (long) v;

        boolean[] inc = new boolean[n]; // nums[0..i] strictly increasing
        inc[0] = true;
        for (int i = 1; i < n; ++i) inc[i] = inc[i - 1] && (nums[i] > nums[i - 1]);

        boolean[] dec = new boolean[n]; // nums[i..n-1] strictly decreasing
        dec[n - 1] = true;
        for (int i = n - 2; i >= 0; --i) dec[i] = dec[i + 1] && (nums[i] > nums[i + 1]);

        long leftSum = 0L;
        Long minDiff = null;
        for (int i = 0; i <= n - 2; ++i) {
            leftSum += (long) nums[i];
            if (inc[i] && dec[i + 1]) {
                long rightSum = totalSum - leftSum;
                long diff = Math.abs(leftSum - rightSum);
                if (minDiff == null || diff < minDiff) minDiff = diff;
            }
        }

        return (minDiff == null) ? -1L : minDiff.longValue();
    }
}

