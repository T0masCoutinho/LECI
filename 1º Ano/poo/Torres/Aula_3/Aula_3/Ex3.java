package Aula_3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int guess = (int) (Math.random() * (max - min + 1) + min);
        int count = 0;
        int tentativa;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Pretende continuar? (Sim(S)/Não(N))");
            String resposta = sc.next();
            if (resposta.equals("Sim") || resposta.equals("S") || resposta.equals("sim") || resposta.equals("s")) {
                System.out.println("Introduza uma guess: ");
                tentativa = sc.nextInt();
                if (tentativa < 0 || tentativa > 100) {
                    System.out.println("Guess está fora do intervalo!\n");
                    count++;
                } else if (tentativa > guess) {
                    System.out.println("Guess é menor\n");
                    count++;
                } else if (tentativa < guess) {
                    System.out.println("Guess é maior\n");
                    count++;
                } else {
                    System.out.println("Acertou!\n");
                    count++;
                    System.out.println("Número de tentativas: " + count + "\n");
                    break;
                }
            } else {
                System.out.println("Obrigado por jogar!");
                break;
            }
        } while (guess != tentativa);
        sc.close();
    }
}