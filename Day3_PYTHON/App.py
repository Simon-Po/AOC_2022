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
for a in input:
    
    b= len(a) // 2
   
    a1 = list(a[0:b])
    a2 = list(a[b:len(a)])
    c = list(set(a1).intersection(a2))
    col.append(c)
for x in col:
    stri = x[0]
    out = out + alpha[stri]
    print(out)
print(out)    

    
    
    