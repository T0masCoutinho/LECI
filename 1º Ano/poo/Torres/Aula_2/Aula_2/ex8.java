package Aula_2;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Introduza um valor do lado A: ");
            double ladoA = sc.nextDouble();

            System.out.println("Introduza um valor do lado B: ");
            double ladoB = sc.nextDouble();

            if (ladoA <= 0 || ladoB <= 0) {
                System.out.println("Os valores dos lados têm de ser positivos!");
                return;
            }

            double hipotenusa = Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2));
            System.out.println("O valor da hipotenusa é: " + hipotenusa);

            double graus = Math.toDegrees(Math.acos(ladoA / hipotenusa));
            System.out.println("O valor do ângulo é: " + graus);
            sc.close();
        }
    }
}
