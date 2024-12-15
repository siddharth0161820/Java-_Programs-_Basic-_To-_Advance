public class Thiskeyword {
    //////UNDERSTANDING THIS KEYWORD///////////////
 // //1>INSTANCE VARIABLE/INSTANCE PROPERTIES/INSTANCE ATTRIBUTES
 int noOfWheels;
 String color;
 float maxSpeed;
 int currentFuelInLitres;
 int noOfSeats;


 //2>instance methods /behavior
 //METHOD 0
 ///////process 1 for this keyord///
 //avi jiss context m ho ushi ko return ko
 public Thiskeyword Start(){
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
    return this; //this can be used to refer current class instance variable---point 1
     //internally kisi cheez ko access krna h toh with same context i.e. start use this(mtlb current object refer kr rha) as return
                 

 }
 //method 1
 public void Drive(){
    System.out.println("THE CAR IS DRIVING");
    currentFuelInLitres--;
 }
 //METHOD 2
    ///this keyword use 2======//this can be used to invoke/call curent class method(implicitly)
    public void addFuel(float currentFuelInLitres){ //passing argument as var inside as "currentFuelInLitres"
    //here andar wale ko piority milega aur wo add hoge but mujhe instance varibale add krni hai so use this keyword
       this.currentFuelInLitres+= currentFuelInLitres;
       //this. currentFuelInLitres=currentFuelInLitres+currentFuelInLitres; ///this means trigger to current object
    }


 //method 3
 public float getCurrentFuelLevel(){
     return currentFuelInLitres;
 }

 //methd4
 public void showCompleteInfo(){
     System.out.println("THE THIS DO HAVE WHEELS OF " +noOfWheels);
     System.out.println("THE THIS DO HAVE SEAT OF " + noOfSeats);
     System.out.println("THE THIS DO HAVE TOPMOST SPEED OF " + maxSpeed);
     System.out.println("THE COLOR OF THE THIS BE " + color);
     System.out.println("THE CURRENT FUEL IN THE THIS BE " + currentFuelInLitres);
 }

 //////////////////////////////////////////////////////////
 //CREATING OBJECT FOR  CLASS CAR
 public class Driver{
     public static void main(String[] args) {
         ////3> declaring object for the class Thiskeyword
        //  Thiskeyword myThis=new Thiskeyword(); //syntax for declaring object

        //  // myCar.noOfWheels=4;
        //  // myCar.noOfSeats=2;
        //  // myCar.maxSpeed=210;
        //  // myCar.color="PINK";
       
            
        //  ////INVOKING/CALLING THE METHODS

        //  myThis.addFuel(72);
        //  myThis.Drive();
        //  myThis.Drive();
        //  myThis.Drive();
        //  myThis.Drive();
        //  myThis.addFuel(12);
        // System.out.println( myThis.getCurrentFuelLevel()); 
        // myThis.Drive();
        //  System.out.println( myThis.getCurrentFuelLevel());
        // // myCar.showCompleteInfo();


        ///////FOR THIS KEYWORD//////
        //declaring object for the class Thiskeyword
         //classname object name=new keyword constructor;
            //new is a keyword of java used to instantiate a class
        Thiskeyword myThis=new Thiskeyword();
        
        //invoke/call the method
        myThis.addFuel(7);
        myThis.Start().Drive();////this can be used to refer current class instance variable---point 1
        //car k refernce jo start ho wo retrun kr rha
        //benefit we can chain the methods in this keword
        //mtThis.Start returns --->
       // myThis.Drive();
       


       
        
      
         
     }
 }
 
}

    

