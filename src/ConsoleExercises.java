import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String args[]){

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f", pi);
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer...");
        int userInput = scanner.nextInt();
        System.out.println("You entered: " + userInput);
    }
}
