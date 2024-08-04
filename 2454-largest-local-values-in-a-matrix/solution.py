class Solution(object):
    def largestLocal(self, grid):
        n = len(grid)
        ml = [[0] * (n - 2) for _ in range(n - 2)]
        for i in range(n - 2):
            for j in range(n - 2):
                lm = 0
                for k in range(i, i + 3):
                    for l in range(j, j + 3):
                        lm = max(lm, grid[k][l])
                ml[i][j] = lm
            
        return ml

