public class Statickeyword {

    
 // //1>INSTANCE VARIABLE/INSTANCE PROPERTIES/INSTANCE ATTRIBUTES
 int noOfWheels;
 String color;
 float maxSpeed;
 int currentFuelInLitres;
 int noOfSeats;


 //2>instance methods /behavior
 //method 1
 public void Drive(){
     if(currentFuelInLitres<=0){
         System.out.println("car out of fuelha ");
     }
     else if(currentFuelInLitres<5){
         System.out.println("car in reserved mode,pls refuel,,,,,,,,,,,,,,,,,,");
         currentFuelInLitres--;
     }
     else{
         System.out.println("car is driving.,.,.,.,.,., ");
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
     System.out.println("THE Static keyword DO HAVE WHEELS OF " +noOfWheels);
     System.out.println("THE  Static keyword DO HAVE SEAT OF " + noOfSeats);
     System.out.println("THE  Static keyword DO HAVE TOPMOST SPEED OF " + maxSpeed);
     System.out.println("THE COLOR OF THE  Static keyword BE " + color);
     System.out.println("THE CURRENT FUEL IN THE  Static keyword BE " + currentFuelInLitres);
 }

 //////////////////////////////////////////////////////////

 /////////////////////////////////////////////////------------STATIC KEYWORD-------------///////////////
 
 //CREATING OBJECT FOR  CLASS CAR
 public class Driver{

    ///4> creating static member for the driver
    static int minAgeForDrive=18;
    ////2>giving driver its own property
              String name;
             String dateOfLicense;
             int age;
    //1>WHY WE DO MAKE MAIN METHOD STATIC?
 //we make main method static because jvm should not create object for it

 //jvm can directly access it as Driver(entrypoint).main();

   ///6>having one non static memvers
   public boolean isAllowedToDrive(){//this is non static method/instance method where we directly accessed static member( minagefordrive)
    //so static field (minagefordrive)ko meine non-static method aur static method k andar bhi access kr paya but non-staic filead ya non static method
    //ko static k andar access nhi kr skta
    return this.age>=minAgeForDrive;

   }
 
     public static void main(String[] args) {
         ////3> declaring object for the class  Statickeyword
       //  Statickeyword myStatickeyword=new Statickeyword(); //syntax for declaring object

         // myCar.noOfWheels=4;
         // myCar.noOfSeats=2;
         // myCar.maxSpeed=210;
         // myCar.color="PINK";
       
            
         ////INVOKING/CALLING THE METHODS

        //  myStatickeyword.addFuel(7);
        //  myStatickeyword.Drive();
        //  myStatickeyword.Drive();
        //  myStatickeyword.Drive();
        //  myStatickeyword.Drive();
        //  myStatickeyword.addFuel(2);
        // System.out.println(myStatickeyword.getCurrentFuelLevel()); 
        //  myStatickeyword.Drive();
        //  System.out.println(myStatickeyword.getCurrentFuelLevel());
        // // myCar.showCompleteInfo();
        /////obj creation for driver in static kywrd///
      //3>creating object for Driver
      Driver myDriver=new Driver(); //syntax for declaring object
      // dateOfLicense="1/jan/2024";//gives error as statc memeber(insie psvm) cannot access instance member/non static memeber so to access it use object
       //to static member to access instance member/non static memeber
      myDriver.name = "gddgf";
       //5>
       System.out.println(minAgeForDrive); //can be printed easily no need for object along bcz main method where we r printing is also static
       //and jisko access kr rhe wo bhi static hain so both static can be accessed /used easily without any effort 



        
    
               
     }
     

      
 }
  
       
 
}

