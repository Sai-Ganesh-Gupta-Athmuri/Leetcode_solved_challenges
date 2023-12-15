class Solution:
    def minimumAbsDifference(self, arr: List[int]) -> List[List[int]]:
        l=[]
        l1 = []
        arr = sorted(arr)
        diff = abs(arr[0] - arr[1])

        for i in range(len(arr)-1):
            if(diff>abs(arr[i]-arr[i+1])):
                diff = abs(arr[i] - arr[i+1])

        for i in range(len(arr)-1):
            if(abs(arr[i] - arr[i+1]) == diff):
                l1.append(arr[i])
                l1.append(arr[i+1])
                l.append(l1)
                l1=[]
        return l

