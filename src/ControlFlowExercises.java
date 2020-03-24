import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i < 16) {
//            System.out.println(i);
//            i++;
//        }



//        int x = 0;
//        do {
//            x += 2;
//            System.out.printf("%d%n", x);
//        } while (x < 100);



//        int y = 105;
//        do {
//            y -= 5;
//            System.out.printf("%d%n", y);
//        } while (y > -10);



//        long z = 2; //long because once value got to 65536 times itself is exactly twice the max value of int.
//        do {
//            z *= z;
//            System.out.printf("%d%n", z);
//        } while (z < 1000000);



//        for (int i = 5; i <= 15; i++){
//            System.out.println(i);
//        }



        for (long i = 2; i < 1000000; i *= i){
            System.out.printf("%d%n", i);
        }

        //print numbers 1-100
        //multiples of 3 print "fizz"
        //multiples of 5 print "buzz"
        //multiples of 3 and 5 "fizzbuzz"
//        for (int i = 0; i < 100; i++){
//            if (i % 15 == 0){
//                System.out.printf("%d: FizzBuzz%n", i);
//            } else if (i % 5 == 0){
//                System.out.printf("%d: Buzz%n", i);
//            }else if (i % 3 == 0){
//                System.out.printf("%d: Fizz%n", i);
//            }
//        }



//        Display a table of powers.
//
//                Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        Example Output
//
//
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//        number | squared | cubed
//        ------ | ------- | -----
//        1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125

        Scanner input = new Scanner(System.in);

        String userConfirm = "Y";

        while(userConfirm.equalsIgnoreCase("y")){
            System.out.println("What number would you like to go up to?");
            int num = Integer.parseInt(input.nextLine());

            System.out.println("Here is your table!");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");

            for(int counter = 1; counter <= num; counter++){
                System.out.printf("%-6d | %-7d | %d%n", counter, counter*counter, counter*counter*counter);
            }

//            System.out.println("Would you like to test another number? Y/N");
//            userConfirm =
        }

//        System.out.println("Please enter an integer");
//        int userNum = input.nextInt();
//
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------ | -----");
//
//        for (int i = 1; i <= userNum; i++){
//            int squared = i * i;
//            int cubed = i * i * i;
//            System.out.printf("%n%-7d|%-7d|%-7d", i, squared, cubed);
//            System.out.println("Would you like to continue?");
//        }


//        boolean gradContinue = true;
//        do{
//            System.out.println("Please enter a number grade");
//            int numericGrade = input.nextInt();
//
//            if(numericGrade >= 88){
//                System.out.println("A");
//            }else if (numericGrade >=80){
//                System.out.println("B");
//            }else if (numericGrade >= 67){
//                System.out.println("C");
//            }else if(numericGrade >= 60){
//                System.out.println("D");
//            }else {
//                System.out.println("F");
//            }
//
//            System.out.println("Would you like to enter a new grade? (y/n)");
//            String userResponse = input.next();
//        }



    }
}
