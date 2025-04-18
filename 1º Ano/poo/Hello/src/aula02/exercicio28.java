package aula02;

import java.util.Scanner;

public class exercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter your position X");
        double positionX = sc.nextDouble();
        System.out.println("Enter your position Y");
        double positionY = sc.nextDouble();
        double hipo = Math.sqrt((positionX*positionX)+(positionY*positionY));
        System.out.println(hipo);
        double sinValue = positionY/hipo;
        double angle = Math.toDegrees(sinValue); 
        System.out.println(angle);
        sc.close();     
    }
}
