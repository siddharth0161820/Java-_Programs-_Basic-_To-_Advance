package Polymorphism;

//public class Car implements Vehicle{
    public class Car extends Vehicle{
        //defining constructor in the car
    Car(int noOfTyres){
      super(noOfTyres);
    }
    //defining blank constructor
    public Car() {
  super();
    }

    //8> creating method() for car ...to understand the need of doing downcasting even though
    //able to create vehicle object
    public int noOfSeats(){
        return 2;
    }
//defining responsibilty of vehicle i.e.. prent class
    @Override
    public void start() {
       // super.getNoOfTyres();
        System.out.println(getNoOfTyres());

        System.out.println("Car IS STARTING...");

    }
}
