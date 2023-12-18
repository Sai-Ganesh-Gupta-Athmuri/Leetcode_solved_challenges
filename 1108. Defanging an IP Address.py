class Solution:
    def defangIPaddr(self, address: str) -> str:
        s = []
        st = ""
        for i in range(len(address)):
            s.append(address[i])
        for i in range(len(s)):
            if(s[i] == "."):
                s.remove(s[i])
                s.insert(i,"[.]")
        for i in range(len(s)):
            st+=s[i]
        return st
