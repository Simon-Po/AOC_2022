import string

f = open("input.txt", "r")
input = f.read().split()

alphabet_lower = list(string.ascii_lowercase)
alphabet_upper = list(string.ascii_uppercase)

alpha = {}
alpha_upper = {}
i = 0
for a in alphabet_lower:
    alpha[a] = i+1
    i = i+1
i= 26
for a in alphabet_upper:
    alpha_upper[a] = i+1
    i = i+1

alpha.update(alpha_upper)

out = 0
col = []

for x in range(len(input)):
    
    if (len(input) > x + 2):
        a1 = list(input[x])
        a2 = list(input[x+1])
        a3 = list(input[x+2])
        
        a4 = list(set(a1).intersection(a2))
        col.append(list(set(a4).intersection(a3)))
        
        
    
    x = x + 3   
print(col)
    

for x in col:
    if (x):
        stri = x[0]
        out = out + alpha[stri]
        print(out)
print(out)    

    
    
    