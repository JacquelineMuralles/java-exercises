package ExtraPractice;

public class Instructor {
    //          -- firstName
    //           -- lastName
    //           -- brainWaveFrequency
    //           -- Also, keep a count of the total number of instructors

    private String firstName;
    private String lastName;
    private int brainWaveFrequency;
    private static int numInstructors = 0; //making this static, so that when other instructors are created, they'll all be able to access this value to increment it.

    public Instructor(String first, String last){
        this.firstName = first;
        this.lastName = last;
        this.brainWaveFrequency = 0;
        numInstructors++; // we have another instructor now, add to the count

        System.out.printf("%s was just created!\n", firstName);
        System.out.printf("Instructor count: %d\n\n", numInstructors);
    }
    //Getter and Setter for First Name

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first) {
        this.firstName = first;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last) {
        this.lastName = last;
    }


    //Getter and Setter for Brainwave Frequency


    public int getBrainWaveFrequency() {
        return brainWaveFrequency;
    }

    public void setBrainWaveFrequency(int brainWaveFreq) {
        this.brainWaveFrequency = brainWaveFreq;
    }

    //Method to display Instructor Info
    public String displayStats(){
        return String.format("%s %s, Brainwave Frequency: %d", firstName, lastName, brainWaveFrequency);
    }

    //Now let's do something in ArrayLec

}
