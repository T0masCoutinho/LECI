dc = {}

letras_especiais = {        
             "Á": "A",      
             "À": "A",
             "Â": "A",
             "Ã": "A",
             "É": "E",
             "È": "E",
             "Ê": "E",
             "Í": "I",
             "Ì": "I",
             "Î": "I",
             "Ó": "O",
             "Ò": "O",
             "Ô": "O",
             "Õ": "O",
             "Ú": "U",
             "Ù": "U",
             "Û": "U",
             "Ç": "C",
             "Ü": "U"
            }



c = 0

with open("C:\\Users\\tomas\\OneDrive\\Documentos\\Uni\\1º Ano\\1ºSemestre\FP\\aula07\\pg3333.txt", "r", encoding="utf-8") as f:
    for line in f:
        for l in line.strip():
            
            l = l.upper()
            if l.isalpha():
                if l in letras_especiais:
                    l = letras_especiais[l]
                if l in dc:
                    dc[l] += 1
                else:
                    dc[l] = 1


lst = list(dc)
sorted(lst)
sorted_dict = {i: dc[i] for i in lst}
for k,v in sorted_dict.items():
    print(k, ":", v)
    print("\n")

#print(*sorted_dict, sep="\n")
