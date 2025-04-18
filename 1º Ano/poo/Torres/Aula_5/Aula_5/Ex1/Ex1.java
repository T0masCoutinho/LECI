package Aula_5.Ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);
        DateYMD date = new DateYMD(1, 1, 1);

        do {
            System.out.println("Date operations: " + "\n");
            System.out.println("1 - create new date");
            System.out.println("2 - show current date");
            System.out.println("3 - increment day");
            System.out.println("4 - increment month");
            System.out.println("5 - increment year");
            System.out.println("6 - decrement day");
            System.out.println("7 - decrement month");
            System.out.println("8 - decrement year");
            System.out.println("0 - exit" + "\n");

            System.out.println("Enter a number: ");
            input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Enter a day: ");
                    int day = sc.nextInt();
                    System.out.println("Enter a month: ");
                    int month = sc.nextInt();
                    System.out.println("Enter a year: ");
                    int year = sc.nextInt();
                    date = new DateYMD(year, month, day);
                    break;
                case 2:
                    System.out.println("Current date " + date.toString());
                    break;
                case 3:
                    System.out.println("Increment day by: ");
                    int incrementDay = sc.nextInt();
                    date.incrementDay(incrementDay);
                    System.out.println("Current date: " + date.toString());
                    break;
                case 4:
                    System.out.println("Increment month by: ");
                    int incrementMonth = sc.nextInt();
                    date.incrementMonth(incrementMonth);
                    System.out.println("Current date: " + date.toString());
                    break;
                case 5:
                    System.out.println("Increment year by: ");
                    int incrementYear = sc.nextInt();
                    date.incrementYear(incrementYear);
                    System.out.println("Current date: " + date.toString());
                    break;
                case 6:
                    System.out.println("Decrement day by: ");
                    int decrementDay = sc.nextInt();
                    date.decrementDay(decrementDay);
                    System.out.println("Current date: " + date.toString());
                    break;
                case 7:
                    System.out.println("Decrement month by: ");
                    int decrementMonth = sc.nextInt();
                    date.decrementMonth(decrementMonth);
                    System.out.println("Current date: " + date.toString());
                    break;
                case 8:
                    System.out.println("Decrement year by: ");
                    int decrementYear = sc.nextInt();
                    date.decrementYear(decrementYear);
                    System.out.println("Current date: " + date.toString());
                    break;
                case 0:
                    System.out.println("Goodbye :)");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }

        } while (input != 0);
        sc.close();
    }
}
