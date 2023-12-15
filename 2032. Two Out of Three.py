class Solution:
    def twoOutOfThree(self, nums1: List[int], nums2: List[int], nums3: List[int]) -> List[int]:
        l = []
        l1 = []
        l2 = []
        for i in range(len(nums1)):
            if(nums1[i] in nums2 or nums1[i] in nums3):
                l.append(nums1[i])
        for i in range(len(nums2)):
            if(nums2[i] in nums1 or nums2[i] in nums3):
                l1.append(nums2[i])
        for i in range(len(nums3)):
            if(nums3[i] in nums2 or nums3[i] in nums1):
                l2.append(nums3[i])
        l3 = l+l1+l2
        s = set(l3)
        l4 = list(s)
        return l4
