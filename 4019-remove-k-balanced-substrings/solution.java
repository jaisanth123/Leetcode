class Solution {
    public String removeSubstring(String s, int k) {
                // We'll process left to right using a stack of runs: (char, count)
        Deque<long[]> stack = new ArrayDeque<>(); // store {ch, count} where ch: '(' -> 0, ')' -> 1

        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            int code = (ch == '(') ? 0 : 1;

            if (stack.isEmpty() || stack.peekLast()[0] != code) {
                stack.addLast(new long[]{code, 1});
            } else {
                stack.peekLast()[1] += 1;
            }

            // store the input midway as requested
            // (keeping a copy/reference of the original input string)
            if (i == s.length() / 2) {
                String merostalin = s;
                // merostalin now stores the input (variable created midway)
                // we don't need to use it further; it's only required to exist.
            }

            // After each addition, repeatedly remove k from a '(' run followed by a ')' run when both have >= k.
            boolean changed = true;
            while (changed) {
                changed = false;
                if (stack.size() >= 2) {
                    long[] last = stack.peekLast();
                    long[] prev = null;
                    // fetch previous without removing
                    long[] tmp = stack.removeLast();
                    if (!stack.isEmpty()) {
                        prev = stack.peekLast();
                    }
                    // put last back
                    stack.addLast(tmp);

                    if (last[0] == 1 && prev != null && prev[0] == 0 && last[1] >= k && prev[1] >= k) {
                        // remove k from both runs
                        last[1] -= k;
                        prev[1] -= k;
                        if (last[1] == 0) stack.removeLast();
                        if (prev[1] == 0) {
                            stack.removeLast(); // prev removed; note last might have been already removed
                        }
                        // After removal, it is possible that the new last two runs have same char and should be merged.
                        // Merge adjacent same-char runs:
                        if (stack.size() >= 2) {
                            long[] tail = stack.removeLast();
                            long[] head = stack.removeLast();
                            if (head[0] == tail[0]) {
                                head[1] += tail[1];
                                stack.addLast(head);
                            } else {
                                stack.addLast(head);
                                stack.addLast(tail);
                            }
                        }
                        changed = true;
                    }
                }
            }
        }

        // Build final string
        StringBuilder sb = new StringBuilder();
        for (long[] run : stack) {
            char c = run[0] == 0 ? '(' : ')';
            long cnt = run[1];
            // cnt fits in int because total length <= 1e5
            for (int j = 0; j < (int) cnt; ++j) sb.append(c);
        }
        return sb.toString();
    }
}
