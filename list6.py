# 6. Even Odd Elements
A = [1, 2, 3, 4]
even_count = sum(1 for x in A if x % 2 == 0)
odd_count = sum(1 for x in A if x % 2 != 0)
print("Absolute Difference:", abs(even_count - odd_count))