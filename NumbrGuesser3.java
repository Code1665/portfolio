import java.util.Scanner;

public class NumbrGuesser3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int number = (int) (Math.random() * 100) + 1;

        int K = 5;

        System.out.println("You have to guess a number between 1-100");
        System.out.println("You have 5 trials.");
        int i, guess;

        for (i = 0; i < K; i++) {
            System.out.print("Guess the number: ");
            guess = scanner.nextInt();

            if (number == guess && i != K - 1) {
                System.out.println("Congrats! " + number + " is the right number.");
                
            }
            
            else if (number > guess && i != K - 1) {
                System.out.println("You guessed to low the number is less than " + guess);

            }
            else if (number < guess && i != K - 1) {
                System.out.println("You guessed to high the number is higher than " + guess);
            }

        }
        if (i > K) {

            System.out.println("GAME OVER.");
            System.out.println("No more trials left.");
            System.out.println("The number was " + number);
        }

    }
    
}
