//Simulate a dice roll using Math.random() and display the outcome (1 to 6).
///////////////////////////////////////////////////////////////////////////////////////////////////////
public class Challenge73 {
//1> defining methods/functions for the class
public int roll(){
   //1> double random=Math.random();     //for generating any random number i.e. between 0 & 1 ,1 is exclusive
   //2>doble ranom= Math.random()*6;   //for  generating numbers  that is random and multiply it with 6 to avoid decimal part
   double random= Math.random()*6;
   int currRoll = (int)Math.ceil(random); //doing explicit casting
   return currRoll; 
    }



    public static void main(String[] args) {
        //3> creating objects for the dice
        Challenge73 myChallenge73=new Challenge73();
        for (int i = 0; i < 100; i++) {
            System.out.println(myChallenge73.roll());
            
        }
       
        
    
}
}

