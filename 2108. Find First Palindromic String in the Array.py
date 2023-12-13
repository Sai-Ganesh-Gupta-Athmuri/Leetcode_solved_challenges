class Solution:
    def firstPalindrome(self, words: List[str]) -> str:
        s=""
        for word in words :
            if(word == word[::-1]):
                s+=word
                break
        return s
