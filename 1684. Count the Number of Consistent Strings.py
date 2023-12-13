class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:     
        count=0
        c=0
        for i in range(len(words)):
            string=words[i]
            for j in range(len(words[i])):
                if string[j] not in allowed:
                    c=1
                    break
            if c==0:
                count+=1
            else: c=0
        return count
            
