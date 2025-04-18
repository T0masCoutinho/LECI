
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
def main():
    # Testing:
    s = primesUpTo(1000)
    print(s)

    # Do some checks:
    assert primesUpTo(30) == {2,3,5,7,11,13,17,19,23,29}
    assert len(primesUpTo(1000)) == 168
    assert len(primesUpTo(7918)) == 999
    assert len(primesUpTo(7919)) == 1000
    print("All tests passed!")

if __name__ == "__main__":
    main()

