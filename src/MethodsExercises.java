public class MethodsExercises {
    public static void main(String[] args){
        int timDavid = addition(21, 50);
        System.out.println(timDavid);

        int minusNum = subtraction(10, 5);
        System.out.println(minusNum);

        int notOneTwoBut = multiplication(3, 3);
        System.out.println(notOneTwoBut);

        int divyUpTheGoods = division(100, 10);
        System.out.println(divyUpTheGoods);

        int evenlyDivisable = modulus(9, 3);
        System.out.println(evenlyDivisable);

    }
    public static int addition(int a, int b){
        return a + b;
    }
    public static int subtraction(int a, int b){
        return a - b;
    }
    public static int multiplication(int a, int b){
        return a * b;
    }
    public static int division(int a, int b){
        return a / b;
    }
    public static int modulus(int a, int b){
        return a % b;
    }

//    public static int getInteger(int min)


}
