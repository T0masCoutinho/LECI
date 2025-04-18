package Aula_2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza um valor de quilómetros: ");
        double quilometros = sc.nextDouble();
        double milhas = (quilometros / 1.609);
        System.out.println("O valor em milhas é: " + milhas);
        sc.close();
    }
}