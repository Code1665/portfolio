import java.util.Scanner;

public class CurrencyConverter2 {

    public static void main(String[] args) {

        /* This block is asking for userinput */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which currency do you want to convert?");
        System.out.println("1) USD to EUR");
        System.out.println("2) EUR to USD");
        System.out.println("3) Pounds to USD");

        /* Defining userinput variable */
        int exchange = scanner.nextInt();

        /* using switch method and userinput variable to go further within the 3 chosen exchange options */
        switch(exchange) {

            case 1: {
                /* Asking for userinput and declaring a double value  */
                System.out.println("Enter the number of USD.");
                double usd = scanner.nextDouble();
                
                if (usd >= 0) {
                    System.out.println(usd + " USD is " + usd*0.98 + " EUR");
                }
                else {
                    System.out.println("Enter a positive number.");
                }
            }
        
            break;
            case 2: {
                System.out.println("Enter a number of EUR");
                double eur = scanner.nextDouble();

                if (eur >= 0) {
                    System.out.println(eur + " EUR is " + eur*1.01 + "USD");
                }
                else {
                    System.out.println("Enter a positive number.");
                }
            }
            break;
            case 3: {
                System.out.println("Enter a number of pounds");
                double pounds = scanner.nextDouble();

                if (pounds >= 0) {
                    System.out.println(pounds + " pounds is " + pounds*1.28 + " USD");
                }
                else {
                    System.out.println("Enter a positive number.");
                }
            }
            break;
        }
    }
    
}
