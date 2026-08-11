class Solution:
    def scoreOfString(self, s: str) -> int:
        arr=[]
        for i in range (len(s)):
            arr.append(ord(s[i]))
        s=0
        for j in range (len(arr)-1):
            s+=abs(arr[j+1]-arr[j])
        return s 