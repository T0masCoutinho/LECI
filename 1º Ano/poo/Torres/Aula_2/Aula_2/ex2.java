package Aula_2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza um valor de graus Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("O valor em Fahrenheit é: " + fahrenheit);
        sc.close();
    }
}
