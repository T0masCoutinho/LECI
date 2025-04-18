package aula02;

import java.util.Scanner;

public class exercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter your first velocity");
        double v1 = sc.nextDouble();
        System.out.println("Enter your first distance");
        double d1 = sc.nextDouble();
        double t1 = v1/d1;
        System.out.println("Enter final velocity");
        double v2 = sc.nextDouble();
        System.out.println("Enter final distance");
        double d2 = sc.nextDouble();
        double t2 = v2/d2;
        double velocidadeMedia = (d1+d2)/(t2+t1); 
        System.out.println(velocidadeMedia);
        sc.close();     
    }
}
