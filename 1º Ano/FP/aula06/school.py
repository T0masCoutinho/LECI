# Complete o programa!
import os

# a)
def loadFile(fname, lst):
    with open(fname, "r") as file:
        header = file.readline() 

        for line in file:
            atribs = line.strip().split("\t")
            
            name = str(atribs[1])
            num = int(atribs[0])
            not1 = float(atribs[5])
            not2 = float(atribs[6])
            not3 = float(atribs[7])

          

            lst.append([name, num, not1, not2, not3])
            #print(lst)          
    file.close()
            
        
        
       
    
# b) Crie a função notaFinal aqui + pauta
def notaFinal(fname, lst):
    with open(fname, "r") as file:
        header = file.readline() 
        
        for line in file:
            atribs = line.strip().split("\t")
            
            name = str(atribs[1])
            num = int(atribs[0])
            not1 = float(atribs[5])
            not2 = float(atribs[6])
            not3 = float(atribs[7])

            notaFinal = (not1 + not2 + not3)/3
          

            lst.append([name, num, notaFinal])
           
            print(f"numero {num}  nome {name}   nota {notaFinal}")          
    file.close()
   
    


# d)
def main():
    lst = []
    # ler os ficheiros
    loadFile("school1.csv", lst)
    loadFile("school2.csv", lst)
    loadFile("school3.csv", lst)
    

    lst.sort()
    # ordenar a lista
    notaFinal("school1.csv", lst)
    
    # mostrar a pauta
   
    


# Call main function
if __name__ == "__main__":
    main()


