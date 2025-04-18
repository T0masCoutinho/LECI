package Aula_3;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        do {
            System.out.print("Digite um número inteiro positivo: ");
            numero = sc.nextInt();
        } while (numero < 1);

        int soma = 0;
        for (int i = 2; i <= numero; i++) {
            if (isPrime(i)) {
                soma += i;
            }
        }

        System.out.println("A soma dos números primos até " + numero + " é " + soma);
        sc.close();
    }

    private static boolean isPrime(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
