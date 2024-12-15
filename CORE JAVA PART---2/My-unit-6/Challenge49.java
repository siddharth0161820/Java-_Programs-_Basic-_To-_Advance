public class Challenge49 {
    public static void main(String[] args) {
        //wap to do sum and average of all leements in a 2-D ARRAY
       
          //READING USER INPUT
          System.out.println("WELCOME TO THE SUM AND AVERAGE OF ALL ELEMENTS IN A 2-D ARRAY:");
          int[][] myNums =Arrayutility.input2DArray();//class name lge ke method/fnction ko call kr dye
          long sum=sum(myNums);
         // int average=average(myNums);
         double average=average(myNums);
          System.out.println("SUM OF THE NUMBERS IS: " + sum);
          System.out.println("AVERAGE OF THE NUMBERS IS: " + average);
  


    }
     //1>>>CREATING METHODS/FUNCTIONS FOR SUM
     public static long sum(int[][] myNums){      ///sum of integers can be more numbers/digits so better to take output as long datatype
        long sum=0; //accumulator pattern
        int i=0; //i=index
        while(i<myNums.length){
            int j=0;
            while (j<myNums[i].length) {
                sum+=myNums[i][j];
                j++;
                
            }
         
         i++;
 
        }
         return sum;
     }
     
       //2>>>CREATING METHODS/FUNCTIONS FOR AVERAGE
      // public static int average(int[] myNums){   //average of integers will always be integer data type
         public static double average(int[][] myNums){
            if(myNums.length==0){
                return 0;
            }
            int rows=myNums.length;
            int cols=myNums[0].length;
            double size=rows*cols;
        // return (int)(sum/myNums.length); //explicit typecasting long to int
         return sum(myNums)/size;
     }
    
}
