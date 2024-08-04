class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        x=[]
        for i in range (len(nums)):
            c=0
            for j in range (len(nums)):
                if (nums[i]>nums[j]):
                    c+=1
            x.append(c)
        return x
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        
