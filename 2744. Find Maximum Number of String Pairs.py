class Solution:
    def maximumNumberOfStringPairs(self, words: List[str]) -> int:
        l = []
        s = ""
        for word in words:
            rev = word[::-1]
            if(rev != word):
                l.append(rev)
       
        print(l)
        c = 0
        for i in range(len(l)):
            if l[i] in words:
                c+=1
        return c//2
        
        
