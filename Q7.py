n=int(input())
for i in range(1,n+1):
    for j in range(i):
        if (j==0 or j == n):
            print("*",end=" ")
        else:
            print("_",end=" ")
    print("*")