class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        l = []
        l1 = []
        l2 = []
        for i in nums1:
            if i not in nums2:
                l.append(i)
        for i in nums2:
            if i not in nums1:
                l1.append(i)
        l = list(set(l))
        l1 = list(set(l1))
        l2.append(l)        
        l2.append(l1)
        print(l2)
        return l2
