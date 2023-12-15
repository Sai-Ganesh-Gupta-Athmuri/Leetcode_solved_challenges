class Solution:
    def frequencySort(self, n: List[int]) -> List[int]:
        l=[]
        for i in range(0,len(n)):
            l.append(n.count(n[i]))
        for i in range(0,len(n)):
            for j in range(0,len(n)-1):
                if(l[j]==l[j+1] and n[j]<n[j+1]):
                    temp = n[j]
                    n[j] = n[j+1]
                    n[j+1] = temp
                if(l[j]>l[j+1]):
                    temp = l[j]
                    l[j] = l[j+1]
                    l[j+1] = temp

                    temp = n[j]
                    n[j] = n[j+1]
                    n[j+1] = temp
        return n                     
