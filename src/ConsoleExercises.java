import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The output of pi is approximately: %.2f%n", pi);



        Scanner input = new Scanner(System.in);

//        System.out.println("Please enter the amount of dogs you have");
//        int numOfDoggos = input.nextInt();
//        System.out.println(numOfDoggos);

//        What happens if you input something that is not an integer?
            //input mismatch exception



//        System.out.println("Please enter your favorite color, ice cream flavor and your favorite flower.");

//        String favoriteColor = input.next();
//        String favoriteFlavor = input.next();
//        String favoriteFlower = input.next();

//        System.out.printf("Your favorite color is: %s%n", favoriteColor);
//        System.out.printf("Your favorite ice cream flavor is: %s%n", favoriteFlavor);
//        System.out.printf("Your favorite flower is: %s%n", favoriteFlower);

//        less than three words: java doesn't allow you to continue until you enter 3 words
//         more than three words: only the first three inputs are accepted



//        System.out.println("Please enter your favorite song lyric");
//        String lyric = input.nextLine();
            //gives you only the first input
//        String lyric = input.nextLine();
            //nextLine method captures everything.
//        System.out.println(lyric);



        System.out.println("Please enter Codeup's classroom length and width");

        int length = Integer.parseInt(input.next());
        int width = Integer.parseInt(input.next());

        int perimeter = (length + width) * 2;
        int area = length * width;

        System.out.println(perimeter);
        System.out.println(area);







    }


}
