from tkinter import filedialog



def main():
    # 1) Pedir nome do ficheiro (experimente cada alternativa):
    name = input("File? ")                                  #A
    #name = filedialog.askopenfilename(title="Choose File") #B
    
    # 2) Calcular soma dos números no ficheiro:
    total = fileSum(name)
    
    # 3) Mostrar a soma:
    print("Sum:", total)
 

def fileSum(filename):
    # Complete a função para ler números do ficheiro e devolver a sua soma.
     
     f = open(filename, 'r')
     soma = 0
     for line in f:
        n = float(line.rstrip())
        print(len(line), line)
        soma += n
        return soma
        
   

if __name__ == "__main__":
    main()

