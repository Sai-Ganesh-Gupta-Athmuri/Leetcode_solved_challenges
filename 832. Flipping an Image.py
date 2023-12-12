class Solution:
    def flipAndInvertImage(self, image: List[List[int]]) -> List[List[int]]:
        l = []
        for lst in image:
            l.append(lst[::-1])
        for i in range(len(image)):
            for j in range(len(image)):
                if(l[i][j] == 0):
                    l[i][j] = 1
                else:
                    l[i][j] = 0
        return l
