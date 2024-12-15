public class Ifelse {
    public static void main(String[] args) {
     
        boolean isMale =false;
        String myName = "Bob";


         //If-else()
         System.out.println("before if");
         if(isMale){
            System.out.println("Mr. "+myName);
         }
         else{
            System.out.println("Ms. "+myName);
         }
         


 
           /////////////////////////////////
           boolean isSeniorCitizen =false;
           boolean isAnAdult =false;

           ////if-else-if ladder() multiple if and else if blocks only one executes;
          if(isSeniorCitizen){
            System.out.println("WELCOME SENOIR CITIZEN");

          }
          else if(isAnAdult){
        
                System.out.println("welcome Youth");
            }
            else{
                System.out.println("welcome kids");
            }
    
          }


    }
    

