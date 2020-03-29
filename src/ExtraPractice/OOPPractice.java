package ExtraPractice;

import java.util.Arrays;

public class OOPPractice {

//---------------------CLASSES AND OBJECTS---------------------
    //Class: used to define a custom type in Java. Can be thought of as a template or a blueprint for objects that will be created based on it.


    //Attribute: a variable that belongs to an object or a class.


    //Methods: are made within objects and classes, they perform functions for the class.

    //Methods & Attributes: accessed with the . operator. By default, both belong to objects, but can be defined as belonging to a class with the "static" keyword.

    //Object: an instance of a class. Has properties and methods, and are instantiated (created with the "new" keyword)






//------------------------EXAMPLE W/NOTES---------------------
//    public class Person {
//        public String firstName;
//        public String lastName;
//        public String sayHello(){
//            return String.format("Hello from %s %s!", firstName, lastName);
//        }
//        public static void main(String[] args){
//            Person rick = new Person();
//            rick.firstName = "Rick";
//            rick.lastName = "Sanchez";
//            System.out.println(rick.sayHello());

            //defined a CLASS named Person
                //contains two instance variables, or properties firstName lastName
                //contains and defines an instance method, sayHello()

            //Inside main method
                //OBJECT instance of Person class is created
                //can now define a variable with a type of Person
                //"new" keyword and name of the class Person followed by an empty set of parenthesis to create an instance.
                //values are then assigned to the object's firstName and lasName fields.
                //then sayHello method is called and prints the message returned.
                //prints "Hello from Rick Sanchez!"




//-------------------STATIC VS INSTANCE------------------------
            //Instance field: The above is an example of an instance field where a field belongs to an instance (as opposed to a class). Each object can have different values (different firstName and lastName)

            //ex:
//            Person ada = new Person();
//            ada.firstName = "Ada";
//            ada.lastName = "Lovelace";
//            System.out.println(ada.sayHello());//Hello from Ada Lovelace!

            //Static field: belong to a class as a whole. Accessible through the class itself. (are accessible without creating an instance of the class.

            //ex:
//            System.out.println(Math.PI);//3.141592653589793

            //in the above ex we didn't need to write code that instantiates the "Math" CLASS (using the "new" keyword)
            //instead, we simply add a "." after the class name and refer to the static property.

            //Static fields are defined with "static" keyword
            //shared by all instances of the class
            //Static properites shouldn't be anything that's supposed to be unique to all instances of the class.
            //Static properties should contain info that all instances will use.


            //ex:
//            class Arithmetic{//Arithmetic class is only meant to be refrenced statically(we only refer to the methods and properites through the class name.
//                //static property
//                public static double pi = 3.14159;
//
//                //static methods
//                public static int add (int a, int b){
//                    return a + b;
//                }
//
//                public static int multiply(int a, int b){
//                    return a * b;
//                }
//            }
//
//            class MathTest{
//                public static void main(String[] args){
//                    Arithmetic.pi;// 3.14159
//
//                    Arithmetic.add(5,5); //10
//                    Arithmetic.multiply(5,5); //25
//
//                }
//            }


            //Static properties can be referenced by instance methods. But instance properties cannot be referenced in static context

//            //ex:
//            class Person {
//                //class property
//                public static long worldPopulation = 7_500_000_000L;
//                //instance property
//                public String name;
//
//                public static void main(String[] args) {
//                    Person theBestDrummerAlive = new Person();
//                    theBestDrummerAlive.name = "Neil Peart";
//
//                    //accessing a static property
//                    Person.worldPopulation += 1;
//                    System.out.println(Person.worldPopulation);//7500000001
//
//                    //Technically this will work, but it is usually better to reference static properties through the class, not instances
//                    System.out.println(theBestDrummerAlive.worldPopulation);//7500000001
//
//
//                    //DON'T DO THIS, IT WILL NOT COMPILE
////                    System.out.println(Person.name);
//                }
//            }

            //Each person has a different name, but world pop is the same for all ppl.
            //you cannot access an instance variable in a static  context(only individual people have names, not people in general)


//---------------------CONSTRUCTORS---------------------------------
    //Constructors is special method that's called when an object is created.
    //Constructors have the same name as the class and does not define a return type.
    //Like any other methods they can accept arguments and be overloaded.

//    //ex:
//    class Person{
//        public String name;
//
//        //the Person constructor
//        public Person(){
//            System.out.println("A Person is being created!");
//        }
//
//        public static void main(String[] args){
//            Person p1 = new Person();//constructor is being called here
//            Person p2 = new Person();//constructor is being called here too
//        }
//    }


    //Constructors are often used to set, or provide default values for, an object's properties:

//    //ex:
//    class Student {
//        public String name;
//        public String cohort;
//
//        public Student(String studentName){
//            name = studentName;
//            cohort = "Unassigned";
//        }
//
//        public Student(String studentName, String assignedCohort){
//            name = studentName;
//            cohort = assignedCohort;
//        }
//
//        public String getInfo(){
//            return String.format("name: %s, cohort: %s", name, cohort);
//        }
//
//        public static void main(String[] args){
//            Student s1 = new Student("Student A");
//            Student s2 = new Student("Student B", "Voyagers");
//            System.out.println(s1.getInfo());//"name: Student A cohort: Unassigned"
//            System.out.println(s2.getInfo());//"name: Student B cohort: Voyagers"
//        }
//
//    }

    //The above is an example shows an OVERLOADED CONSTRUCTOR (there are two definitions that differ in parameter count.
    //


    public class Dog {
        String breed:
        int age:
        String color:

        void bark(){
            int x:

        }

        void run(){
            String s:

        }

        //..More methods
    }

//    Dog dog1 = new Dog();



}




