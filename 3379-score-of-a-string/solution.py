class Solution(object):
    def scoreOfString(self, s):
        asc = 0
        for i in range(len(s) - 1):
            asc += abs(ord(s[i]) - ord(s[i + 1]))
        return asc
