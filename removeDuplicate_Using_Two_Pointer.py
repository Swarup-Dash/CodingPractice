class Solution:
    def removeDuplicate(self, arr):
        i=0
        for j in range(1, len(arr)):
            if arr[i]!=arr[j]:
                i+=1
                arr[i]=arr[j]
                
        return arr[:i+1]
    
obj=Solution()
arr = [4,4,6,6,8]
res = obj.removeDuplicate(arr)
print(res)