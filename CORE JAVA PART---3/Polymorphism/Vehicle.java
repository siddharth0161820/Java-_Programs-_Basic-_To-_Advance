package Polymorphism;
//public class Vehicle {
   // public interface Vehicle {
    public  abstract class Vehicle {
        ////FOR UNDERSTANDING SUPER KEYWORD...........///
         //1>INSTANCE PROPERTIES
    private int noOfTyres;
    //2>defining 1ST constructor
    Vehicle(){
        this.noOfTyres=0;
    }
    //3>defining 2Nd constructor
    Vehicle(int noOfTyres){
        this.noOfTyres=noOfTyres;
    }
    //4>DEFINING METHODS()
    public int getNoOfTyres(){
        return this.noOfTyres;
    }

  //6>CREATING A METHODS() HERE...
  // void start();//This method() gets inherited by its child class as well...
      //  public abstract void   start();
  public  void   start(){
      System.out.println("Vehicle is starting....");

  }

}
