class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        l = []
        c= 0
        for i in range(len(nums)):
            if(nums[i] == val):
                c+=1
                continue
            else:
                l.append(nums[i])
        n = len(nums)
        for i in range(len(l)):
            nums.insert(i,l[i])
        return n-c
