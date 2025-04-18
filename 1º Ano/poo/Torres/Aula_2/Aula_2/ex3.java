package Aula_2;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza um valor de massa: ");
        double massa = sc.nextDouble();
        System.out.println("Introduza um valor de temperatura inicial: ");
        double tempInicial = sc.nextDouble();
        System.out.println("Introduza um valor de temperatura final: ");
        double tempFinal = sc.nextDouble();
        double calor = massa * (tempFinal - tempInicial) * 4184;
        System.out.println("O valor de calor é: " + calor + " J");
        sc.close();
    }
}
