import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a num: ");
        int num = scanner.nextInt();

        String numStr = Integer.toString(num);

        for (int i = 0; i < numStr.length(); i++) {
            System.out.print(numStr.charAt(i));
        }

        boolean answer = isPalindrome(num, numStr, num);

        System.out.println(answer);
        
    }

    public static boolean isPalindrome(int x, String numsStr, int num) {

        if (numsStr.charAt(0) == numsStr.charAt(numsStr.length() - 1)) {
            return true;
        }

        else {
            return false;
        }
    }
}