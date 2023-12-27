class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        l = []
        c = 0
        for i in range(len(jewels)):
            l.append(jewels[i])
        for i in range(len(stones)):
            if(stones[i] in l):
                c+=1
        return c
