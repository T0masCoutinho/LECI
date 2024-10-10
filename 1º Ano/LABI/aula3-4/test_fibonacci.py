import pytest
import random
from fibonacci import fibonacci

def tet_ver_se_lista():
    print("Ve se e lista")
    r = fibonacci(-10)
    assert isinstance (r, list)
    assert len(r) == 0

def test_inferior_1():
    print("Testa comportamento com n < 1")
    assert fibonacci(-1) == []
    assert fibonacci(0) == [0]

def test_igual_1_2_e_5():
    print("Ver se da 1 e 0")
    assert fibonacci(1) == [0, 1]
    assert fibonacci(2) == [0, 1, 1]
    assert fibonacci(5) == [0, 1, 1, 2, 3, 5]

def test_igual_n1():
    n = random.randint(10, 100)
    assert len( fibonacci(n)) == n +1