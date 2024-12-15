package Inheritance;

import in.Siddharth.Challenge79.TwoWheeler;

public class Motorcycle extends TwoWheeler {


    //6>adding instance variables/proeprties
    public double petrolCapacity;

    //6>adding behavior/methods
    public void Start(){
        System.out.println("Starting");
    }

    public void Stop(){
        System.out.println("Stop when distance travelled,Thank You");
    }

}
