import sys
import os
from Cryptodome.Cipher import ARC4
from Cryptodome.Hash import SHA256

def gerar_chave_aleatoria(tamanho):
    return os.urandom(tamanho)

def adaptar_chave(chave_aleatoria):
    # Se a chave tiver menos de 5 octetos, use a síntese SHA-256
    if len(chave_aleatoria) < 5:
        chave_sintetizada = SHA256.new(chave_aleatoria.encode()).digest()
        return chave_sintetizada
    # Se tiver mais de 256 octetos, use apenas os primeiros 256
    elif len(chave_aleatoria) > 256:
        return chave_aleatoria[:256].encode()
    # Caso contrário, use exatamente os octetos fornecidos
    else:
        return chave_aleatoria.encode()

def cifrar_rc4(arquivo, chave):
    adaptar_chave(chave_aleatoria)
    # Inicializa o objeto de cifra RC4
    cifra = ARC4.new(chave)

    with open(arquivo, 'rb') as f:
        # Lê o conteúdo do arquivo em blocos e cifra
        while True:
            bloco = f.read(4096)  # 4 KB de cada vez
            if not bloco:
                break
            ciphertext = cifra.encrypt(bloco)
            sys.stdout.buffer.write(ciphertext)

if len(sys.argv) != 2:
    print("Uso: python cifraComRC4.py <arquivo_a_cifrar>")
    sys.exit(1)
arquivo_a_cifrar = sys.argv[1]

    # Gera uma chave aleatória com tamanho entre 1 e 300 bytes para o ARC4
tamanho_chave = os.urandom(1)[0] % 300 + 1
chave_aleatoria = gerar_chave_aleatoria(tamanho_chave)

cifrar_rc4(arquivo_a_cifrar, chave_aleatoria)