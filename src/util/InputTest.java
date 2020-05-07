package util;

public class InputTest {

    public static void main(String[] args) {
        System.out.println("getString = " + Input.getString());
        System.out.println("yesNo = " + Input.yesNo());
        System.out.println("getInt = " + Input.getInt(1,10));
        System.out.println("getInt = " + Input.getInt());
        System.out.println("getDouble = " + Input.getDouble(500, 600));
        System.out.println("getDouble2 = " + Input.getDouble());
    }

}
