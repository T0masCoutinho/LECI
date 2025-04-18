package Aula_2;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduza um valor de v1: ");
        double v1 = sc.nextDouble();

        System.out.println("Introduza um valor de d1: ");
        int d1 = sc.nextInt();

        System.out.println("Introduza um valor de v2: ");
        double v2 = sc.nextDouble();

        System.out.println("Introduza um valor de d2: ");
        int d2 = sc.nextInt();

        // formula of the medium speed
        double v = (d1 + d2) / ((d1 / v1) + (d2 / v2));
        System.out.println("O valor da velocidade média é: " + v + " km/h");

        sc.close();
    }
}
