def primesUpTo(n):
    # Inicializar o conjunto com todos os números de 2 até n
    numbers = set(range(2, n + 1))
    
    # Iterar sobre os números no conjunto
    for num in range(2, int(n**0.5) + 1):
        # Verificar se o número ainda está no conjunto
        if num in numbers:
            # Eliminar os múltiplos do número atual
            multiples = set(range(num * num, n + 1, num))
            numbers -= multiples
    
    return numbers

# Exemplo de uso
n = int(input("num "))
result = primesUpTo(n)
print(f"Primos até {n}: {result}")