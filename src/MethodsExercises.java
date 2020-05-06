import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Sum: " + addItUpp(6,8));
        System.out.println("Difference: " + subtractItUp(6, 8));
        System.out.println("Product: " + multiply(6,8));
        System.out.println("Quotient: " + divide(6,3));
        System.out.println("Modulus: " + modulus(7,4));
        System.out.println("Multiply w/ Loop: " + multiplierLoop(2, 4));
        System.out.println("Multiply w/ Rec: " + multiplyRec(10, 10));
        getInteger(1, 10);
        factorial(input);


    }

    public static double addItUpp(double num1, double num2){
        return num1 + num2;
    }

    public static double subtractItUp(double num1, double num2){
        return num1 - num2;
    }

    public static double multiply(double num1, double num2){
        return num1 * num2;
    }

    // SHOULD RESULT IN UNDEFINED BUT GETTING INFINITY
    public static double divide(double num1, double num2){
        if(num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public static double modulus(double num1, double num2){
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

        if(userInput < min || userInput > max){
            System.out.println("Your number is invalid. Try again!");
            return getInteger(min, max);
        } else {
            System.out.println("You number is valid!");
            return userInput;
        }
    }

    public static void factorial(Scanner scan){
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = scan.nextInt();
        System.out.println("You entered: " + userInput);
        int fact = 1;
        for(int i = 1; i <=userInput; i++){
            fact *= i;
        }
        System.out.println(userInput + "! " + "= " + fact);
    }



}
