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

        for (int i = 1; i <=100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

    }
}
