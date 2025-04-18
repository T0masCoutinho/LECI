package Aula_2;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza um valor de segundos: ");
        int segundos = sc.nextInt();
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        segundos = (segundos % 3600) % 60;
        System.out.printf("O valor em horas é: %02d:%02d:%02d", horas, minutos, segundos);
        sc.close();
    }
}
