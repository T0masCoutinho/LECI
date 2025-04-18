def leibnizPi4_term(b):
    return 1 / (b + 2) if b % 2 == 1 else -1 / (b + 2)

def leibnizPi4(n):
    result = 0
    for b in range(1, 2 * n, 2):
        result += leibnizPi4_term(b)
    return result

n = int(input("Enter the number of terms: "))
print(leibnizPi4(n))