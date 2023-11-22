import java.util.Scanner;

public class Javapedia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many persons will you register?");
        int figures = scanner.nextInt();

        String [][] database = new String[figures][3];

        scanner.nextLine();

        for (int i = 0; i < database.length; i++) {

            System.out.println("\t" + (i + 1) + ". Figure ");

            System.out.print("\t - Name: "); 
            database[i][0] = scanner.nextLine();
            System.out.print("\t - Date of birth: ");
            database[i][1] = scanner.nextLine();
            System.out.print("\t - Occupation: ");
            database[i][2] = scanner.nextLine();
            System.out.print("\n");

        }

        System.out.println("These are the values you stored:\n");
        print2DArray(database);

        System.out.print("\n");

        System.out.println("Who do you want information on? ");

        System.out.print("\n");
        
        String userinput = scanner.nextLine();

        System.out.print("\n");
        

        for (int i = 0; i < database.length; i++) {
                if (database[i][0].equals(userinput)) {
                    System.out.println("\tName: " + database[i][0]);
                    System.out.println("\tDate of birth: " + database[i][1]);
                    System.out.println("\tOccupation: " + database[i][2]);
                    System.out.print("\n");
                }
        }

    }
        public static void print2DArray(String[][] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print("\t");
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.print("\n");
            }
        }
    
}
