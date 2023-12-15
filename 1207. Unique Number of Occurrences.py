class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        d = {}
        for i in arr:
            if i in d:
                d[i] += 1
            else:
                d[i] = 1
        print(d)
        values = list(d.values())
        for i in range(len(values)):
            if(values.count(values[i]) > 1):
                return False
        return True
            
