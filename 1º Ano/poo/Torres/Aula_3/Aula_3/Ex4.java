package Aula_3;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many students in the class: ");
        int students = sc.nextInt();
        double grades[][] = new double[students][3];

        // grades[0][0] = "NotaT";
        // grades[0][1] = "NotaP";
        // grades[0][2] = "Pauta";

        double NF = 0.0;
        double min = 0.0;
        double max = 20.0;
        int count = 0;

        for (int i = 0; i < students; i++) {
            double NP = ((Math.random() * (max - min) + min) * 10.0) / 10.0;
            double NT = ((Math.random() * (max - min) + min) * 10.0) / 10.0;
            if (NP < 0.0 || NP > 20.0 || NT < 0.0 || NT > 20.0) {
                System.out.println("Invalid Grade! (NP and NT must be between 0 and 20)");
                System.exit(0);
            } else if (NT < 7.0 || NP < 7.0) {
                NF = 66;
                count++;
            } else {
                NF = Math.round(0.4 * NT + 0.6 * NP);
            }
            NF = (int) NF;
            grades[i][0] = NP;
            grades[i][1] = NT;
            grades[i][2] = NF;

        }
        System.out.println("NotaT   NotaP   NotaF");
        for (int i = 0; i < students; i++) {
            System.out.printf("%6.1f %6.1f %6.0f\n", grades[i][0], grades[i][1], grades[i][2]);
        }
        System.out.println("Number of students with NF = 66: " + count);

        sc.close();
    }

}