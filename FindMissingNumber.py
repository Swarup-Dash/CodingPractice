arr = [2, 3, 7, 8, 10, 12, 14]
start=3
end=12

res = []
for i in range(start, end):
    if i+1 not in arr:
        res.append(i+1)
        
print(res)