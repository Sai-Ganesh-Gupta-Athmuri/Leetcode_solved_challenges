class Solution:
    def addToArrayForm(self, num: List[int], k: int) -> List[int]:
        a = 0
        for i in range(len(num)):
            a = a + num[i]*(10**(len(num)-i-1))
        r = a + k
        l=[]
        while(r!=0):
            rem = r%10
            l.append(rem)
            r = r//10
        return l[::-1]
        
