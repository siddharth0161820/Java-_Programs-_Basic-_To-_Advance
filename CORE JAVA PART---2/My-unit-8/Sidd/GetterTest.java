package Sidd;

import GetterSetter.Car;


public class GetterTest {
    public static void main(String[] args) {

        //1>Creating an object for the class Car into gettertest class
        // GetterSetter.Car myCar = new GetterSetter.Car("Hola","tolawww",
        //     33,44444444);
         Car myCar = new Car("qwer","xxxx",32,123454321);

         //try to set carName
       // myCar.setCarName("reeeeeedd");
        System.out.printf(" %s  %s  %s ",myCar.getCarName(),myCar.getCarModel(),myCar.getFuelLevel());



    }
}
