

public class Challenge40 {
    public static void main(String[] args) {
        //WAP TO FIND THE SUM AND AVERAGE OF ALL ELEMENTS IN AN ARRAY
        //USER INPUT METHOD
      
        //READING USER INPUT
        System.out.println("WELCOME TO THE SUM AND AVERAGE OF ALL ELEMENTS IN AN ARRAY:");
        int[] myNums =Arrayutility.inputArray();//class name lge ke method/fnction ko call kr dye
        long sum=sum(myNums);
       // int average=average(myNums);
       double average=average(myNums);
        System.out.println("SUM OF THE NUMBERS IS: " + sum);
        System.out.println("AVERAGE OF THE NUMBERS IS: " + average);


        
        
    }
    //1>>>CREATING METHODS/FUNCTIONS FOR SUM
    public static long sum(int[] myNums){      ///sum of integers can be more numbers/digits so better to take output as long datatype
       long sum=0; //accumulator pattern
       int i=0; //i=index
       while(i<myNums.length){
        sum=sum+myNums[i];
        i++;

       }
        return sum;
    }
    
      //2>>>CREATING METHODS/FUNCTIONS FOR AVERAGE
     // public static int average(int[] myNums){   //average of integers will always be integer data type
        public static double average(int[] myNums){
       // long sum=sum(myNums);
       double sum=sum(myNums);
       // return (int)(sum/myNums.length); //explicit typecasting long to int
        return (sum/myNums.length);
    }
}



    

