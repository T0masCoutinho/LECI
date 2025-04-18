package aula02;
import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter number of KMs");
        double kilometros = sc.nextDouble();
        double milhas = kilometros / 1.609;
        System.out.println(milhas);
        sc.close();     
    }
}