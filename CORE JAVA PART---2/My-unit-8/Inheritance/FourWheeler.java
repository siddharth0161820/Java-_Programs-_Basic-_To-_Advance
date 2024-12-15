package Inheritance;

import in.Siddharth.Challenge79.TwoWheeler;

public class FourWheeler extends TwoWheeler {
    // setting nooftires constructor under fourwheelers
    FourWheeler() {
        numberOfTires = 4; //setting nooftires and able to access bcz of extends keyword
        // setNumberOfTires(2);

    }
    //create a methods
    public void Safety(){
        System.out.println("4 WHEELER MORE SAFER THAN 2 WHEELER");
    }
}