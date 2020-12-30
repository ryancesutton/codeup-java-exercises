public class Warmup {

    public static double cube(double num) {
        return Math.pow(num, 3);
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static void main(String[] args) {
        System.out.println(cube(3));
        System.out.println(subtract(5, 3));
        System.out.println(subtract(10.5, 6.4));
    }



}
