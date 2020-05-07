package util;

import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);


        public static String getString(){
            System.out.println("Type something: ");
            String input = scanner.nextLine();
            return input;
        }

        public static boolean yesNo (){
            System.out.println("Enter yes or no: ");
            String input = scanner.nextLine();
            if(input.toLowerCase().charAt(0) == 'y'){
                return true;
            } else {
                return false;
            }
        }

        public static int getInt(int min, int max){
            System.out.println("Enter a number: ");
            int input = Integer.parseInt(scanner.nextLine());
            if (input < min || input > max){
                System.out.println("Not valid! Try again.");
                return getInt(min,max);
            } else {
                System.out.println("Your number is: ");
                return input;
            }
        }

        public static int getInt(){
            System.out.println("Enter a number:" );
            int input = Integer.parseInt(scanner.nextLine());
            System.out.println("You entered: ");
            return input;
        }

        public static double getDouble(double min, double max) {
            System.out.println("Enter a number:");
            double input = Double.parseDouble(scanner.nextLine());
            if (input < min || input > max){
                System.out.println("Not valid! Try again.");
                return getDouble(min,max);
            } else {
                System.out.println("Your number is: ");
                return input;
            }
        }

        public static double getDouble(){
        System.out.println("Enter a number:" );
        double input = Double.parseDouble(scanner.nextLine());
        System.out.println("You entered: ");
        return input;
    }







//    public static void main(String[] args) {
//        System.out.println("getString = " + getString());
//        System.out.println("yesNo = " + yesNo());
//        System.out.println("getInt = " + getInt(1,10));
//        System.out.println("getInt = " + getInt());
//        System.out.println("getDouble = " + getDouble(500, 600));
//        System.out.println("getDouble2 = " + getDouble());
//    }



}
