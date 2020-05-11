import java.util.Random;

public class ServerNameGenerator {

    public static String[] adj = {};
    public static String[] nouns = {};


    public static void main(String[] args) {
        System.out.println("Server Name: ");
        System.out.println(getWord(adj) + getWord(nouns));
    }



    public static String getWord(String[] choices) {
        Random random = new Random();
        int randomNumber = random.nextInt(choices.length);
        return choices[randomNumber];
    }

}
