def factorial(n):
    if n > 0:
        factorial = n * (n-1)
        factorial(n-1)

factorial(5)