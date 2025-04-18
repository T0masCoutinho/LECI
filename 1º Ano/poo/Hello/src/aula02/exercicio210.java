package aula02;
import java.util.ArrayList;
import java.util.Scanner;

public class exercicio210 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Enter elements for the array (press Enter to finish):");

        
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            try {
                int element = Integer.parseInt(input);
                arrayList.add(element);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        // Find the maximum value in the ArrayList
        int max = arrayList.get(0);
        int min = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) > max) {
                max = arrayList.get(i);
            }
            if (arrayList.get(i) < min) {
                min = arrayList.get(i);
        }
        }
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }

        double average = (double) sum / arrayList.size();

        System.out.println("Valor Máximo: " + max);
        System.out.println("Valor Minímo: " + min);
        System.out.println("Média dos elementos: " + average);
        
        int ArraySize = arrayList.size();
        System.out.print("Esta sequêcia tem:" + ArraySize + " números");
        
        scanner.close();
    }
}

 
