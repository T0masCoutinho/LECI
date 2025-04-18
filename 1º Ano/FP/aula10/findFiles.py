import os

def printDirFiles(d):
    lst = os.listdir(d)
    print(lst)
    for fname in lst:
        path = os.path.join(d, fname)
        if os.path.isfile(path):
            ftype = "FILE"
        elif os.path.isdir(path):
            ftype = "DIR"
        else:
            ftype = "?"
        print(ftype, path)
    return


def findFiles(path, ext):
    result = []
    for item in os.listdir(path):
        item_path = os.path.join(path, item)
        print(item_path)
        if os.path.isfile(item_path) and item.endswith(ext):
            result.append(item_path)        
        elif os.path.isdir(item_path):
            result.extend(findFiles(item_path, ext))        
    return result

def main():
    print("Testing printDirFiles('..'):")
    printDirFiles("..")

    print("\nTesting findFiles('.', '.py'):")
    lst = findFiles(r"C:\Users\tomas\OneDrive\Documentos\Uni\1º Ano\1ºSemestre\FP", ".py")
    print(lst)
    assert isinstance(lst, list)

    print("\nTesting findFiles('..', '.csv'):")
    lst = findFiles("..", ".csv")
    print(lst)

if __name__ == "__main__":
    main()

