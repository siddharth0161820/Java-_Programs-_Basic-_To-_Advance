package in.Siddharth.Challenge79;

//to use old class properties /functionalities use the keword extends with old class name

import Inheritance.Vehicle;

public class TwoWheeler extends Vehicle {
    //4>setting nooftires constructor under twowheelers
   public TwoWheeler(){
       // numberOfTires=2; //setting nooftires and able to access bcz of extends keyword
    setNumberOfTires(2);
        numberOfTires=33; ////able to access(default properties) bcz he class are in the same package that is Inheritance
    }

    //5>defining methods/behavior
    public void balance(){
        System.out.println("Balancing of Vehicle done using two tires");
    }


}
