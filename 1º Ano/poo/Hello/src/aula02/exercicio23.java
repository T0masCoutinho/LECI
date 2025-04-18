package aula02;

import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter quantity of water in KGs");
        double M = sc.nextDouble();
        System.out.println("Enter initial temperature of the water");
        double iniTemp = sc.nextDouble();
        System.out.println("Enter final temperature of the water");
        double finTemp = sc.nextDouble();
        double Q = M * (finTemp - iniTemp) * 4184; 
        System.out.println(Q);
        sc.close();     
    }
}
