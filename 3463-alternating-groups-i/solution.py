class Solution(object):
    def numberOfAlternatingGroups(self, colors):
        x=colors*3
        y=x[len(colors)-2:len(x)-len(colors)]
        c=0
        for i in range (0,len(y)-2):
            if (y[i]==y[i+2] and y[i+1] != y[i] ):
                c+=1
        return c
        
