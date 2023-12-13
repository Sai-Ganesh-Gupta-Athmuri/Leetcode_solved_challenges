class Solution:
    def isAcronym(self, words: List[str], s: str) -> bool:
        a=""
        j=0
        for i in range(len(words)):
            a+=words[i][j]
        return a == s
