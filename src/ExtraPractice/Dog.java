package ExtraPractice;

public class Dog {
    private String breed;//instance properties
    private String size;//instance properties
    private int age;//instance properties
    private static int numberOfDogsCreated;//static property

    public Dog (String breed, String size, int age){//dog constructor
        this.breed = breed;
        this.size = size;
        this.age = age;
        numberOfDogsCreated++;
    }

    public String getBreed() {//getter for breed
        return breed;
    }

    public String getSize() {//getter for size
        return size;
    }

    public int getAge(){//getter for age
        return age;
    }

    public static int getNumberOfDogsCreated(){//getter for number of dogs created
        return Dog.numberOfDogsCreated;
    }

    public void setBreed(String breed){//setter for breed
        this.breed = breed;
    }

    public void setSize(String size){//setter for size
        this.size = size;
    }

    public void setAge(int age){//setter for age
        this.age = age;
    }

    public void dogBarks(Boolean barking){
        if(barking){
            System.out.println("Dog is barking.");
        }else{
            System.out.println("Good Doggo!");
        }
    }


    //THROW EXCEPTIONS ON METHODS
    public int dogYears(int humanAge) throws Exception{
        int conversion = humanAge * 7;

        if(conversion >= 91){
            throw new Exception("Dogs do not live that long.");
        }
        return conversion;
    }

//    public int dogYears(int humanAge){
//        try {
//            humanAge = getAge();
//        }catch (Exception e){
//            System.out.println("Please enter a valid number");
//        }
//        return humanAge * 7;
//    }



    public static void main(String[] args)throws Exception {
        Dog Jameson = new Dog("Pit", "L", 6);
        Dog AirBud = new Dog("Retriever", "L", 99);
        System.out.printf("There are %s amount of dogs created.\n", getNumberOfDogsCreated());
        Jameson.dogBarks(true);
        AirBud.dogBarks(false);
        System.out.printf("Your dog is %d dog-years-old.\n", Jameson.dogYears(Jameson.getAge()));
        System.out.printf("Your dog is %d dog-years-old.\n", AirBud.dogYears(AirBud.getAge()));
    }

    //public
    //protected
    //private
    //

}
