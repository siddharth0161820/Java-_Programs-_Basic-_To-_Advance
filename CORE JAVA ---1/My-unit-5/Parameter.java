public class Parameter {
    public static void main(String[] args) {
        //int num=sum(3,7);//(arguments)
        System.out.println(sum(3,7));
        System.out.println(sum(44,47));
        System.out.println(sum(33,7));
         
    }
    //CREATING A FUNCTION/METHOD RETURN SOME VALUES
    public static  int sum(int myFirstNum,int mySecondNum){//(parameter)----parameter is the input values a function takes
        /////////MULTIPLE PARAMETERS: FUNCTIONS CAN TAKE MORE THAN ONE PARAMETERS
        System.out.println("myFirstNum received:"+myFirstNum);
        System.out.println("mySecondNum received:"+mySecondNum);
        //int add=myFirstNum+mySecondNum;
        return myFirstNum+mySecondNum;



    }
    
}
