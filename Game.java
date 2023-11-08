
import java.util.Random;
abstract class Game {
    protected String[] choices = {"rock", "paper", "scissor"};
    protected Random random = new Random();

    public abstract String computerChoice(); 

    public String winner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!\n";
        } 
        else if 
            (userChoice.equals("rock") && computerChoice.equals("scissor") ||
            userChoice.equals("paper") && computerChoice.equals("rock") ||
            userChoice.equals("scissor") && computerChoice.equals("paper")) 
        {
            return "You win!\n";
        } 
        else 
        {
            return "Computer wins!\n";
        }
    }
    public boolean isValidChoice(String choice) {
        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
    }

}
