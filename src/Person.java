public class Person {
    private String name;

    public static int countingPeople = 0;

    public String getName(){//returns a person's name
        return name;
    }

    public void setName(String name){//Once you create an instance of a person in the main
                                    //setName(String name) takes in a String and sets the property of this.name = (String name)
                                    //Setting allows you to give a name to a new person.
                                    //Setting also allows you to change the name of a person (the parameter).
            this.name = name;
    }

    public void sayHello(){//returns Hello msg with name
        System.out.printf("Hello %s%n", name);
    }

    public Person (String name){
        this.name = name;
        countingPeople++;
    }

    public Person(){
        System.out.println("New Person Created");
        countingPeople++;
    }

    public static void main(String[] args) {
        Person NewPerson  = new Person("Jimmy");//uses constructor to make an instance of the person object.
        System.out.println(NewPerson.getName());//tests getName method
        NewPerson.sayHello();
        NewPerson.setName("James");
        System.out.println(NewPerson.getName());


        Person AnotherPerson = new Person();
        AnotherPerson.name = "Jameson";
        System.out.println(AnotherPerson.getName());
        System.out.println(countingPeople);


//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));//true because  the value of person1 = the value of person2
//        System.out.println(person1 == person2);//false because the address of person1 is different from the address of person2.


//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);


//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());//John
//        System.out.println(person2.getName());//John
//        person2.setName("Jane");//Jane
//        System.out.println(person1.getName());//Jane (if you change person2 you change person1
//        System.out.println(person2.getName());//Jane


    }

}
