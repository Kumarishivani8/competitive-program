s = "Hello everyone how are you"
print(s.split())  
# ['Hello', 'everyone', 'how', 'are', 'you']

s = "Hello-everyone-how are you"
print(s.split("-"))  
# ['Hello', 'everyone', 'how are you']

word = 'Suyash:Chaudhary:Noida'
print(word.split(':'))  
# ['Suyash', 'Chaudhary', 'Noida']

t = "23456"
print(t.split())  
# ['23456']  (no spaces inside, so 1 element)

t = "2 3 4 5"
print(t.split())  
# ['2', '3', '4', '5']