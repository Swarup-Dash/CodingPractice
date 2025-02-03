nums = [1, 2, 3]
result = []

for i in range(0, len(nums)):
    for j in range(i, len(nums)):
        result.append(nums[i: j+1])
    
for res in result:
    print(res)