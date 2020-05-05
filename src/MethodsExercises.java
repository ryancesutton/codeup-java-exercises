public class MethodsExercises {

    public static void main(String[] args){
        System.out.println("Sum: " + addItUpp(6,8));
        System.out.println("Difference: " + subtractItUp(6, 8));
        System.out.println("Product: " + multiply(6,8));
        System.out.println("Quotient: " + divide(6,0));
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

    public static float divide(float num1, float num2){
        return num1 / num2;
    }
}
