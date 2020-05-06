public class MethodsExercises {

    public static void main(String[] args){
        System.out.println("Sum: " + addItUpp(6,8));
        System.out.println("Difference: " + subtractItUp(6, 8));
        System.out.println("Product: " + multiply(6,8));
        System.out.println("Quotient: " + divide(6,0));
        System.out.println("Modulus: " + modulus(7,4));
        System.out.println("Multiply w/ Loop: " + multiplierLoop(2, 4));
        System.out.println("Multiply w/ Rec: " + multiplyRec(10, 10));
//        System.out.println("Get Integer: " + getInteger(0,10));

    }

    public static int addItUpp(int num1, int num2){
        return num1 + num2;
    }

    public static int subtractItUp(int num1, int num2){
        return num1 - num2;
    }

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    // SHOULD RESULT IN UNDEFINED BUT GETTING INFINITY
    public static float divide(float num1, float num2){
        return num1 / num2;
    }

    public static int modulus(int num1, int num2){
        return num1 / num2;
    }

    // MULTIPLY WITH FOR LOOP PRODUCT OF 2X4 IS IDK
    public static int multiplierLoop(int a, int b) {
        int result = 0;
        for (int i = 0; i < a; i++) {
            result += b;
        }

        return result;
    }

    // MULTIPLY WITH RECURSION PRODUCT OF 2X4 IS 2+3 + 1+2
    public static int multiplyRec(int a, int b) {

        if ((a == 0) || (b == 0)) {
            return 0;
        }
            return (a + multiplyRec(a, b - 1));

    }

//    public static int getInteger(int min, int max) {
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//
//    }




}
