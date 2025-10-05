class Solution {
    private static final int MOD = 1_000_000_007;

    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;
        long a = countFor(n, m, true);   // starts with '<'
        long b = countFor(n, m, false);  // starts with '>'
        return (int) ((a + b) % MOD);
    }

    // Count arrays of length n over values 1..m where the first relation is
    // '<' if startWithLess==true, otherwise the first relation is '>'.
    private long countFor(int n, int m, boolean startWithLess) {
        long[] cur = new long[m + 1];   // use 1..m
        long[] next = new long[m + 1];

        // base: any single first value
        for (int i = 1; i <= m; ++i) cur[i] = 1L;

        // build length from 1 to n
        for (int pos = 1; pos <= n - 1; ++pos) {
            boolean relationIsLess = (startWithLess ? (pos % 2 == 1) : (pos % 2 == 0));
            // prefix sums of cur
            long[] pref = new long[m + 1];
            pref[0] = 0L;
            for (int i = 1; i <= m; ++i) {
                pref[i] = (pref[i - 1] + cur[i]) % MOD;
            }

            if (relationIsLess) {
                // next[u] = sum_{v < u} cur[v] = pref[u-1]
                for (int u = 1; u <= m; ++u) next[u] = pref[u - 1];
            } else {
                // next[u] = sum_{v > u} cur[v] = pref[m] - pref[u]
                long total = pref[m];
                for (int u = 1; u <= m; ++u) {
                    long val = (total - pref[u]) % MOD;
                    if (val < 0) val += MOD;
                    next[u] = val;
                }
            }

            // move next -> cur and clear next
            for (int i = 1; i <= m; ++i) {
                cur[i] = next[i];
                next[i] = 0L;
            }
        }

        long ans = 0L;
        for (int v = 1; v <= m; ++v) ans = (ans + cur[v]) % MOD;
        return ans;
    }
}



