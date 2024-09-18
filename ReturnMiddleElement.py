def middleOne(s):
    slength = len(s)
    middle = slength//2
    
    if slength%2==0:
        return s[middle-1], s[middle]
    
    else:
        return s[middle]
    
s = "Good"
res = middleOne(s)

print(res)