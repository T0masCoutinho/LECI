package aula03;

import java.util.Scanner;

public class exercicio35 {
    public static void main(String[] args) {
        // Leitura de valores do teclado
        int[] data = lerData();
        int diaSemanaInicio = lerDiaSemanaInicio();

        // Cálculo e impressão do calendário
        imprimirCalendario(data[0], data[1], diaSemanaInicio);
    }

    // Função para ler a data do teclado com validação
    private static int[] lerData() {
        Scanner sc = new Scanner(System.in);
        int[] data = new int[2];

        while (true) {
            System.out.print("Digite a data no formato mm/yyyy: ");
            String input = sc.nextLine();

            String[] partes = input.split("/");
            if (partes.length == 2) {
                try {
                    int mes = Integer.parseInt(partes[0]);
                    int ano = Integer.parseInt(partes[1]);

                    if (mes >= 1 && mes <= 12 && ano >= 0) {
                        data[0] = mes;
                        data[1] = ano;
                        break;
                    } else {
                        System.out.println("Por favor, insira valores válidos para o mês e ano.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, insira valores válidos para o mês e ano.");
                }
            } else {
                System.out.println("Formato inválido. Use mm/yyyy.");
            }
        }

        return data;
    }

    // Função para ler o dia da semana de início do mês
    private static int lerDiaSemanaInicio() {
        Scanner sc = new Scanner(System.in);
        int diaSemanaInicio;

        while (true) {
            System.out.print("Digite o dia da semana de início (1 a 7): ");
            diaSemanaInicio = sc.nextInt();

            if (diaSemanaInicio >= 1 && diaSemanaInicio <= 7) {
                break;
            } else {
                System.out.println("Por favor, insira um valor válido (1 a 7).");
            }
        }

        return diaSemanaInicio;
    }

    // Função para calcular e imprimir o calendário
    private static void imprimirCalendario(int mes, int ano, int diaSemanaInicio) {
        System.out.println("\n" + obterNomeMes(mes) + " " + ano);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int diasNoMes = calcularDiasNoMes(mes, ano);

        // Espaço para o primeiro dia
        for (int i = 1; i < diaSemanaInicio; i++) {
            System.out.print("   ");
        }

        // Imprimir os dias do mês
        for (int dia = 1; dia <= diasNoMes; dia++) {
            System.out.printf("%2d ", dia);

            // Quebrar a linha no sábado (7º dia da semana)
            if ((dia + diaSemanaInicio - 1) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    // Função para calcular o número de dias no mês, considerando anos bissextos
    private static int calcularDiasNoMes(int mes, int ano) {
        int[] diasNoMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (mes == 2 && ehAnoBissexto(ano)) {
            return 29;
        } else {
            return diasNoMes[mes];
        }
    }

    // Função para verificar se um ano é bissexto
    private static boolean ehAnoBissexto(int ano) {
        return ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0);
    }

    // Função para obter o nome do mês a partir do número do mês
    private static String obterNomeMes(int mes) {
        String[] nomesMes = {
                "", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return nomesMes[mes];
    }
}
