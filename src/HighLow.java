import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        highLow(scan);
    }

    public static void highLow(Scanner scan) {
        int range = 10 - 1 + 1;
        int numberToGuess = ((int) (Math.random() * range) + 1);
        System.out.println("numberToGuess = " + numberToGuess);

        while (true) {
            System.out.println("Guess a number between 1 and 10: ");
            int userNumber = Integer.parseInt(scan.nextLine());
            if (userNumber > numberToGuess) {
                System.out.println("Lower");
            } else if (userNumber < numberToGuess) {
                System.out.println("Higher");
            } else {
                System.out.println("You got it!");
                break;
            }
        }
    }
}
