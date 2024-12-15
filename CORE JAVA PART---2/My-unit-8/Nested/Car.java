package Nested;

public class Car {
    //Instance variables of car
    private  int noOfDoors;

    //1> Defining method here
    public void repair(){
        //2>defining Typre object
        Tyre myTyre = new Tyre();
    }



    //Nested class ---Defining class under the class is called Nested Class i.e. Tyre
    //we know that the class can only be default or public
    //but inner class (i.e. Tyre here) can be private or protected no restrictions
    //private class means can be only used by itself not even its child can define its objects
    //protected class means obj of this type of class can be accessed by myself,classs child and can be
    //accessed within the child.................
  //  private static class Tyre{ //static nested class
        private  class Tyre{ //non static nested class


            //Here static class is defines means tyre object not associated with Car class lets see example

        //Instance variable of the tyre
        private double width;
        private double pressure;
        private String material;


        ///methds under tyre for car
        public void Inflate(){
           // noOfDoors;//cant get noofdors direcy as tyre is done static
            noOfDoors=4; //accessed directly as class is not static

        }


    }
}
