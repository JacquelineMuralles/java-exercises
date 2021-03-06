package util;


import java.util.InputMismatchException;
import java.util.Scanner;
//TODO: Inside of util, create a class named Input that has a private property named scanner.

public class Input {
    private Scanner scanner;//property of scanner


    //TODO: When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class.

    public Input (){
        scanner = new Scanner(System.in);
    }

    public String getString(){
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Would you like to continue? yes/no");
        String UserInput = scanner.nextLine().toLowerCase();
        if(UserInput.startsWith("y")){
            return true;
        }else {
            return false;
        }
    }

//    public int getInt(int min, int max){
//        do {
//            System.out.print("Enter a number between the min and max: ");
//            int UserNum = scanner.nextInt();
//            if(UserNum < min || UserNum > max){
//                getInt(min, max);
//            }else{
//                return UserNum;
//            }
//        }while (true);
//    }

    public int getInt(){
        System.out.println("Please enter a number.");
            String x = scanner.nextLine();
            int userNum;
        try{
//            System.out.println(x);
            userNum = Integer.parseInt(x);
        }catch(Exception e){
                System.out.println("Sorry that is not a number, try again.");
                return getInt();
        }
        return userNum;
    }

//    public double getDouble(double min, double max){
//        do{
//            System.out.println("Enter a number with a decimal between the min and max: ");
//            double UserDouble = scanner.nextDouble();
//            if(UserDouble < min || UserDouble > max){
//                System.out.println("Try Again");
//                getDouble(min, max);
//            }else{
//                return UserDouble;
//            }
//        }while (true);
//    }

    public double getDouble(){
        System.out.println("Enter a number with a decimal: ");
        String y = scanner.nextLine();
        double userDbl;
        try{
//            System.out.println(y);
            userDbl = Double.parseDouble(y);
        }catch (Exception e){
            System.out.println("Sorry, that is not a double, try again.");
            return getDouble();
        }
        return userDbl;
    }


}
