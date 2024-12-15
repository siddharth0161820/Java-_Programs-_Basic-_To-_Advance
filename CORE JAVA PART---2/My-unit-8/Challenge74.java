 //Create a number guessing game where the program selects a random number, and the user has to guess it.

import java.util.Scanner;

public class Challenge74 {
    int random; //declare random o that it can be used as global variabe;
       //1> GENERATING A CONSTRUCTOR GENERATING A RANDOM NUMBER BTWEEN 0 TO 100
       Challenge74(){ //writing default constructor not take any value from constructor but will make certain initialization to the constructor
       
        double random1= Math.random()*100;
        random=(int)Math.ceil(random1);

       }
       ////////documentation///////////////
         /**
          * 
          * @param guessNumber the number tplayer guessed
          * @return
           -ve if the guessed numbr is smaller
           0 if the guessed number is correct
          +ve if the guessed number is higher
          */
          /////////documnetation////////////

       //2> method --2 where user guess then returns a message as guess the number higher or lower
        int guess(int guessNumber){
            return guessNumber-random;
         }

    public static void main(String[] args) {

        //3>creating obj for the class  & input user to get guessnumber
        Scanner input=new Scanner(System.in);
        //reading user input
        System.out.println("Welcome to the world of guessing numbr games, guess the number between 1 to 100 \n ");
        //CREATE OBJ FOR THE CLASS
        Challenge74 myChallenge74 =new Challenge74();
        //4> here atleast ek guess krega tb hi bol payege ki guessnumber jyada chaiye ya kaam
        //so use do-while loop jisme condition first time true hoga then we need to check

           int guess;//declare here as we see  Cannot make a static reference to the non-static method guess(int) from the type 
          int result;
        do {
            System.out.print("PLEASE, GUESS THE NUMBER:  ");
             guess =input.nextInt();
             result=myChallenge74.guess(guess);
             //5>giving hint to the user 
             if(result==0){
                System.out.println("Congo Buddy,we guesed the right number ");
             }else if(result<0){
                System.out.println("Please,guess Higher");

             }else{
                System.out.println("Please,guess   Lower");
                
             }

        } while(result!=0);
       
       

    }
    
}
