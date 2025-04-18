package aula03;
import java.util.Scanner;

public class exercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero inteiro");
        int num = sc.nextInt();

        System.out.println("Números primos até " + num + ":");

        for (int i = 2; i <= num; i++) {
            if (isPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }

    // Função para verificar se um número é primo
    public static boolean isPrimo(int numero) {
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