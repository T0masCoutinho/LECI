def calcular_sintese(nome_ficheiro):
    import hashlib

    # Abre o ficheiro em modo binário
    with open(nome_ficheiro, "rb") as f:
        # Inicializa o objeto de hash (SHA-256 neste exemplo)
        hasher = hashlib.sha256()

        # Lê o primeiro bloco de 512 octetos
        buffer = f.read(512)

        # Loop enquanto houver dados no buffer
        while len(buffer) > 0:
            # Atualiza o objeto de hash com os octetos do buffer
            hasher.update(buffer)

            # Lê o próximo bloco de 512 octetos
            buffer = f.read(512)

    # Retorna a síntese calculada
    return hasher.hexdigest()

# Exemplo de uso
nome_do_ficheiro = "merda"
sintese = calcular_sintese(nome_do_ficheiro)
print(f"Síntese do ficheiro {nome_do_ficheiro}: {sintese}")