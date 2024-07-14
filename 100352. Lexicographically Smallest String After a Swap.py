class Solution:
    def getSmallestString(self, s: str) -> str:
        l=[]
        for i in range(0,len(s) - 1):
            if((int(s[i]) %2 == 0 and int(s[i+1])%2 == 0) or (int(s[i]) %2 != 0 and int(s[i+1])%2 != 0)):
                if(int(s[i]) > int(s[i+1])):
                    l.append(s[0:i]+s[i+1:i+2]+s[i:i+1]+s[i+2:])
        print(*l)
        if(len(l) == 0): return s
        min = int(s)
        for i in l:
            if(int(i) < int(min)): min = i
        return min

        
