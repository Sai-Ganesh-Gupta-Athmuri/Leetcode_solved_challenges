class Solution:
    def splitWordsBySeparator(self, words: List[str], separator: str) -> List[str]:
        l1=[]
        k = 0
        for i in range(len(words)):
            k = 0 
            for j in range(len(words[i])):
                if(words[i][j] == separator):
                    l1.append(words[i][k:j])
                    k = j+1
            l1.append(words[i][k:len(words[i])])
        l2 = []
        for i in range(len(l1)):
            l1[i] = str(l1[i])
            if(l1[i] != ""):
                l2.append(l1[i])
        return l2
