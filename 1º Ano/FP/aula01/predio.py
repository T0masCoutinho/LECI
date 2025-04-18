n = 0

list = []

while n < 3:
    n = n + 1
    A = n * 3
    M = 2
    dist = ((A * 2)* 365) * M
    print(dist)
    list.append(dist)
   
print(list)

sumNum = 0

for num in list:
     sumNum += num
print(sumNum, "Meters/Year")

kms = sumNum / 1000
print(kms, "KMs/Year")


##TIME##

hours = (sumNum/60)/60
print(hours, "Horas")