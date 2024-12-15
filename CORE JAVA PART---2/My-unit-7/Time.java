public class Time {
    //CREATING CLASS AND OBJECTS IN JAVA

    //1>INSTANCE VARIABLE/INSTANCE PROPERTIES/INSTANCE ATTRIBUTES
    String mySelf;
    String myFamily;
    int myConnection;
    int myHealth;

    //2>NOW,CREATE THE METHODS FOR THE INSTANCE VARIABLE
    //method 1
    public void Me(){
        System.out.println("I AM TALKING ABOUT MYSELF THAT IS " +mySelf);
    }


    //method 2
    public void showFullDetails(){
        System.out.println("Myself is just sitting and writing about " + mySelf);
        System.out.println("THE ONLY PERSON WITH ME DURING MY WORST PHASE IS " + myFamily);
        System.out.println("EVERYBODY FORGOT ME AND TODAY I FORGOT EVERYONE " + myConnection);
        System.out.println("EVERYTHING IS GETTING BAD NEEED TO BE TAKEN CARE OF ESPECIALLY " +myHealth);

    }

    /////////////////creating objects to call the classes 
    /// we can create multilpe objects using one classes
    public class Street{
        public static void main(String[] args) {
            /////////process to call /invoke classes via objects begins
               
            //3> DECLARE OBJECT SYNTAX
            //classname object name=new keyword constructor;
            //new is a keyword of java used to instantiate a class
            Time time1= new Time();
            time1.mySelf="LOSTTTINMAHADEV";
            time1.myConnection=00000;
            time1.myHealth=0;
            time1.myFamily="bhagwan";

            ///4>now,invoking/calling the functions/methods
            time1.Me();
            time1.showFullDetails();

        }
    }

    
}
