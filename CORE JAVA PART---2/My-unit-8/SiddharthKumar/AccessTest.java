package SiddharthKumar;

public class AccessTest { //this will test the car class
    public static void main(String[] args) {

        //1> create object for  Car class
        Car myCar= new Car();
        //to access car
        myCar.carName = "HURRYBAWA";
        myCar.carModel = "DHURIBAWA";
        System.out.println(myCar);
       // myCar.costOfPurchase=344; cant be accessed as it is private and can only be accessed
         // the car class(its own class). for creatign toString() && constructor
      //now able to access
        myCar.CoastOfPurchase= 333; //bcz we removed access modifer and made default ownership
        //and accessed within same packages
         //creating new obj to access car class details via creating toString() && constructor
        Car myCar1 = new Car("AQAQ","trtrrtr",
                    32,32232);
        System.out.println(myCar1.toString());

        //////////////
        //HERE LETS CREATE THE OBJ FOR THE CLASS DEFAULT UNDER THE SAME PACKAGE
        Default myDefault = new Default(); //obj for default class can be created only within the same packages





    }
}
