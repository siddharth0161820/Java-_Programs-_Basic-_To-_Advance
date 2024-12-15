  // Calculate the area and circumference of a circle for a given radius using Math.PI

import java.util.Scanner;

public class Challenge72 {
    //1> INSTANCE VARIABLE
    double radiusInCm;
    double areaOfCircle;
    double circumferenceOfCircle;

    //3>DEFINING CONSTRUCTOR
  //WHENEVER ANYONE CREATES AN OBJECT FOR THE CLASS GIVING RAIUSINCM BECAME COMPULSORY
       Challenge72(double radiusInCm){
        this.radiusInCm=radiusInCm;

       }


    //2> CREATING METHODS/FUNCTIONS OF CIRCLE
      //METHOD--1
       public double areaOfCircle(){
        return Math.PI*Math.pow(radiusInCm, 2);
       }

       
         //METHOD--2
         public double circumferenceOfCircle(){
            return 2*Math.PI*radiusInCm;
           }

//////////////////////////////////OVERRIDING TWO STRING////
// @Override
// public String toString() {
//     return "Circle details:RadiusInCm: , CircumferenceOfCircleInCm: , AreaOfTheCircleInCm2:  " ;
// }
  @Override
 public String toString() {
     return "Circle details:RadiusInCm: "+radiusInCm
                           +", CircumferenceOfCircleInCm:"+circumferenceOfCircle()
                           +" , AreaOfTheCircleInCm2: " +areaOfCircle() ;
 }




    public static void main(String[] args) {
        //4> NOW PASSING USER INPUT AS THE RADIUS 
        Scanner input=new Scanner(System.in);

         // READING USER INPUT
         System.out.println("WELCOME TO THE WORLD OF CIRCLE\n");
         System.out.print("PLEASE ENTER THE RADIUS: ");
         double radius = input.nextDouble();

         //5>NOW Creating objects for the class & print
         Challenge72 myChallenge72 =  new Challenge72(radius);
         System.out.println(myChallenge72.toString());



        
    }
    
}
