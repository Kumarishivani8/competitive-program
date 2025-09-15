# 7. Separate Odd Even
A = [1, 2, 3, 4, 5]
odd_elements = [str(x) for x in A if x % 2 != 0]
even_elements = [str(x) for x in A if x % 2 == 0]
print(" ".join(odd_elements))   
print(" ".join(even_elements))