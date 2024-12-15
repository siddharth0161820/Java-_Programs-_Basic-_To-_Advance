package Inheritance;
////////OBJECT CLASS------AS VEHICLE CLASS DONT AVE ANY PARENT CLASS-/////////////
//CREATE OBJ FOR VEHICLE CLASS AND TEST WAT WE SEE
public class Vehicle {
    //1>Instance variables/properties
  //  public int numberOfTires;

    ///////////////////////////////////////////////////////////////
//   ------understand this point
   // private int numberOfTires;
    //setting to default
   //  int numberOfTires;
//if need to access functionality in other package use protected
    protected  int numberOfTires;
    //now need to do setter to access in other class this property

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    ////////for object class---we can overide tostring means make by own

    @Override
    public String toString() {
        return "NUMBER OF TIRES IN THE VEHICLE IS "+numberOfTires;
    }

    //////////////////////////////////////////////////////////

    //defining constructor to set the numberof tires to be set
//    Vehicle(){
//        numberOfTires=11;
//    }

    //2>methods/behavior
//  commute---  to travel regularly to and from a place and
//    especially between where you live and where you work.

    public void commute(){
        System.out.printf("I am going from place A to place B using %d tires\n",numberOfTires);

    }

}
