package grades;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
        static HashMap<String, Student> students = new HashMap<>();

    public static void main(String[] args) {

        Student Jim = new Student("Jim");
        Jim.addGrade(95);
        Jim.addGrade(55);
        Jim.addGrade(75);

        Student Pam = new Student("Pam");
        Pam.addGrade(92);
        Pam.addGrade(86);
        Pam.addGrade(88);

        Student Kevin = new Student("Kevin");
        Kevin.addGrade(65);
        Kevin.addGrade(70);
        Kevin.addGrade(50);

        Student Angela = new Student("Angela");
        Angela.addGrade(95);
        Angela.addGrade(97);
        Angela.addGrade(98);



        students.put("FunnyDude", Jim);
        students.put("WhitestSneakers", Pam);
        students.put("ChiliMaster", Kevin);
        students.put("CatsForever", Angela);

        System.out.println("Welcome to the office!\n");
        System.out.println("Here are the GitHub usernames of our students: \n");
        askUser();
    }
    public static void askUser() {
        System.out.println(students.keySet() + "\n");
        System.out.println("What student would you like to see more information on?\n");
        Scanner input = new Scanner(System.in);
        String userChoice = input.nextLine();

        if (students.containsKey(userChoice)) {
            System.out.printf("\nName: %s - GitHub Username: %s\n Grades: %s\n Current Average: %s\n", students.get(userChoice).getName(), userChoice, students.get(userChoice).getAllGrades(), students.get(userChoice).getGradeAverage());
            System.out.println("Would yo like to see another student?\n");
            String anotherStudent = input.nextLine();
            if (anotherStudent.equalsIgnoreCase("n") || anotherStudent.equalsIgnoreCase("no")) {
                System.out.println("Thanks for visiting, have a nice day.\n");
            } else {
                askUser();
            }
        }else{
            System.out.printf("\n Sorry, we do not have a student by the GitHub username of %s.\n", userChoice);
        }

    }
}
