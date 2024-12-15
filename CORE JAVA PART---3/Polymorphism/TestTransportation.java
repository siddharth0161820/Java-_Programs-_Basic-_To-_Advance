package Polymorphism;

public class TestTransportation {
    public static void main(String[] args) {
        //1> TRY TO CREATE OBJECT FOR THE CLASSES i.e...Car & Vehicle(in real not possible to create object as it is
        // an abstract class but for this point we will create...)
      //  Vehicle vehicle = new Vehicle();-vehicle is now interface so its object cant be created..
         //5.1 call/invoke CastTest()---
        //castTest(vehicle); //will work


        //1.2> OBJECT FOR THE CAR
        Car car = new Car();
      //  car.start();
        //5.1 call/invoke CastTest()---
       castTest(car); //will work as car is also a vehicle
        //1.3> OBJECT FOR THE PLANE
        Plane plane = new Plane();
       // plane.start();

        //5.1 call/invoke CastTest()---
        castTest(plane);//will work as car is also a vehicle
        //2>Now,undestanding references and objects
        //2.1 UpCasting
        //create reference for parents and declare objects of child inside it
      //  Vehicle v = new Car(); //upcasting
      //  Vehicle v1 = new Plane(); //upcasting

        //3>understand downcasting
        //create reference for child class and declare objects of prents class inside it
      //  Car car = new Vehicle(); //not possible gives compile time error
        //Can perform explicit typecast fot the case as---Car car = new Vehicle();
      //  Car carr = (Car)new Vehicle(); //GIVES ERROR

        //4> NOTE------WE KNOW THAT, OBJECT CLASS IS THE PARENT CLASS FOR ALL THE CLASSES
        //SO CREATE REFERENCE CLASS FOR THE OBJECT CLASS AND TRY TO DECLARE CHILD CLASS INSIDE IT
      //  Object o = new Vehicle();
        Object ob = new Plane();
        Object obj = new Car();


        }
    //5>UNDERSTANDING HOW ACTUALLY DOWNCASTING WORKS WITHOUT GIVIN ANY ERROR
    //CREATE A METHOD AS CASTTEST()
    private static void castTest(Vehicle object){ //takes vehicle object as an argument

        //7>now,situation comes where we passed/define vehicle obj as an argument but
        //we have car object as defined in castTest(Car ) so here downcasting works..lets see
        //Car car = (Car)object; // new Vehicle() --here put vehicle object passed as argument
        //in the CastTest method()..

        object.start();//calls method in the vehicle at car reference
        //7.1 why r we do downcasting as we are able to call the vehicle object seen at  point 1..
        //so lets see point 8 in the car class
       // ((Car) object).noOfSeats();//first object ko car ke reference m cast kro then only u can call noofdoors;
      //  car.noOfSeats();

        //understand instanceof(keyword) check in downcasting
//        if(object instanceof Car){ //means actual obj of vehicle should be the car object
//
//
//        }


    }
}
