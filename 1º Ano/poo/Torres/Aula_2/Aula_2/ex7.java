package Aula_2;

import java.util.Scanner;
import java.lang.Math;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduza um valor de x para p1: ");
        double x1 = sc.nextDouble();
        System.out.println("Introduza um valor de y para p1: ");
        double y1 = sc.nextDouble();

        System.out.println("Introduza um valor de x para p2: ");
        double x2 = sc.nextDouble();
        System.out.println("Introduza um valor de y para p2: ");
        double y2 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("A distância entre os pontos é: " + distancia);
        sc.close();
    }
}
