import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        //TODO: What happens when you run the following code? It gives us the address (or location in memory) of the array.
        // Why is Arrays.toString necessary? It gives us the actual array output.
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers)
        );

        //TODO: Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.
        String[] People = {"Jim", "Jack", "Jameson"};
        for (String person: People){
            System.out.println(person);
        }

        Person[] people = new Person[3];
        people[0] = new Person ("Jim");
        people[1] = new Person("Jack");
        people[2] = new Person("Jameson");

        for(Person person : people){
            System.out.println("\t" + person.getName());
        }

        Person addition = new Person("Chalupa");
        Person[] updatedPeople = addPerson(people, addition);//created a new array because a new one would be created anyway because of the new addition.

        for(Person person : updatedPeople){
            System.out.println(person.getName());
        }



    }

        //TODO: Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

    public static Person[] addPerson(Person[] inputPeople, Person inputPerson){
        Person[] newPeople = new Person[inputPeople.length + 1];

        for(int i=0; i < inputPeople.length; i++){
            newPeople[i] = inputPeople[i];
        }

        newPeople[newPeople.length - 1] = inputPerson;
        return newPeople;
    }





}
