package aula02;

import java.util.Scanner;

public class exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the temperature in celcius");
        double celcius = sc.nextDouble();
        double faranheight = 1.8 * celcius + 32;
        System.out.println(faranheight);
        sc.close();     
    }
}
