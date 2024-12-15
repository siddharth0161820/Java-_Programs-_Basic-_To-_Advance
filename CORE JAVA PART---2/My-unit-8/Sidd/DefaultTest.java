package Sidd;

import SiddharthKumar.Car;

public class DefaultTest {
    public static void main(String[] args) {
        //using other packages classes we need to import other packages also..import SiddharthKumar.Car;
        Car myCar2 = new Car("PINK","WEWE",5,409090);
       // Car.costOfPurchase=3; //not able to access bcz its within the other packages and can access
        //throughout the packages via using public access modifier

        //NOW LETS CREATE THE OBJECT FOR DEFAULT CLASS IN DEFAULT TEST (UNDER THE PACKAGE Sidd)
          // SiddharthKumar.Default mySidd = new // not able to create

    }
}
