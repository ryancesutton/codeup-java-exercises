import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//
//        while(i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//        int i = 2;
//
//        do {
//            System.out.println(i);
//            i*=i;
//        } while (i < 1000000);

//        for (int i = 5; i <= 15; i++){
//            System.out.println(i);
//        }
//
//        for (int i = 100; i >= -10; i-=5){
//            System.out.println(i);
//        }


//        for (int i = 2; i < 1000000; i*=i){
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
//
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

        System.out.println("Enter a grade 0 - 100: ");
        String userInput = scanner.nextLine();
        int userGrade = Integer.parseInt(userInput);
        System.out.println("Continue? Type: [yes/no]");
        String yesOrNo = scanner.nextLine();
        if(yesOrNo.equals("yes")){
            if (userGrade >= 0 && userGrade <= 59){
                System.out.println("Your grade is: F");
            } else if (userGrade >= 60 && userGrade <= 66){
                System.out.println("Your grade is: D");
            } else if (userGrade >= 67 && userGrade <= 79){
                System.out.println("Your grade is: C");
            } else if (userGrade >= 80 && userGrade <= 87){
                System.out.println("Your grade is: B");
            } else if (userGrade >= 88 && userGrade <= 100){
                System.out.println("Your grade is: A");
            }
        } else {
            System.out.println("You dont want to see? Ok. We're done here!");
        }


    }
}
