import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {

   
    public static void main(String[] args) {

    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Let's play Rock Paper Scissors.");
    System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.");
    System.out.println("Are you ready? Write 'yes' if you are");

    String input = scanner.nextLine();
    

    if (input.equals("yes")) {

        System.out.println("Great!");
        System.out.println(" rock - paper - scissors, shoot!");
        
        String choice = scanner.nextLine();
        String computerChoice = computerChoice();

        System.out.println("\nYou chose:     " + choice);
        System.out.println("The computer chose: " + computerChoice);

    }
    
    else {

        System.out.println("Darn, some other time..");
    }
    
        scanner.close();

        
        public static int computerChoice() {

            Random random = new Random();

            int number = random.nextInt(3);

            if (number == 0) {
                return "rock";
            }
            else if (number == 1) {
                return "paper";
            }
            else if (number == 2) {
                return "scissors";
            }
            else {
                return "Error in the app, Please visit this bug.";
            }
    
        }

    }

    

}


