class Solution:
    def sortByBits(self, arr: List[int]) -> List[int]:
        c=0
        l=[]
        lst = []
        for i in range(len(arr)):
            lst.append(arr[i])
        for i in range(len(arr)):
            c = 0
            n = arr[i]
            while(arr[i]!=0):
                if(arr[i]%2 == 1 ):
                    c+=1
                arr[i] = arr[i]//2
                if(arr[i] == 1):
                    c+=1 
            if(n == 0 or n==1):
                l.append(c)
            else:
                l.append(c-1)
        print(l)
        if(l.count(1)==len(l)):
            lst = sorted(lst)
        else:
            for i in range(len(l)):
                for j in range(len(l)-1):
                    if(l[j] == l[j+1] and lst[j]>lst[j+1]):
                        temp = lst[j]
                        lst[j] = lst[j+1]
                        lst[j+1] = temp
                    if(l[j]>l[j+1]):
                        temp = lst[j]
                        lst[j] = lst[j+1]
                        lst[j+1] = temp

                        temp = l[j]
                        l[j] = l[j+1]
                        l[j+1] = temp
        return lst 
