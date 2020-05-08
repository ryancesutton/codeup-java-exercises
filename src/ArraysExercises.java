import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people;
        people = new Person[3];
        people[0] = new Person("Janice");
        people[1] = new Person("Ry");
        people[2] = new Person("Rex");

        // PRINT IT TWO WAYS

        for (int i = 0; i < people.length; i++) {
            System.out.println("Using for loop: " + people[i].getName());
        }

        for (Person person : people) {
            System.out.println("Using forEach style: " + person.getName());
        }


//        public static Person[] addPerson (people[]){
//            people[4] = new Person("The Dude");
//        }

    }



}
