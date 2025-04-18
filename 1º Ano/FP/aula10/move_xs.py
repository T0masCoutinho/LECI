def move_xs(string):
    if len(string) == 0:
        return ""
    
    if string[0].casefold() == "x":
        return move_xs(string[1:]) + string[0]
    return string[0] + move_xs(string[1:])
    

def main():
    print(move_xs("Xexexeeexxcs"))


main()