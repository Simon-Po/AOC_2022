

r = open("Day6_Python\input.txt","r").read()

Larr = []
outArr = []
i = 0
for letter in r:
    if len(Larr) >= 14:
        outArr.append(Larr.pop(0))
    Larr.append(letter)
    if(i >= 14):
        if(len(set(Larr)) == len(Larr)):
            print(Larr) 
            print(len(outArr) + 14)
            break
    i = i + 1    