public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello, ");
        System.out.print("World" + "\n");

        int myFavoriteNumber = 3;
        System.out.print("myFavoriteNumber: " + myFavoriteNumber + "\n");

        String myString = "3.14159";
        System.out.println(myString + "\n");

//        long myNumber; //   syntax error
//        System.out.println("myNumber: " + myNumber + "\n");

        long myNumber = 123L;
        System.out.println("myNumber: " + myNumber + "\n");

        myNumber = 123;
        System.out.println("MyNumber: " + myNumber + "\n");

        float myFloatNumber = 3.14f;


//        float myNumber = 3.14;
//        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
        //executes 5 and 6

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
        //executes 6 and 6

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three";
        //what is different between the two errors?
            //first is a runtime error and the second is a compile error.
            //runtime error vs compile time error

//        int x = 4;
////        x = x + 5;
//        x += 5;
//        System.out.print("I'm using \"x\" now: " + x);

        int x = 3;
        int y = 4;
//        y = y * x;
        y *= 3;
        System.out.printf("The value of y is %d and x is %d\n\n", y, x);

//        int x = 10;
//        int y = 2;
////        x = x / y;
////        y = y - x;
//        x /= y;
//        y -= x;
////        System.out.print(x);
//        System.out.print(y);\


//        What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold?
//
//        What happens if you increment a numeric variable past the type's capacity?
//
//        Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.
//
        byte myByte = 0;
        int i = 0;
        while(i < 128) {
            myByte++;
            i++;
        }
        System.out.println("myByte: " + myByte + "\n");


    }

    public static int addInts001(int a, int b) {

        return a + b;
}



}

