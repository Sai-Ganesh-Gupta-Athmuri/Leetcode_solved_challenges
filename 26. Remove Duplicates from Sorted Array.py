def removeDuplicates(self, nums: List[int]) -> int:
    d={}
    for i in nums:
        if i not in d:
            d[i] = 1
        else:
            d[i]+=1
    l = sorted(list(d.keys()))
    c = len(l)
    for i in range(len(l)):
        nums.insert(i,l[i])
    return c
