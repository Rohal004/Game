
import java.util.Scanner;

import java.util.Random;


public class Main {

    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Computer (); 

        boolean playAgain = true;

        while (playAgain) {
            System.out.println("\nWelcome to Rock, Paper, Scissors!\n");
            System.out.print("Enter your choice (rock, paper, or scissors): ");
            String userChoice = scanner.next().toLowerCase();

            if (!game.isValidChoice(userChoice)) {
                System.out.println("Invalid input. Please choose 'rock', 'paper', or 'scissor'.\n");
                continue;
            }

            String comChoice = game.computerChoice(); 
            System.out.println("\nComputer's choice: " + comChoice);

            String result = game.winner(userChoice, comChoice);
            System.out.println("\n"+result);

            boolean response = false;
            while (!response) {
                System.out.print("Do you want to play again? (yes/no): ");
                String playAgainoption = scanner.next().toLowerCase();
                if (playAgainoption.equals("yes")) {
                    playAgain = true;
                    response = true;
                } else if (playAgainoption.equals("no")) {
                    playAgain = false;
                    response = true;
                } else {
                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                }
            }
        }

        scanner.close();
    }
}
