package Aula_3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza um valor montante investido: ");
        int montante = sc.nextInt();
        System.out.println("Introduza a taxa de juro: ");
        double taxa = sc.nextDouble();

        if (montante <= 0 && taxa <= 0) {
            System.out.println("O montante não pode ser negativo ou zero!");
        }

        else if (montante % 1000 != 0 && (taxa >= 5)) {
            System.out.println("O montante tem de ser múltiplo de 1000!");
        }

        else {
            for (int i = 1; i < 12; i++) {
                montante += montante * (taxa / 100);
                System.out.println("O montante no fim do mês " + i + " é: " + montante);
            }
        }
        sc.close();
    }
}
