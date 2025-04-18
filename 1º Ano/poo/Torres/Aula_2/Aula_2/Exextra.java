package Aula_2;

import java.util.Scanner;

public class Exextra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza um valor mínimo para o intervalo: ");
        double min = sc.nextDouble();
        System.out.println("Introduza um valor máximo para o intervalo: ");
        double max = sc.nextDouble();
        System.out.println("Introduza um valor a pesquisar: ");
        double pesq = sc.nextDouble();
        if (min > max) {
            System.out.println("O valor mínimo tem de ser menor que o valor máximo!");
        } else if (pesq < min || pesq > max) {
            System.out.println("O valor a pesquisar está fora do intervalo!");
        } else {
            System.out.println("O valor a pesquisar está no intervalo!");
        }

        double dist = Math.max(max - pesq, pesq - min);
        System.out.println(
                "A distância máxima do valor a pesquisar a um dos extremos é: " + (Math.round(dist * 10.0) / 10.0));
        sc.close();
    }
}
