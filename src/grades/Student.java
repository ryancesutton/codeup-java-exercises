package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList <Double> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(double grade) {
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (Double grade : this.grades) {
            sum += grade;
        }
        return (sum / this.grades.size());
    }


//    public static void main(String[] args) {
//
//        Student student  = new Student("Ry");
//        student.addGrade(98);
//        student.addGrade(98);
//        student.addGrade(92);
//
//        System.out.println(student.getName() + "'s average is: " + student.getGradeAverage());
//
//    }




}
