package ExtraPractice;

public class MoreMethodsPractice {
    //Methods = functions
    //Methods are a collection of statements performing an operation or several of them.
    public void addTwoNumbers(int num1, int num2){
        System.out.print(num1 + num2);
    }
    //public = Access Modifier
    //void = Return Type (could be int, string, double)
    //addTwoNumbers = Name of Method
    //(int num1, int num2) = Parameters (what you have to supply to the method)
    //System.out.print(num1 + num2); = the body of the method, main part where method performs its action

    public void MinorOrAdult (int age){
        if(age >= 18){
            System.out.println("Adult");
        }else {
            System.out.println("Minor");
        }
    }
}
