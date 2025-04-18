package aula03;

import java.util.Scanner;

public class exercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter your deposit");
        double deposit = sc.nextDouble();
        System.out.println("Enter the tax");
        double tax = sc.nextDouble();
        if (!verificar(deposit, tax)) {
            System.out.println("Invalid input. Please check deposit and tax values.");
            sc.close();
            return;
        }
        double montante = deposit;

        for( int i = 0; i < 12; i++){
         montante = montante + (montante * (tax/100));
        
         
        System.out.println("Month " + (i + 1) + ": " + montante);
        }
        sc.close();     
    }

    public static boolean verificar(double a, double b){
        if(!(a % 1000 == 0 && a > 1)){
            return false;
        }
        if(!(b >= 0 && b <=5)){
            return false;
        }
        return true;
    }

}
