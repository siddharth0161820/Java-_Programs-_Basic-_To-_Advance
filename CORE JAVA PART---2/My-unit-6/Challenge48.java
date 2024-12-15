import java.util.Scanner;
 //WAP TO SEARCH AN ELEMENT IN A 2-D ARRAY

public class Challenge48 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("WELCOME TO 2-D SEARCH\n");
         //input the element from 2-d array
         int[][]myNums = Arrayutility. input2DArray(); 
        System.out.println("PLEASE,ENTER THE NUMBER:");
        int num=input.nextInt();
       
        //invoking/calling method
        boolean isFound=search(myNums, num);
        //conditions
        if(isFound){
            System.out.println("ELEMENT PRESENCE CAN BE VISUALIZED IN THE ARRAY:");
            System.out.println("THANK YOU FOR YOUR PRECIOUS TIME");
        }
        else{
            System.out.println("ELEMENT PRESENCE NOT AVAILABLE IN THE aARRAY");
            System.out.println("GLAD AND GRATITUDE TO YOU FOR YOUR MOMENT");
        }

       
    }
    //create the method/function that searches element is there in an array or not
    public static boolean search(int[][]myNums,int num){
        int i=0;//initialization
        while(i<myNums.length){
            int j=0;
            while(j<myNums[i].length){
                if(myNums[i][j]==num){
                    return true;
                }
                j++;

            }
            i++;
        }
        return false;
    }

    
}
