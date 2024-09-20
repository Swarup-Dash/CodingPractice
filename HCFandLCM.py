n1 = int(input("Enter 1st number: "))
n2 = int(input("Enter 2nd number: "))

n = min(n1, n2)

for i in range(1, n+1):
    if n1%i==0 and n2%i==0:
        hcf = i
        
print("HCF is:", hcf)

lcm = (n1*n2)/hcf
print("LCM is", lcm)