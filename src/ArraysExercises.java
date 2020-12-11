import java.util.Arrays;
public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        Person[] people = new Person[3];
        people[0] = new Person("Janice");
        people[1] = new Person("Ry");
        people[2] = new Person("Rex");

        // PRINT IT TWO WAYS

        for (int i = 0; i < people.length; i++) {
            System.out.println("Using for loop: " + people[i].getName());
        }

//        people = addPerson(people, new Person("The Dude"));
        people = addPerson2(people, new Person("Mando"));

        for (Person person : people) {
            System.out.println("Using forEach style: " + person.getName());
        }




    }

    public static Person[] addPerson(Person[] people, Person person){
        Person[] newPeople = new Person[people.length + 1];

        for (int i = 0; i < people.length; i++) {
            newPeople[i] = people[i];
        }

        newPeople[newPeople.length -1] = person;

        return newPeople;
    }

    public static Person[] addPerson2(Person[] people, Person person){
        Person[] newPeople = Arrays.copyOf(people, 4);
        newPeople[newPeople.length -1] = person;

        return newPeople;
    }



}
