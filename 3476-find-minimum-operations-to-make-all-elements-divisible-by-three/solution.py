class Solution(object):
    def minimumOperations(self, nums):
        s=0
        for i in nums:
            if(i%3!=0):
                s+=1
        return s 
        
