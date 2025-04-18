package Aula_6.Ex2;

import Aula_6.Ex1.Pessoa;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex2 {
    public static void main(String args[]) {
        int input;
        Scanner sc = new Scanner(System.in);

        ArrayList<Contacto> contactos = new ArrayList<Contacto>();

        do {
            System.out.println("Bom dia! Insira a opção que pretende:");
            System.out.println("1 - Inserir contacto");
            System.out.println("2 - Alterar contactos");
            System.out.println("3 - Apagar contacto");
            System.out.println("4 - Procurar contactos");
            System.out.println("5 - Listar contactos");
            System.out.println("6 - Inserir contacto sem email");
            System.out.println("7 - Inserir contacto sem telefone");
            System.out.println("0 - Sair");

            input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Insira o nome da pessoa:" + "\n");
                    String nome = sc.next();
                    System.out.println("Insira o telefone da pessoa:" + "\n");
                    int telefone = sc.nextInt();
                    System.out.println("Insira o email da pessoa:" + "\n");
                    String email = sc.next();
                    if (Contacto.validateTelefone(telefone) == false || Contacto.validateEmail(email) == false) {
                        System.out.println("Contacto inválido!" + "\n");
                        break;
                    } else if (Contacto.validateTelefone(telefone) && Contacto.validateEmail(email)) {
                        Pessoa pessoa = new Pessoa(nome, 0, null);
                        Contacto contacto = new Contacto(pessoa, telefone, email);
                        contactos.add(contacto);
                        System.out.println("Contacto inserido com sucesso!" + "\n");
                        break;
                    }
                case 2:
                    System.out.println("Insira o id do contacto que pretende alterar:" + "\n");
                    int id = sc.nextInt();
                    System.out.println("Insira o novo nome da pessoa:" + "\n");
                    String nome2 = sc.next();
                    System.out.println("Insira o novo telefone da pessoa:" + "\n");
                    int telefone2 = sc.nextInt();
                    System.out.println("Insira o novo email da pessoa:" + "\n");
                    String email2 = sc.next();
                    Pessoa pessoa2 = new Pessoa(nome2, 0, null);
                    Contacto contacto2 = new Contacto(pessoa2, telefone2, email2);
                    contactos.set(id, contacto2);
                    System.out.println("Contacto alterado com sucesso!");
                    break;
                case 3:
                    System.out.println("Insira o id do contacto que pretende apagar:" + "\n");
                    int id2 = sc.nextInt();
                    contactos.remove(id2);
                    System.out.println("Contacto apagado com sucesso!" + "\n");
                    break;
                case 4:
                    System.out.println("Insira o nome da pessoa que pretende procurar:" + "\n");
                    String nome3 = sc.next();
                    for (Contacto i : contactos) {
                        if (i.getPessoa().getNome().equals(nome3)) {
                            System.out.println("Contacto encontrado com sucesso!");
                            System.out.println("Index: " + i.getId());
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Lista de contactos:" + "\n");
                    System.out.println(contactos);
                    break;

                case 6:
                    System.out.println("Insira o nome da pessoa:" + "\n");
                    String nome4 = sc.next();
                    System.out.println("Insira o telefone da pessoa:" + "\n");
                    int telefone4 = sc.nextInt();
                    Pessoa pessoa4 = new Pessoa(nome4, 0, null);
                    Contacto contacto4 = new Contacto(pessoa4, telefone4);
                    if (contacto4.getTelefone() == 0) {
                        break;
                    } else {
                        contactos.add(contacto4);
                        System.out.println("Contacto inserido com sucesso!" + "\n");
                        break;
                    }
                case 7:
                    System.out.println("Insira o nome da pessoa:" + "\n");
                    String nome5 = sc.next();
                    System.out.println("Insira o email da pessoa:" + "\n");
                    String email5 = sc.next();
                    Pessoa pessoa5 = new Pessoa(nome5, 0, null);
                    Contacto contacto5 = new Contacto(pessoa5, email5);
                    if (contacto5.getEmail() == null) {
                        break;
                    } else {
                        contactos.add(contacto5);
                        System.out.println("Contacto inserido com sucesso!" + "\n");
                        break;
                    }
                case 0:
                    System.out.println("Adeus!");
                    break;
            }
        } while (input != 0);
        sc.close();
    }
}
