class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        l=[]
        for i in range(len(arr)):
            if(arr.count(arr[i])==1):
                l.append(arr[i])
        print(l)
        if(len(l)<k):
            return ""
        else:
            return l[k-1]
