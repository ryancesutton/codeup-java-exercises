public class StringExercise {

    public static void main(String[] args) {

        String brickInWall = "We don't need no education We don't need no thought control";
        System.out.println(brickInWall.substring(0, brickInWall.lastIndexOf("We")) + "\n" + brickInWall.substring(brickInWall.lastIndexOf("We")));

        String checkItOut = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(checkItOut);



    }
}
