class Solution:
    def sortArrayByParity(self, nums: List[int]) -> List[int]:
        l= []
        for i in range(len(nums)):
            if(nums[i]%2==0):
                l.insert(0,nums[i])
            else:
                l.append(nums[i])
        return l
