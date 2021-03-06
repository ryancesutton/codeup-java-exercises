package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
    }


        public String getString(){
            System.out.println("Type something: ");
            return scanner.nextLine();
        }

        public boolean yesNo (){
            System.out.println("Enter yes or no: ");
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("y")){
                return true;
            } else {
                return false;
            }
        }

        public int getInt(int min, int max){
            System.out.println("Enter a number: ");
            int input = Integer.parseInt(scanner.nextLine());
            if (input < min || input > max){
                System.out.println("Not valid! Try again.");
                return getInt(min,max);
            } else {
                return input;
            }
        }

        public int getInt() throws NumberFormatException{
//            System.out.println("Enter a number:" );
//            int input = Integer.parseInt(scanner.nextLine());
//            System.out.println("You entered: ");
//            return input;
            try {
                String s = getString();
                return Integer.valueOf(s);
            } catch (NumberFormatException e) {
                System.out.println(e);
                System.out.println("Please type a number: ");
                return getInt();
            }

        }

        public double getDouble(double min, double max) {
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

        public double getDouble() throws NumberFormatException{
//        System.out.println("Enter a radius:" );
//        double input = Double.parseDouble(scanner.nextLine());
//        System.out.println("You entered: ");
//        return input;
            try {
                String s = getString();
                return Double.valueOf(s);
            } catch (NumberFormatException e) {
                System.out.println(e);
                System.out.println("Please type a number: ");
                return getInt();
            }
    }



}
