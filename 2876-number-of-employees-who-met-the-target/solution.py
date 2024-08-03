class Solution(object):
    def numberOfEmployeesWhoMetTarget(self, hours, target):
        x=0
        for i in hours:
            if (i>=target):
                x+=1
        return x
        
