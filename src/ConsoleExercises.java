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

        System.out.println("Enter three words...");
        String first = scanner.next();
        String second = scanner.next();
        String third = scanner.next();
        System.out.printf("You entered: %s %s %s", first, second, third);
        System.out.println("");

        System.out.println("Enter a sentence...");
        String sentence = scanner.next();
        String userSentence = scanner.nextLine();
        System.out.println("You entered: " + sentence + userSentence);

        System.out.println("Enter the width...");
        String w = scanner.nextLine();
        float x = Float.parseFloat(w);
        System.out.println("Enter the length...");
        String l = scanner.nextLine();
        float y = Float.parseFloat(l);


        System.out.println("Area: " + (x*y));
        System.out.println("Perimeter: " + ((x*2) + (y*2)));


    }
}
