import sys

def fibonacci_negative(n):
    res = []
    if n < 0:
        return res
    
def fibonacci_zero(n):
    res = []
    if n < 0:
        return res
    elif n == 0:
        res == [0, 1] 
        return res
    
def fibonacci_1(n):
    res = []
    if n < 0:
        return res
    elif n == 0:
        res == [0, 1] 
        return res
    elif n == 1:
        res == [0, 1]
        return res
    
def fibonacci_2(n):
    res = []
    if n < 0:
        return res
    elif n == 0:
        res == [0, 1] 
        return res
    elif n == 1:
        res == [0, 1]
        return res
    elif n == 2:
        res == [0, 1, 1]
        return res
    
def fibonacci(n):
    res = []
    if n < 0:
        return res
    elif n == 0:
        res = [0] 
        return res
    elif n == 1:
        res = [0, 1]
        return res
    elif n == 2:
        res = [0, 1, 1]
        return res
    elif n > 2:
        res = [0, 1]
        while len(res) < n+1:
            res.append(res[-1] + res[-2])
        return res