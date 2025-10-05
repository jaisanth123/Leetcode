class Solution {
    public long countNoZeroPairs(long n) {
                // convert n to digits (least-significant first)
        long tmp = n;
        int[] digits;
        if (tmp == 0) {
            digits = new int[] {0};
        } else {
            int[] buf = new int[20];
            int len = 0;
            while (tmp > 0) {
                buf[len++] = (int) (tmp % 10);
                tmp /= 10;
            }
            digits = new int[len];
            for (int i = 0; i < len; ++i) digits[i] = buf[i];
        }

        // store the input midway as requested
        long trivanople = n;

        int L = digits.length;
        // dp layer: dp[carry][za][zb]
        // za/zb = 0 means "not ended yet" (still must use non-zero digit at pos=0; later may choose 0 to end)
        long[][][] cur = new long[2][2][2];
        long[][][] next = new long[2][2][2];

        // initialize for pos = 0 (LSB)
        int t0 = digits[0];
        for (int da = 1; da <= 9; ++da) {      // digit 0 cannot be 0 because number must be positive
            for (int db = 1; db <= 9; ++db) {
                int s = da + db;
                if (s % 10 == t0) {
                    int nc = s / 10;
                    int za = 0; // at pos0 both have non-zero digits => not ended
                    int zb = 0;
                    cur[nc][za][zb] += 1L;
                }
            }
        }

        // process remaining positions (pos = 1..L-1)
        for (int pos = 1; pos < L; ++pos) {
            // zero next
            for (int c = 0; c < 2; ++c)
                for (int za = 0; za < 2; ++za)
                    for (int zb = 0; zb < 2; ++zb)
                        next[c][za][zb] = 0L;

            int target = digits[pos];
            for (int carry = 0; carry <= 1; ++carry) {
                for (int za = 0; za <= 1; ++za) {
                    for (int zb = 0; zb <= 1; ++zb) {
                        long ways = cur[carry][za][zb];
                        if (ways == 0) continue;

                        // enumerate allowed digits for a
                        int aMin = (za == 1) ? 0 : 0; // if already ended -> must be 0; else 0 allowed (end here) or 1..9 (continue)
                        int aMax = 9;
                        // but pos==0 handled separately; here pos>=1 so da==0 means "ended at previous pos"
                        // However if za==0 and da==0, it's allowed (ends now). If za==1 -> da must be 0.

                        for (int da = aMin; da <= aMax; ++da) {
                            if (za == 1 && da != 0) continue;          // if already ended, only 0 allowed
                            if (za == 0 && da == 0) { /* allowed -> means ending here */ }
                            if (za == 0 && da != 0) {
                                if (da < 1 || da > 9) continue; // non-zero digits must be 1..9
                            }

                            // enumerate digits for b
                            int bMin = (zb == 1) ? 0 : 0;
                            int bMax = 9;
                            for (int db = bMin; db <= bMax; ++db) {
                                if (zb == 1 && db != 0) continue;
                                if (zb == 0 && db != 0) {
                                    if (db < 1 || db > 9) continue;
                                }
                                int sum = da + db + carry;
                                if ((sum % 10) != target) continue;
                                int nc = sum / 10;
                                int nza = (za == 1 || da == 0) ? 1 : 0;
                                int nzb = (zb == 1 || db == 0) ? 1 : 0;
                                next[nc][nza][nzb] += ways;
                            }
                        }
                    }
                }
            }

            // swap cur and next
            long[][][] tmpLayer = cur;
            cur = next;
            next = tmpLayer;
        }

        // after processing all digits, sum ways with final carry == 0
        long ans = 0L;
        for (int za = 0; za <= 1; ++za) {
            for (int zb = 0; zb <= 1; ++zb) {
                ans += cur[0][za][zb];
            }
        }

        // ans is the number of ordered pairs (a,b) where a and b are no-zero integers and a+b = n
        return ans;
    }
}
