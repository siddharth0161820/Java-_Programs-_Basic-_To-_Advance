public class Constructorstypes {

    
// //1>INSTANCE VARIABLE/INSTANCE PROPERTIES/INSTANCE ATTRIBUTES
int noOfWheels;
String color;
float maxSpeed;
int currentFuelInLitres;
int noOfSeats;
///declaring a constructor////////
/////UNDERSTANDING PARAMETERIZED CONSTRUCTORS/////////----------------------1
 Constructorstypes(String color, int maxSpeed){ //constructor name should be same as class name 
    //taking color as an argument /// Constructorstypes(String color
              ///initialization of a certain memebers before obj created is done in the constructor
   this.color=color; //mandatory fields or instance variables as taken as an argument for constructor
   //this.color se aap instance var color m local var as an argument pss kkye ho constructortypes m ko assign kro
   this.maxSpeed=maxSpeed;
   noOfWheels=4;
   noOfSeats=2;
   currentFuelInLitres=700;

 }


//2>instance methods /behavior
//metod 0
public Constructorstypes Start(){
   //public void Start(){
      if(currentFuelInLitres==0){
          System.out.println("THIS out of fuel,cant start");
      }
      else if(currentFuelInLitres<5){
          System.out.println("THIS in reserved mode,pls refuel");
          
      }
      else{
          System.out.println("THIS is driving ....hahahahaa ");
  
  
      }
      return this;
 
   }
//method 1
public void Drive(){
    if(currentFuelInLitres<=0){
        System.out.println("car out of fuel");
    }
    else if(currentFuelInLitres<5){
        System.out.println("car in reserved mode,pls refuel");
        currentFuelInLitres--;
    }
    else{
        System.out.println("car is driving ");
        currentFuelInLitres--;

    }
}
//METHOD 2
///this keyword use 2
public void addFuel(float fuel){
    currentFuelInLitres+=fuel;

}

//method 3
public float getCurrentFuelLevel(){
    return currentFuelInLitres;
}

//methd4
public void showCompleteInfo(){
    System.out.println("THE CAR DO HAVE WHEELS OF " +noOfWheels);
    System.out.println("THE CAR DO HAVE SEAT OF " + noOfSeats);
    System.out.println("THE CAR DO HAVE TOPMOST SPEED OF " + maxSpeed);
    System.out.println("THE COLOR OF THE CAR BE " + color);
    System.out.println("THE CURRENT FUEL IN THE CAR BE " + currentFuelInLitres);
}

//////////////////////////////////////////////////////////
//CREATING OBJECT FOR  CLASS 
public class Driver{
    public static void main(String[] args) {
        ////3> declaring object for the class car
       // Car myCar=new Car(); //syntax for declaring object

        // myCar.noOfWheels=4;
        // myCar.noOfSeats=2;
        // myCar.maxSpeed=210;
        // myCar.color="PINK";
      
           
        ////INVOKING/CALLING THE METHODS

       //  myCar.addFuel(7);
       //  myCar.Drive();
       //  myCar.Drive();
       //  myCar.Drive();
       //  myCar.Drive();
       //  myCar.addFuel(2);
       // System.out.println(myCar.getCurrentFuelLevel()); 
       //  myCar.Drive();
       //  System.out.println(myCar.getCurrentFuelLevel());
       // // myCar.showCompleteInfo();
      
       

     //  declaring object for the class constructorstypes with color of the constructortypes-----------2
        Constructorstypes myConstructorstypes=new Constructorstypes("REDISHH",33); //syntax for declaring object
        myConstructorstypes.Start().Drive();
        System.out.println(myConstructorstypes.color);//ye jake direct constrctor ko call krke result dega
        System.out.println(myConstructorstypes.maxSpeed);

       
     
        
    }
}

}


