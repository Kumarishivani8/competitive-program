# 10. Reverse using for loop
A = [3, 5, 1, 2, 1, 2]
rev = []
for i in range(len(A)-1, -1, -1):  
    rev.append(A[i])
print("Reversed Array:", rev) 