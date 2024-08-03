class Solution(object):
    def findWordsContaining(self, words, x):
        t=[]
        for i in range (len(words)):
            if x in words[i]:
                t.append(i)
        
        return t

            
        """
        :type words: List[str]
        :type x: str
        :rtype: List[int]
        """
        
