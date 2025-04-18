package imobiliaria;

import java.util.Scanner;

//NMEC = 119501

public class MainImobiliaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Imobiliaria imobiliaria = new Imobiliaria(100); // Capacidade para 100 imóveis
        int opcao; 

        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar novo imóvel");
            System.out.println("2. Listar imóveis disponíveis");
            System.out.println("3. Vender imóvel");
            System.out.println("4. Imprimir lucro total");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.println("Tipo de Imóvel (1 - Casa, 2 - Apartamento, 3 - Terreno): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer

                    System.out.println("Adicionar Morada");
                    String morada = scanner.next();
                    System.out.println("Adicionar Preco base de venda");
                    Double preço = scanner.nextDouble();
                    System.out.println("Adicionar Area Total");
                    Double area = scanner.nextDouble();
                    
                    switch (tipo) {
                        case 1:
                            System.out.println("Adicionar Quartos");
                            int quartos = scanner.nextInt(); 
                            System.out.println("Adicionar Pisos");
                            int pisos = scanner.nextInt();
                            break;
                        case 2:
                            System.out.println("Adicionar Quartos");
                            int nquartos = scanner.nextInt();
                            break;
                        case 3:
                            System.out.println("Adicionar Tipo (Urbano ou Rustico)");
                            String type = scanner.next();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                case 2:
                    System.out.println(imobiliaria);
                    break;
                case 3:
                    // Vender imóvel
                    break;

                case 4:
                    // Imprimir lucro total
                    break;
                case 5:
                    System.out.println("Obrigada por usar o sistema.");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção inválida.");

                }

}   while(opcao != 5); 
        }
    }


