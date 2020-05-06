import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Sum: " + addItUpp(6, 8));
        System.out.println("Difference: " + subtractItUp(6, 8));
        System.out.println("Product: " + multiply(6, 8));
        System.out.println("Quotient: " + divide(6, 3));
        System.out.println("Modulus: " + modulus(7, 4));
        System.out.println("Multiply w/ Loop: " + multiplierLoop(2, 4));
        System.out.println("Multiply w/ Rec: " + multiplyRec(10, 10));
        getInteger(1, 10);

        while(true) {
            factorial();
            System.out.println("Would you like to continue? [y/n]");
            String yesOrNo = scan.nextLine();
            if (yesOrNo.toLowerCase().equals("n")){
                System.out.println("Okay we're done!");
                break;
            }
        }

        rollDice(scan);



    }

    public static double addItUpp(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtractItUp(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // SHOULD RESULT IN UNDEFINED BUT GETTING INFINITY
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public static double modulus(double num1, double num2) {
        return num1 / num2;
    }

    // MULTIPLY WITH FOR LOOP PRODUCT OF 2X4 IS IDK
    public static double multiplierLoop(double a, double b) {
        double result = 0;
        for (double i = 0; i < a; i++) {
            result += b;
        }

        return result;
    }

    // MULTIPLY WITH RECURSION PRODUCT OF 2X4 IS 2+3 + 1+2
    public static double multiplyRec(double a, double b) {

        if ((a == 0) || (b == 0)) {
            return 0;
        }
        return (a + multiplyRec(a, b - 1));

    }

    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = Integer.parseInt(scan.nextLine());

        if (userInput < min || userInput > max) {
            System.out.println("Your number is invalid. Try again!");
            return getInteger(min, max);
        } else {
            System.out.println("You number is valid!");
            return userInput;
        }
    }

    public static void factorial() {
        int userInput = getInteger(1, 10);
        long total = 1L;
        System.out.println("You entered: " + userInput);
        for (int fact = userInput; fact > 0; fact--) {
            total = total * fact;
        }
        System.out.println(userInput + "!" + " = " + total);

    }


    public static void rollDice(Scanner scan) {

        while (true) {
            System.out.println("Enter the number of sides for a pair of dice: ");
            short userInput = Short.parseShort(scan.nextLine());
            int range = userInput - 1 + 1;
            System.out.println("First Die = " + ((int)(Math.random() * range) + 1));
            System.out.println("Second Die = " + ((int)(Math.random() * range) + 1));

            System.out.println("Roll the dice? [y/n]");
            if(scan.nextLine().equalsIgnoreCase("n")) {
                System.out.println("Okay we're done!");
                break;
            }
        }


    }





}
