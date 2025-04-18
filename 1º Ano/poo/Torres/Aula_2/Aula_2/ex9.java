package Aula_2;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Introduza um valor N: ");
            int n = sc.nextInt();

            if (n < 0) {
                System.out.println("O valor tem de ser positivo!");
            } else {
                for (; n >= 0; n--) {
                    if (n % 10 == 0) {
                        System.out.println(n + ", " + "\n");
                    } else {
                        System.out.print(n + ", ");
                    }
                }
            }
            sc.close();
        }
    }
}
