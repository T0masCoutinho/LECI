import os
from Cryptodome.Cipher import ARC4
from Cryptodome.Hash import SHA256
from Cryptodome.Random import get_random_bytes

key = get_random_bytes()

if len(key) < 5:
    obj = SHA256.new()
    obj.update(key.encode('utf-8'))
    obj.digest()
elif len(key) > 256:
    key[:256].encode('utf-8')
else:
    key.encode('utf-8')


cryptogram = cipher.encrypt("f_name".encode("utf-8"))
os.write(1, cryptogram) # o 1 representa o descritor do stdout
print()

decipher = ARC4.new("chave".encode("utf-8"))
decrypted = decipher.decrypt(cryptogram)
print(decrypted.decode("utf-8"))