package Aula_2;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza um valor real n: ");
        double n = sc.nextDouble();

        double max = -2147483648;
        double min = 2147483647;
        double average = 2 * n;
        int count = 0;

        for (int i = 0; i < 100; i++) {
            System.out.println("Introduza um valor real n: ");
            double n_intro = sc.nextDouble();

            if (n == n_intro) {
                System.out.println("Máximo: " + max);
                System.out.println("Mínimo: " + min);
                System.out.println("Média: " + Math.round(average / (i + 2)));
                System.out.println("Número de valores introduzidos: " + count + 2);
                break;
            }

            if (n_intro > max) {
                max = n_intro;
            }

            if (n_intro < min) {
                min = n_intro;
            }

            average += n_intro;
            count++;
        }
        sc.close();
    }
}
