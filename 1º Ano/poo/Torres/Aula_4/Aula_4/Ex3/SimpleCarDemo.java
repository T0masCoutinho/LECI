package Aula_4.Ex3;

import java.util.Scanner;

public class SimpleCarDemo {
    static Scanner sc = new Scanner(System.in);

    static void listCars(Car[] cars) {
        // Exemplo de resultado
        // Carros registados:
        // Renault Megane Sport Tourer, 2015, kms: 35356
        // Toyota Camry, 2010, kms: 32456
        // Mercedes Vito, 2008, kms: 273891
        System.out.println("Carros registados: ");
        for (int i = 0; i < cars.length; i++) {
            System.out.printf("%s %s, %d, kms: %d \n", cars[i].getMake(), cars[i].getModel(), cars[i].getYear(),
                    cars[i].getKms());
        }
    }

    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car("Renault Megane", "Sport Tourer", 2015, 35356);
        cars[1] = new Car("Toyota", "Camry", 2010, 32456);
        cars[2] = new Car("Mercedes", "Vito", 2008, 273891);

        listCars(cars);

        // Adicionar 10 viagens geradas aleatoriamente
        for (int i = 0; i < 10; i++) {
            int j = (int) Math.round(Math.random() * 2); // escolhe um dos 3 carros
            int kms = (int) Math.round(Math.random() * 1000); // viagem até 1000 kms
            System.out.printf("\nCarro %d viajou %d quilómetros.", j, kms);

            cars[j].drive(kms);
        }
        System.out.println("\n");
        listCars(cars);

        sc.close();
    }
}