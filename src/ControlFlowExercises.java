import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//
//        while(i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//        long i = 2;
//
//        do {
//            System.out.println(i);
//            i*=i;
//        } while (i < 1000000L);

//        for (int i = 5; i <= 15; i++){
//            System.out.println(i);
//        }
//
//        for (int i = 100; i >= -10; i-=5){
//            System.out.println(i);
//        }


//        for (long i = 2L ; i < 1000000L; i*=i){
//            System.out.println(i);
//        }

//        for (int i = 1; i <=100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter an integer: ");
//        String userInput = scanner.nextLine();
//        int userNumber = Integer.parseInt(userInput);
//
//        System.out.println(userNumber);
//        System.out.print("number | squared | cubed\n");
//        System.out.print("------ | ------- | -----\n");
//        for (int i = 1; i <= userNumber; i++) {
//            System.out.printf("%d      | %d       | %d   \n", i, i*i, (i*i*i));
//        }

//        ALTERNATE SOLUTION

        boolean userContinues = true;

        do {
            System.out.println("What number would you like to go to?");
            int userInt = scanner.nextInt();
            System.out.println();
            System.out.println("Here is your table: ");
            System.out.println();
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int i = 1; i <= userInt; i++) {
                System.out.print(i);
                System.out.print(" | ");
                System.out.print(i*i);
                System.out.print(" | ");
                System.out.print(i*i*i);
                System.out.println();
            }
            System.out.print("Would you like to enter another number? [y/n] ");
            String userResponse = scanner.next();
            if(!userResponse.equalsIgnoreCase("y")) {
                userContinues = false;
            }
        } while (userContinues);

//        System.out.println("Enter a grade 0 - 100: ");
//        String userInput = scanner.nextLine();
//        int userGrade = Integer.parseInt(userInput);
//        System.out.println("Continue? Type: [yes/no]");
//        String yesOrNo = scanner.nextLine();
//        if(yesOrNo.equals("yes")){
//            if (userGrade >= 0 && userGrade <= 59){
//                System.out.println("Your grade is: F");
//            } else if (userGrade >= 60 && userGrade <= 66){
//                System.out.println("Your grade is: D");
//            } else if (userGrade >= 67 && userGrade <= 79){
//                System.out.println("Your grade is: C");
//            } else if (userGrade >= 80 && userGrade <= 87){
//                System.out.println("Your grade is: B");
//            } else if (userGrade >= 88 && userGrade <= 100){
//                System.out.println("Your grade is: A");
//            }
//        } else {
//            System.out.println("You dont want to see? Ok. We're done here!");
//        }


    }
}
