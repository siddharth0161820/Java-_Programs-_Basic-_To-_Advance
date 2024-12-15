package Inheritance;

import in.Siddharth.Challenge79.TwoWheeler;

public class InheritanceTest {
    public static void main(String[] args) {
        //1> creating objects for the vehicle class
        Vehicle myVehicle = new Vehicle();
        System.out.println(myVehicle.toString());
        System.out.println(myVehicle.hashCode());
        System.out.println(myVehicle.getClass());

        //2>objects for two wheeler class
        TwoWheeler myTwoWheeler = new TwoWheeler();
        //3> call/invoke the methods
        myVehicle.commute();
        myTwoWheeler.commute(); // able to call the methods using myTwoWheeler as its it called
          //in twowheeler class via extends keyword

        //7>Invoking/calling towowheeler methods
        //create obj for Twowheeler class
        TwoWheeler myTwoWheeler1 = new TwoWheeler();
        myTwoWheeler1.balance();

        //8>creating objects for the mototcycle class
        Motorcycle motorcycle = new Motorcycle();
        //invoke/call the mototrcycle methods
        motorcycle.commute();
        motorcycle.Start();
        motorcycle.Stop();

        //9>creating obj for fourwheeler
     FourWheeler myFourWheeler = new FourWheeler();
     myFourWheeler.commute();
     myFourWheeler.Safety();



    }
}
