class Solution(object):
    def runningSum(self, nums):
        l=len(nums)
        a=[0]*l
        s=0
        for i in range(l):
            a[i]=nums[i]+s
            s+=nums[i]
        return a

