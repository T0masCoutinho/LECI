package aula03;

import java.util.Scanner;

public class exercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de alunos na turma: ");
        int numAlunos = sc.nextInt();

        double[][] notas = new double[numAlunos][2]; // 2 columns for notaT and notaP

        // Preencher o vetor bidimensional com valores aleatórios entre 0.0 e 20.0
        for (int i = 0; i < numAlunos; i++) {
            notas[i][0] = Math.round(Math.random() * 20.0 * 10.0) / 10.0; // notaT
            notas[i][1] = Math.round(Math.random() * 20.0 * 10.0) / 10.0; // notaP
        }

        // Imprimir cabeçalho da tabela
        System.out.println("NotaT NotaP Pauta");

        // Processar as notas e imprimir os resultados
        for (int i = 0; i < numAlunos; i++) {
            double notaT = notas[i][0];
            double notaP = notas[i][1];
            int pauta = calcularPauta(notaT, notaP);

            System.out.printf("%.1f %.1f %d%n", notaT, notaP, pauta);
        }

        sc.close();
    }

    // Função para calcular a pauta com base nas notas teórica e prática
    private static int calcularPauta(double notaT, double notaP) {
        if (notaT < 7.0 || notaP < 7.0) {
            return 66; // Reprovado por nota mínima
        } else {
            return (int) Math.round(0.4 * notaT + 0.6 * notaP); // Arredondar a unidades
        }
    }
}