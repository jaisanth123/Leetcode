class Solution(object):
    def maximumWealth(self, accounts):
        maxx=0
        for i in accounts:
            summ=0
            for j in i:
                summ += j
            if(summ>maxx):
                maxx=summ
        return maxx

    
