package aula02;

import java.util.Scanner;

public class exercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a number");  
        int a = sc.nextInt();
        
        int i = a;
        while(i>=0){
            System.out.print(i + ", "); i--;
            if(i%10 == 1){
                System.out.println(i + ", "); i--;
            }
        }
        sc.close();
    }

}
