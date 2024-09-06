class Solution:
    def factorial(self, num):
        if num>0:
            return num + self.factorial(num-1)
        else:
            return num
        
obj = Solution()
num = 10
res = obj.factorial(num)

print(res)