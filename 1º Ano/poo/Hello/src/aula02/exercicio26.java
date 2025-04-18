package aula02;

import java.util.Scanner;

public class exercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter your first velocity");
        double init = sc.nextDouble();
        double hora = init/3600;
        double minutos = (init%3600)/60;
        double segundos = (minutos%60);
     
        System.out.printf("Tempo formatado: %.0f:%.0f:%.0f", hora, minutos, segundos);
        sc.close();     
    }
}
