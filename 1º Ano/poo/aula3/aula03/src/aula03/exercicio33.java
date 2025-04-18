package aula03;
import java.util.Scanner;

public class exercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            int randomNum = (int) (Math.random() * (100 - 0 + 1) + 0);
            System.out.println(randomNum); // for reference

            int hiddenNum = (int) (randomNum); // Multiply by 100 to get a larger range
            int userGuess;

            do {
                System.out.print("Guess the number between 100 and 0: ");
                userGuess = sc.nextInt();

                if (userGuess < hiddenNum) {
                    System.out.println("Higher");
                
                } else if (userGuess > hiddenNum) {
                    System.out.println("Lower");
                } else {
                    System.out.println("You guessed the number. Do you want to try again? Y/N");
                    sc.nextLine(); // Consume the newline character left by nextInt()

                    String continueOption = sc.nextLine();
                    if (continueOption.equalsIgnoreCase("Y")) {
                        break; // Break out of the inner loop to restart the game
                    } else {
                        System.out.println("Thanks for playing! Exiting...");
                        System.exit(0);
                    }
                }
            } while (userGuess != hiddenNum);
        

        } while (true); // Infinite loop for restarting the program

        
    }
}
