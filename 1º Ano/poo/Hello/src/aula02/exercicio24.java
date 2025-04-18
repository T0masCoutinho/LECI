package aula02;

import java.util.Scanner;

public class exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter your deposit");
        double deposit = sc.nextDouble();
        System.out.println("Enter the tax");
        double tax = sc.nextDouble();
        double montante = deposit;

        for( int i = 0; i < 3; i++){
         montante = montante + (montante * (tax/100));
        
         
        System.out.println("Month " + (i + 1) + ": " + montante);
        }
        sc.close();     
    }
}
