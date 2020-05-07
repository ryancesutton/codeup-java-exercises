public class Person {

    private String name;

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println(this.name + "Says Hello");
    }

    public Person (String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Person person1 = new Person("Ry Sutton");
        System.out.println(person1.getName(person1.name));
    }
}
