package Polymorphism;
//public class Plane implements Vehicle {
    public class Plane extends Vehicle {
   //vehicle property inherit to plane now define vehicle responsibity
    //taken by the plane

    //defining the reponsibity of the vehicle in the class     plane
   @Override
   public void start() {
      super.start();//method overriding
       System.out.println("plane is taking offff....");

   }
}
