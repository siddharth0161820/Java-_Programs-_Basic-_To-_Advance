import java.util.Scanner;

public class Challenge37 {
    public static void main(String[] args) {
        //WAP TO CHECK NUMBER IS ARMSTRONG OR NOT
        Scanner input=new Scanner(System.in);
        System.out.println("CHECK FOR ARMSTRONG NUMBER");
        System.out.println("PLEASE,ENTER THE NUMBER");
        int number=input.nextInt();
        //1> LOGIC TO FIND THE LENGTH OF THE DIGIT
        int variable1=number; //so that original number dont get changed
        int length=0;
        //APPLYING WHILE LOOP
        while(variable1!=0){
            variable1=variable1/10;
            length=length+1;  
        }
      //  2>REVERSE A NUMBER CONCEPT---153--351
      int variable2=number; //numbr
      int remainder;
      int armstrong=0;
      while(variable2!=0){
        remainder=variable2%10;
        int multiply=1;
        //APPLY FOR LOOP
        for(int i=1;i<=length;i++){
            multiply=multiply*remainder;
        }
        armstrong=armstrong+multiply;
        variable2=variable2/10;
        
      }
      if(number==armstrong){

        System.out.println("Number is armstrong");
      }
      else{
        System.out.println("Number is not armstrong");
      }



    }
    

    }

    

