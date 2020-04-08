package javareview;
// reviewTestJava.java is our store and where everything happens
// It needs to have 2 static properties that are both ArrayLists of computers
// One ArrayList should be named brokenComputers and the other should be named fixedComputers


// Does this work?
// Add two more static properties in BranceTech.java
// Make one Clerk and one Repairer
// Make some computers in BranceTech.java main method and call the clerk's receive computer method
// over and over again and pass the computers to it one at a time.
// The broken pile should have all the computers given to the clerk.
// Everytime the repairer's repairComputer method is called a computer should be taken from the brokenPile and put into the fixedPile
// with the isBroken property set to false.

import java.util.ArrayList;

public class reviewTestJava {
    private static ArrayList<Computer> brokenComputers = new ArrayList<>();
    private static ArrayList<Computer> fixedComputers = new ArrayList<>();

    private static Clerk Jim = new Clerk("Jim");
    private static Repairer Dweight = new Repairer("Dweight");

    public static void main(String[] args) {
        Computer testComputerOne = new Computer("Dell", false, true);
        Computer testComputerTwo = new Computer("Alienware", false, true);
        Computer testComputerThree = new Computer("Apple", false, true);

        Jim.receiveComputer(testComputerOne, brokenComputers);
        Jim.receiveComputer(testComputerTwo, brokenComputers);
        Jim.receiveComputer(testComputerThree, brokenComputers);

        for(Computer computer: brokenComputers){
            System.out.println("Computer.getName() = " + computer.getName());
        }

        Dweight.repairComputer(brokenComputers, fixedComputers);
        Dweight.repairComputer(brokenComputers, fixedComputers);

        System.out.println("---------");
        for(Computer computer : brokenComputers){
            System.out.println("computer.getName() = " + computer.getName());
        }
        System.out.println("---------");
        for(Computer computer : fixedComputers) {
            System.out.println("computer.getName() = " + computer.getName());
            System.out.println("computer.isBroken() = " + computer.isBroken());
        }

    }
}



















