class Solution {
    private static final int MOD = 1_000_000_007;

    // n may be up to 1e9 -> use long
    public int zigZagArrays(long n, int l, int r) {
        int m = r - l + 1;
        // build A_less and A_greater (0-based indexing)
        long[][] A_less = new long[m][m];
        long[][] A_greater = new long[m][m];

        for (int u = 0; u < m; ++u) {
            for (int v = 0; v < u; ++v) A_less[u][v] = 1L;        // v < u
            for (int v = u + 1; v < m; ++v) A_greater[u][v] = 1L; // v > u
        }

        long resLess = countWithStart(n, m, A_less, A_greater, true);
        long resGreater = countWithStart(n, m, A_less, A_greater, false);
        long ans = (resLess + resGreater) % MOD;
        return (int) ans;
    }

    private long countWithStart(long n, int m, long[][] A_less, long[][] A_greater, boolean startWithLess) {
        long relations = n - 1;
        if (relations <= 0) {
            // n == 1 (not in constraints) -> any value
            return m % MOD;
        }

        // Pair matrix P = A2 * A1 (for startWithLess, A1 = A_less, A2 = A_greater)
        long[][] pair = startWithLess ? multiply(A_greater, A_less, m)
                                      : multiply(A_less, A_greater, m);

        long pairs = relations / 2;
        long[][] pairPow = matPow(pair, pairs, m);

        // extra (the first relation) when relations is odd:
        // if startWithLess, extra = A_less (the last unpaired relation is A_{2k+1} = A1 type)
        long[][] extra = null;
        if ((relations % 2) == 1) extra = startWithLess ? A_less : A_greater;

        // finalMat = (if extra==null) pairPow else extra * pairPow
        long[][] finalMat;
        if (extra == null) finalMat = pairPow;
        else finalMat = multiply(extra, pairPow, m); // IMPORTANT: extra on the LEFT

        // initial vector is all 1s (any first value)
        long[] init = new long[m];
        for (int i = 0; i < m; ++i) init[i] = 1L;

        long[] finalVec = matVecMultiply(finalMat, init, m);

        long ans = 0L;
        for (int i = 0; i < m; ++i) {
            ans = (ans + finalVec[i]) % MOD;
        }
        return ans;
    }

    // matrix multiply A * B
    private long[][] multiply(long[][] A, long[][] B, int m) {
        long[][] C = new long[m][m];
        for (int i = 0; i < m; ++i) {
            for (int k = 0; k < m; ++k) {
                long aik = A[i][k];
                if (aik == 0) continue;
                for (int j = 0; j < m; ++j) {
                    if (B[k][j] == 0) continue;
                    C[i][j] = (C[i][j] + aik * B[k][j]) % MOD;
                }
            }
        }
        return C;
    }

    // fast exponentiation A^e
    private long[][] matPow(long[][] A, long e, int m) {
        long[][] res = new long[m][m];
        for (int i = 0; i < m; ++i) res[i][i] = 1L;
        if (e == 0) return res;
        long[][] base = copyMat(A, m);
        while (e > 0) {
            if ((e & 1L) == 1L) res = multiply(res, base, m);
            base = multiply(base, base, m);
            e >>= 1;
        }
        return res;
    }

    private long[][] copyMat(long[][] A, int m) {
        long[][] C = new long[m][m];
        for (int i = 0; i < m; ++i) System.arraycopy(A[i], 0, C[i], 0, m);
        return C;
    }

    private long[] matVecMultiply(long[][] M, long[] vec, int m) {
        long[] out = new long[m];
        for (int i = 0; i < m; ++i) {
            long sum = 0L;
            for (int j = 0; j < m; ++j) {
                if (M[i][j] == 0) continue;
                sum = (sum + M[i][j] * vec[j]) % MOD;
            }
            out[i] = sum;
        }
        return out;
    }
}

