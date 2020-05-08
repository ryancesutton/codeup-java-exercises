package util;

public class InputTest {

    public static void main(String[] args) {
//        System.out.println("getString = " + Input.getString());
//        System.out.println("yesNo = " + Input.yesNo());
//        System.out.println("getInt = " + Input.getInt(1,10));
//        System.out.println("getInt = " + Input.getInt());
//        System.out.println("getDouble = " + Input.getDouble(500, 600));
//        System.out.println("getDouble2 = " + Input.getDouble());
        Input input = new Input();
        System.out.println("You typed: " + input.getString());
        System.out.println("Yes or no: " + input.yesNo());
        System.out.println("Get integer between: " + input.getInt(1,10));
        System.out.println("Get integer: " + input.getInt());
        System.out.println("Get double between: " + input.getDouble(30, 40));
        System.out.println("Get double: " + input.getDouble());
    }

}
