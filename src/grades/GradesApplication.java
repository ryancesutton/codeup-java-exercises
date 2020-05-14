package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student jimi = new Student("Jimi Hendrix");
        jimi.addGrade(100);
        jimi.addGrade(100);
        jimi.addGrade(100);
        jimi.addGrade(100);

        Student mark = new Student("Mark Knopfler");
        mark.addGrade(98);
        mark.addGrade(97);
        mark.addGrade(96);
        mark.addGrade(95);

        Student doc = new Student("Doc Watson");
        doc.addGrade(95);
        doc.addGrade(94);
        doc.addGrade(93);
        doc.addGrade(92);

        Student brian = new Student("Brian Setzer");
        brian.addGrade(93);
        brian.addGrade(92);
        brian.addGrade(91);
        brian.addGrade(90);

        students.putIfAbsent("himi-jendrix" , jimi);
        students.putIfAbsent("knark-mopfler", mark);
        students.putIfAbsent("woc-datson", doc);
        students.putIfAbsent("sian-bretzer", brian);

        printPrompt(students);
        printStudentData(students);


    }

    public static void printPrompt(HashMap<String, Student> students) {
        System.out.println("Welcome!");
        System.out.println("\nHere is the list of the student's GitHub usernames:\n");
        System.out.print("| ");
        for (String username : students.keySet()) {
            System.out.printf("%s | ", username);
        }
        System.out.println("\n\nWhat student would you like to see more information on?");
    }

    public static void printStudentData(HashMap<String, Student> students){
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        Student foundStudent;
        for (String key : students.keySet()) {
            if (!students.containsKey(key)){
                System.out.printf("Sorry, unable to find username of %s", key);
            } else if(userInput.equalsIgnoreCase(key)) {
                foundStudent = students.get(key);
                System.out.printf("Name: %s - GitHub username - %s\n"
                        + "Current Grade Average - %.2f\n", foundStudent.getName(), key, foundStudent.getGradeAverage());
            }
        }
    }


}
