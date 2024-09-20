class Solution:
    def removeDuplicate(self, arr):
        start = 0
        
        while start<len(arr)-1:
            if arr[start] == arr[start+1]:
                arr.pop(start+1)                
            else:
                start+=1
       
        return arr

obj = Solution()
arr = [4,4,6,6,8] 
res = obj.removeDuplicate(arr)
print(res)