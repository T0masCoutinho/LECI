package aula02;

import java.util.Scanner;

public class exercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter your position X");
        double positionX = sc.nextDouble();
        System.out.println("Enter your position Y");
        double positionY = sc.nextDouble();
        double distance = Math.sqrt((positionX*positionX)+(positionY*positionY));
        System.out.println(distance);
        sc.close();     
    }
}
