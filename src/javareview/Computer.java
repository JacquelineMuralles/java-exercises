package javareview;

// We're going to make a computer repair shop.
// First we need to make a computer object.
// The computer object should have 3 properties
// 1. A string for the computer name
// 2. A boolean isPowerOn
// 3. A boolean isBroken
// All properties need getters and setters EXCEPT isBroken needs a getter but NO SETTER
//and a constructor

// Have the Computer object implement the Electronics interface
// Implement all the methods from the interface
// Anytime a computer's isPowerOn boolean is changed from false to true
// there needs to be a 20% chance that the isBroken property is changed to false if it is currently true.
// if it is currently true.

public class Computer implements Electronic{
    private String name;
    private boolean isPowerOn;
    private boolean isBroken;

    public Computer(String newComputerName, boolean newComputerPowerStatus, boolean newComputerBrokenStatus){
        this.name = newComputerName;
        this.isPowerOn = newComputerPowerStatus;
        this.isBroken = newComputerBrokenStatus;
    }

    public void turnOn(){
        if (this.isBroken && !this.isPowerOn){
            this.isPowerOn = true;
            int chanceToFix = (int) Math.floor(Math.random() * 5);//cast Math.floor to int cuz it's auto set to double
            if(chanceToFix == 3){
                this.isBroken = false;
            }
        }else{
            this.isPowerOn = true;
        }
    }



    public void turnOff(){
        this.isPowerOn = false;
    }

    //cmd n gives you getters and setters
    public String getName() {
        return name;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }
}
