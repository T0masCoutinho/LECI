

def inputFloatList():
    n = input("Enter a number sequence ")
    list = n.split()
    print(list)
    
    
    list.sort()
    print(list)
    list = set(list)
    i = input("Enter a number sequence ")
    new_set =(set(i.split()))
    list.apped(new_set)
    print(list)

inputFloatList()       