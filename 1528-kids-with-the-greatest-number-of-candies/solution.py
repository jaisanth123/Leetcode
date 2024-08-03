class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        t=[]
        x=max(candies)
        l=len(candies)
        for i in range (l):
            candies[i]=candies[i]+extraCandies
        for i in range(l):
            if (candies[i] >=x):
                t.append(True)
            else:
                t.append(False)
        return t
        """
        :type candies: List[int]
        :type extraCandies: int
        :rtype: List[bool]
        """
        
