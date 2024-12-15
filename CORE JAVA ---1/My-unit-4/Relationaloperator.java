import java.util.Scanner;

public class Relationaloperator {
    public static void main(String[] args) {
      
        //using user input method
        Scanner input=new Scanner(System.in);
        //READING USER INPUT
        System.out.println("WELCOME TO DRIVING LICENSE PORTAL ");
        System.out.println("PLEASE ENTER YOUR AGE DEAR");
        int age = input.nextInt();

        //RELATIONAL OPERATORS USES USING IF ELSE() CONDITION
        //1> Greater than or equal to >=
        if(age>=18){
            System.out.println("you are eligible to drive");
            
            }
            else{
                System.out.println("sorry buddy,please drive the bicycle or prefer walking");
            }

            int myNum=33;
            int yourNum = 33;

            //2>equality ==
            if(myNum==yourNum){
                System.out.println("EQUALITY REVEALED AND ADAPTED");
                
                }
                else{
                    System.out.println("equality not valid");
                }

                //3>inequality!=
                boolean life= true;
                boolean health= false;
                boolean healthh = true;
                boolean lifee= false;

                if(life!=health){
                    System.out.println("BE GRATEFUL FOR EVERYTHING U DO HAVE:");
                }
                else{
                    System.out.println("start getting kind");
                }
                if(healthh!=lifee){
                    System.out.println("HEALTH IS NOT JUST PHYSICAL HEALTH");
                }
            else{
                System.out.println("health means overall happiness ,peace and progressive lifestyle");
            }
            }
        }
        
        
    
    

