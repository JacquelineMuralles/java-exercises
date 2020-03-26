import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class JavaPractice {
    public static void main(String[] args){

//------------------------------STRINGS-----------------------------------
        String message = " Hello World " + "!!";
        message.endsWith("!!");
        System.out.println(message.indexOf("p"));// if character is not in the string returns -1
        System.out.println(message.replace("!", "*"));

//-------------------------------ARRAYS-----------------------------------------
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers);//will only give you the address of the array
        System.out.println(Arrays.toString(numbers));//gives you the actual array

        int[] moreNumbers = { 2, 3, 4, 1, 5};
        System.out.println(moreNumbers.length);

        int[][] evenMoreNum = new int [2][3];//gives you two rows and three columns
        evenMoreNum[0][0] = 1;
        System.out.println(Arrays.toString(evenMoreNum));//gives you address
        System.out.println(Arrays.deepToString(evenMoreNum));//prints multi-demensional array

        int[][] curlyNum = { { 1, 2, 3}, { 4, 5, 6} };
        System.out.println(Arrays.deepToString(curlyNum));


//---------------------------------CONSTANT----------------------------------
        final float pi = 3.14F; //need to add F cuz java sees the number as a decimal. Final gets java to treat this variable as a constant.

//----------------------------ARITHMETIC EXPRESSIONS-----------------------------
        int add = 10 + 3;
        System.out.println(add);

        int divide = 10 / 3;//gives you a whole number becauase in java the div of two whole numbers is a whole number
        double newDivide = (double)10 / (double) 3;//numbers must be converted (or casted) to a float or a double in order to get a decimal.
        System.out.println(divide);
        System.out.println(newDivide);

        int x = 1;
        int y = x++;//first value of x gets copied to y ---> then x will incriment by 1.
        System.out.println(y);//gives you 1
        //---> because ++ is after x.
        System.out.println(x);//gives you 2

        int a = 1;
        int b = ++a;//first x will be incremented by 1 so it will be 2 then copied to b.
        System.out.println(b);//gives you 2
        //                                      --->because ++ is before x
        System.out.println(a);//gives you 2

        int c = 1;
        c += 2;
        System.out.println(c);

//----------------------------Order of Operators () -> * / -> + -  --------------------
        int multiOperator = 10 + 3 * 2;
        System.out.println(multiOperator);

        int multiOpParen = (10 + 3) * 2;
        System.out.println(multiOpParen);

//--------------------------------Casting and Type Conversion-------------------------
        //Implicit casting (the 1 below automatically replaces the castX in the castY function)
        // a smaller primitive types can automatically be casted into larger ones like:
                    //byte > short > int > long > float > double
        short castX = 1;
        int castY = castX + 2;// adding a short to an int
        System.out.println(castY);

        double castA = 1.1;
        int castB = (int) castA + 2; //1.1 becomes 1 here because it's being EXPLICITLY CAST as an int
        System.out.println(castB);//result will be 3 instead of 3.1
        //Eplicit casting can only be used among the same types byte, short, int, long, float and double are all numbers so they can be cast to eachother. Strings cannot.

        String castC = "1";
        //Integer.parseInt() = wrapper for int type
        int castD = Integer.parseInt(castC) + 2;
        System.out.println(castD);

        String castE = "1.1";
        //Double.parseDouble() = wrapper for double type
        double castF = Double.parseDouble(castE) + 2;
        System.out.println(castF);

//------------------------------------------Math Class------------------------------------------
        int doingRound = Math.round(1.1F);//rounding a floating point number to a whole number.
        System.out.println(doingRound);//will be 1.

        int doingCeil = (int) Math.ceil(1.1F);//rounds up (to the ceiling) always, no matter what.
        System.out.println(doingCeil);//Will be 2

        int doingFloor = (int)Math.floor(1.1F);//rounds down (to floor) always, no matter what.
        System.out.println(doingFloor);//will be 1

        int doingMax = Math.max(1,2);//will return the greater number
        System.out.println(doingMax);//will be 2

        int doingMin = Math.min(1,2);//will return the lower number
        System.out.println(doingMin);//will be 1

        double doingRando = Math.random();//will return a random floating point number between 0-1. must be a double because of the floating point.
        System.out.println(doingRando);//random number between 0-1

        double doingRandoMore = Math.random() * 100;//will return a random FLOATING POINT # between 0-100.
        System.out.println(doingRandoMore);//random number between 0-100

        int roundRando = (int)Math.round(Math.random() * 100);//returns whole number between 0-100
        System.out.println(roundRando);//random whole number between 0-100

        int wholeRando = (int)(Math.random() * 100);//returns a whole number between 0-100
        System.out.println(wholeRando);

//-------------------------------------Formatting Numbers-----------------------------------

        //Formatting #s to be currency or have percentage signs.
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String formatResult = currency.format(1234567.891);
        System.out.println(formatResult);//$1,234,567.89 is answer

        NumberFormat percentage = NumberFormat.getPercentInstance();
        String result = percentage.format(0.1);
        System.out.println(result);//10% is answer

        String anotherWay = NumberFormat.getPercentInstance().format(0.1);//method chaining
        System.out.println(result);

//----------------------------Input Reading------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are " + age);

        System.out.print("Name: ");
        String name = scanner.nextLine().trim();//trim gets rid of white space.
        System.out.println("You are " + name);


//--------------------------Primitive and Reference Types---------------------------------
        //Primitive types: For storing simple values (store numbers, characters, booleans)

        //byte    = 1 byte  = range: -128 - 127
        //short   = 2 bytes = range -32k  - 32k
        //int     = 4 bytes = range -2B   - 2B
        //long    = 8 bytes =
        //float   = 4 bytes
        //double  = 8 bytes
        //char    = 2 bytes = A,B,C....
        //boolean = 1 byte  = true/false


        //Reference types: for storing complex objects (date, mail msgs)

        //declaring a reference type:
        //the "new" keyword allocates memory for the variable
        //the variable of "now" is an instance of the "Date" class (the blueprint for creating new objects/instances)
        //object is an instance of a class
        Date now = new Date();
        now.getTime();
        System.out.println(now);


        Point point1 = new Point(1,1);
        Point point2 = point1;//reference to the point object's location, not the point object itself --> so it's going to change with Point1
        point1.x = 2;
        System.out.println();//we will now get Point(2,1)

        int j = 1;
        int k = j;//if j = 1 when k is first made to equal j it'll keep the point object of 1 itself in it's memory. So, if j changes later, k will not change with it.











    }
}

