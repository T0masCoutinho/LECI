package aula03;
import java.util.Scanner;

public class exercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();

       
        System.out.println(frase.toLowerCase());

        
        char lastCharacter = frase.charAt(frase.length() - 1);
        System.out.println("Last Character: " + lastCharacter);

        
        String firstThreeCharacters = frase.substring(0, Math.min(frase.length(), 3));
        System.out.println("First Three Characters: " + firstThreeCharacters);
        
        String setence1 = sc.nextLine();
        String setence2 = sc.nextLine();
        System.out.println(setence1.equals(setence2));

        System.out.println(frase.hashCode());
        System.out.println(frase.length());

        sc.close();

    }
}
