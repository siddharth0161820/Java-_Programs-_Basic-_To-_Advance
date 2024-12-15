public class Codeblocks {
   //2> for codeblocks define a field as noofcodeblocks sold as static
    static int totalNoOfCodeblocksSold;//field declare as static

 //1>INSTANCE VARIABLE/INSTANCE PROPERTIES/INSTANCE ATTRIBUTES
int noOfWheels;
String color;
float maxSpeed;
int currentFuelInLitres;
int noOfSeats;
//////////---UNDERSTANDING CODEBLOCKS----////////////////
      //CODEBLOCKS ---STATEMENTS OR CODE UNDER THE PARENTHESIS{} CALLED AS CODEBLOCKS'
     //defining codeblocks
     //2> declaring static blocks to initialize  totalNoOfCodeblocksSold;
   //  static{
//                  //this block is called when class is getting loaded doesn't bother class is created or not
//                   //or in proper manner we say blocks with static run once when class is loaded;PURE PROGRAM M BSS EK BAAR CALL HOGA
//    //   }
  static{
           totalNoOfCodeblocksSold=0;
           System.out.println("I AM IN STATIC BLOCK");
  }

    ////3> codeblock-----------defining normal block/initialization block;normal block call hota h sbse phle kisi vhi constructor ko cal hone s phle
    {         //INITIALIZATION BLOCK: BLOCKS WITHOUT STATIC RUN EACH TIME AN INSTANCE(OBJ ) IS CREATED
       totalNoOfCodeblocksSold++;
       System.out.println("I AM IN INITIALIZATION BLOCK");
     }
///declaring a constructor////////
/////UNDERSTANDING PARAMETERIZED CONSTRUCTORS/////////----------------------1
 Codeblocks(String color, int maxSpeed){ //constructor name should be same as class name 
    //taking color as an argument /// Constructorstypes(String color
              ///initialization of a certain memebers before obj created is done in the constructor
   this.color=color; //mandatory fields or instance variables as taken as an argument for constructor
   //this.color se aap instance var color m local var as an argument pss kkye ho constructortypes m ko assign kro
   this.maxSpeed=maxSpeed;
   noOfWheels=4;
   noOfSeats=2;
   currentFuelInLitres=700;

 }

 //2> designing 2nd constructor
 //CONSTRUCTOR CAHINING 
 //DESIGNING CONSTRUCTOR IF NOT PSSING ANY ARGUMENT TO IT
 Codeblocks(){ 
   this("refffff", 33);//1 constructor can call other constructor and call by this keyword and put color and maxsppeeedd value
    currentFuelInLitres=4444; //setting fuel as this when called Constructorschaining() print hoga fuel bhi
 }


//2>instance methods /behavior
//metod 0
public Codeblocks Start(){ 
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
        Codeblocks myCodeblocks=new Codeblocks("REDISHH",33); //syntax for declaring object
        //  declaring object for the class constructorsCHAING with no argument pssed to it as local variable-----------2
        //single class with multiple constructor 
     Codeblocks mycCodeblocks1=new Codeblocks(); //syntax for declaring object---constructor 1 with no argument
    
        myCodeblocks.Start().Drive();
        System.out.println(myCodeblocks.color);//ye jake direct constrctor ko call krke result dega--constructor with 2 argument
        System.out.println(myCodeblocks.maxSpeed);
           System.out.println(mycCodeblocks1.color);
           System.out.println(mycCodeblocks1.maxSpeed);
           System.out.println(mycCodeblocks1.currentFuelInLitres);

    
        
    }
}

 }

 