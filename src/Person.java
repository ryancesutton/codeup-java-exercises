public class Person {

    private String name;

    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void sayHello(){
        // USING PRE CREATED METHOD TO GET NAME
        System.out.println(getName() + " says hello!");
    }

    public Person (String name) {
        // USING PRE CREATED METHOD TO SET NAME
        setName(name);
//        this.name = name;
    }

    public static void main(String[] args) {

//        Person aPerson = new Person("Ry");
//        System.out.println(aPerson.getName(aPerson.name));
//        aPerson.setName("Rex");
//        aPerson.sayHello();

        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);


//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }
}
