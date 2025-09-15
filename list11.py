# 11. Add two list element (element-wise sum)
A1 = [1, 2, 3, 4]
A2 = [4, 5, 6, 7]
result = [A1[i] + A2[i] for i in range(len(A1))]
print("Element-wise Sum:", result)