package Challenges84;

public abstract class Bird implements Flyable  {
    //1>INSTANCE VARIABLES/PROPERTIES
    private final String wings; // as no need to create setter as value is fixed

    //2> create constructor for the bird

    public Bird(String wings) {
        this.wings = wings;
    }
    //3> create the getter for the bird


    public String getWings() {
        return wings;
    }
}
