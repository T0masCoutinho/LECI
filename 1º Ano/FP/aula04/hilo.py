# Complete the code to make the HiLo game.

import random

def playHiLo():
    # Pick a random number between 1 and 100, inclusive
    secret = random.randrange(1, 101)
    float(secret)
    print("I picked a number between 1 and 100. Can you guess it? Yes or No?")
    # put your code here
    n = float(input())
    while n != secret:
        if n > secret:
            print("lower")
            n = float(input())
        elif n < secret:
            print("higher")
            n = float(input())
    if n == secret:
        print("You guessed it!")

playHiLo()

