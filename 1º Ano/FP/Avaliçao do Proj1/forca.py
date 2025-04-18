import random, os, string
# -*- coding: utf-8 -*-

# Função que exibe a forca com base no número de tentativas restantes.
def forca():

    global abcedario
    
    if tentativas == 6:
        print("_______\n" "|     |\n" "|\n" "|\n" "|\n" "|______\n")
   
    elif tentativas == 5:
        print("_______\n""|     |\n" "|     O\n" "|\n" "|\n""|______\n")
        
    elif tentativas == 4:
        print("_______\n" "|     |\n" "|     O\n" "|     |\n" "|\n" "|______\n")
        
    elif tentativas == 3:
        print("_______\n" "|     |\n" "|     O\n" "|    /|\n" "|\n" "|______\n")
   
    elif tentativas == 2:
        print("_______\n" "|     |\n" "|     O\n" "|    /|\\\n" "|\n" "|______\n")
   
    elif tentativas == 1:
        print("_______\n" "|     |\n" "|     O\n" "|    /|\\\n" "|    /\n" "|______\n")
   
    else:
        print("_______\n" "|     |\n" "|     O\n" "|    /|\\\n" "|    / \\\n" "|______\n")
    
    print("Tentativas restantes:", tentativas)
    print(f"Letras corretas: {' '.join(letras_corretas).upper()}")
    print(f"Letras incorretas: {' '.join(letras_incorretas).upper()}")
    print(f"Letras por utilizar: {' '.join(abcedario)} ")   
    print(f"{' '.join(linhas)}")    

# Função que remove acentos de uma palavra.
def remover_acentos(palavra):
    acentos = {'á': 'a', 'é': 'e', 'í': 'i', 'ó': 'o', 'ú': 'u', 'â': 'a', 'ê': 'e', 'î': 'i', 'ô': 'o', 'û': 'u', 'à': 'a', 'è': 'e', 'ì': 'i', 'ò': 'o', 'ù': 'u', 'ã': 'a', 'õ': 'o', 'ç': 'c'}
    palavra_sem_acentos = ''.join([acentos.get(letra, letra) for letra in palavra.lower()])
    return palavra_sem_acentos

# Função para jogar o jogo da forca.
def palavra():
    global tentativas, secret, linhas, letras_corretas, letras_incorretas, abcedario, secret_sem_acentos
    
    print(f"Muito bem! A palavra é {secret}")

    while tentativas > 0:
        forca()
        escolha = input("Escolha uma letra ou insira a palavra completa (use '*' para tentar a palavra completa): ").upper()
        if escolha not in abcedario:
                print("Você já tentou essa letra. Tente outra.")
                continue
        if len(escolha) == 1 and escolha in abcedario:

            letra_sem_acentos = remover_acentos(escolha)

            if letra_sem_acentos in secret_sem_acentos:
                letras_corretas.append(letra_sem_acentos)
                if escolha in abcedario:
                    abcedario.remove(escolha)

                for i in range(len(secret_sem_acentos)):
                    if secret_sem_acentos[i] == letra_sem_acentos:
                        linhas[i] = secret[i]

                if '_' not in linhas:
                    print(f"Muito bem! A palavra é {secret}")
                    break
            else:
                letras_incorretas.append(escolha)
                tentativas -= 1
        elif escolha == '*' and tentativas >= 1: 
            palavra_completa = input("Insira a palavra completa (sem acentos): ").upper()
            if remover_acentos(palavra_completa) == secret_sem_acentos:
                print(f"Muito bem! A palavra é {secret}")
                break
            else:
                print("A palavra não é essa. Tenta novamente!")
                tentativas -= 1
        else:
            print("Por favor, insira apenas uma letra válida ou '*' para tentar a palavra completa.")
            continue

    if tentativas == 0:
        forca()
        print(f"Não conseguiste adivinhar!\nA palavra é {secret}!")

    if escolha in abcedario:
        abcedario.remove(escolha)

# Função que pergunta ao jogador se deseja jogar novamente.
def jogar_novamente():
    resposta = input("Deseja jogar novamente? (s/n): ")
    return resposta.lower() == 's'
        
# Função principal que executa o jogo.
def main():
    
    from wordlist import words1, words2
    #words = words1              # palavras sem acentos nem cedilhas.
    #words = words2             # palavras com acentos ou cedilhas.
    words = words1 + words2    # palavras de ambos os tipos.
    
    
    global tentativas, secret, linhas, letras_corretas, letras_incorretas, abcedario, secret_sem_acentos
    
    while True:
        secret = random.choice(words).upper()
        secret_sem_acentos = remover_acentos(secret) 
        tentativas = 6
        linhas = ["_"] * len(secret_sem_acentos) 
        letras_corretas = []
        letras_incorretas = []
        abcedario = list(string.ascii_uppercase)

        palavra()

        if not jogar_novamente():
            break

if __name__ == "__main__":
    main()
