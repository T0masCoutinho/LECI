package Aula_2;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduza um valor a investir: ");
        double investimento = sc.nextDouble();

        System.out.println("Introduza um valor de taxa de juro: ");
        double taxaJuro = sc.nextDouble();

        System.out.println("Introduza um valor de meses: ");
        double meses = sc.nextDouble();

        for (int i = 0; i < meses; i++) {
            investimento += investimento * (taxaJuro / 100);
        }

        System.out.println("O valor final é: " + investimento + " €");
        sc.close();
    }
}
