import java.util.Scanner;

public class Challenge39 {
    public static void main(String[] args) {
         // System.out.println("In main method:");
        // myTime();
        // System.out.println("invoking mytime()method done");
        // urTime();
        Scanner input=new Scanner(System.in);
        System.out.println("WE ARE HERE TO PRINT PATTERN\n");
        System.out.println("PLEASE ENTER THE NUMBER OF ROWS:");
        int rows=input.nextInt();
        rightHalfPyramid(rows);
        reverseRightHalfPyramid(rows);
       LeftHalfPyramid(rows);

        

    }
    //CREATING A FUNCTION/METHOD
    //ADVANTAGES OF METHODS/FUNCTION
    //1> CODE SIZE SHORT
    //2>CAN BE MAINTIANED EASILY AND CAN BE USED TIME AND AGAIN
    // public static void myTime(){
    //     System.out.println("I AM BACK WITH BEST AND MONSTER VERSION DEPENDS OF SITUATION:");
        
    // }
    // public static void urTime(){
    //     System.out.println("UNDERSTAND LIKE U KNOW zero");
    // }


    //1>Right Half Pyramid
    public static void rightHalfPyramid(int maxRows){
        System.out.println("\nRIGHT HALF PYRAMID\n");
        int rows=0;
        //Applying loops
        while(rows<maxRows){
            System.out.print("*");
            int pattern=0;
            while(pattern<rows){
                System.out.print(" *");
                pattern++;
                
            }
            System.out.println();
            rows++;

        }

    }
    //2>Reverse Right Half  Pyramid
    public static void  reverseRightHalfPyramid(int maxRows){
        System.out.println("\nREVERSE RIGHT HALF PYRAMID\n");
        int rows=maxRows;
        //Applying loops
        while(rows>0){
            int pattern=0;
            while(pattern<rows){
                System.out.print(" *");
                pattern++;
                
            }
            System.out.println();
            rows--;

        }

    }

    //3>Left Half Pyramid
    public static void LeftHalfPyramid(int maxRows){
        System.out.println("\nLEFT HALF PYRAMID\n");
        int rows=maxRows;
        //Applying loops
        while(rows>0){
            //this loop prints space
            int j=0;
            while(j<rows-1){
                System.out.print("  ");
                j++;
            }
            //THIS LOOP PRINTS STARS
            int patternn=0;
            while(patternn<=(maxRows-rows)){
                System.out.print("* ");
                patternn++;
                
            }
            System.out.println();
            rows--;

        }

    }


}
