package grades;

import java.util.ArrayList;

public class Student {
    //TODO: Create a class named Student. It should have private properties for the student's name, and grades.
    private String name;//property

    //TODO: The grades property should be an ArrayList of integers.
    private ArrayList<Integer> grades;//array property

    //TODO: The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList.

    public Student(String name) {//constructor
        this.name = name;
        this.grades = new ArrayList<Integer>();//initializing array
    }


    //TODO: The Student class should have the following methods:
    //// returns the student's name
            //public String getName();
    //// adds the given grade to the grades property
            //public void addGrade(int grade);
    //// returns the average of the students grades
            //public double getGradeAverage();

    public String getName() {
        return name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;
        for (double grade: grades){
            sum += grade;
        }
        return sum / grades.size();
    }

    public String getAllGrades(){
        String allStudentGrades = "";
        for (double grade: grades){
            allStudentGrades = allStudentGrades + grade + " ";
        }
        return allStudentGrades;
    }

    //TODO: Test your Student class by adding a main method and creating Student objects. Verify that you can add grades to each object, and that your getGradeAverage method correctly returns the average of the student's grades.
    public static void main(String[] args) {
        Student Jim = new Student("Jim");
        Jim.addGrade(95);
        Jim.addGrade(55);
        Jim.addGrade(75);
        System.out.println(Jim.grades);
        System.out.println(Jim.getGradeAverage());
    }
}
