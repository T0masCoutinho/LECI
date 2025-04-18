surnames = {}

with open("C:\\Users\\tomas\\OneDrive\\Documentos\\Uni\\1º Ano\\1ºSemestre\\FP\\aula08\\names.txt", "r", encoding="UTF-8") as f:
    cabecalho = f.readline()

    for line in f:
        names = line.split()
        if names[-1] in surnames:
            surnames[names[-1]] += [names[0]]
 
        else:
            surnames[names[-1]] = [names[0]]

for k,v in surnames.items():
    print(k,v)

