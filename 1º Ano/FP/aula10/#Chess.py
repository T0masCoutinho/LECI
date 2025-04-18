#Chess
rows = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h']
row = input("Input a letter from a to h")
while row not in rows:
    print("Input a valid letter")
    row = input("Input a letter from a to h")

collum = float(input("Choose a number from 1 to 8"))
while collum < 0 or collum > 9:
    print("Choose a valid number")
    column = float(input("Choose a number from 1 to 8: "))


colorN = None 
if collum %2:
    colorN = "White"
else:
    colorN = "Black " 

list_position = ord(row) - ord('a') + 1

colorL = None
if list_position % 2 != 0:
    colorL = "Black"
else:
    colorL = "White"

color = None
if colorN and colorL == "White":
    color = "White"
else:
    color = "Black"


print(row + str(collum), color)