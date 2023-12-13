class Solution:
    def countGoodRectangles(self, rectangles: List[List[int]]) -> int:
        d={}
        l=[]
        for i in range(len(rectangles)):
            j = 0
            l.append(min(rectangles[i][j],rectangles[i][j+1]))
        for i in l:
            if i in d:
                d[i]+=1
            else:
                d[i] = 1
        return d[max(d.keys())]

