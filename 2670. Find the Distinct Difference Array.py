class Solution:
    def distinctDifferenceArray(self, nums: List[int]) -> List[int]:
        l=[]
        for i in range(0,len(nums)):
            if i == 0:
                s = set(nums[i+1:len(nums)])
                l.append(1-len(s))
            elif i == len(nums)-1:
                s = set(nums)
                l.append(len(s))
            else:
                s = set(nums[0:i+1])
                s1 = set(nums[i+1:len(nums)])
                l.append(len(s)-len(s1))
        return l
