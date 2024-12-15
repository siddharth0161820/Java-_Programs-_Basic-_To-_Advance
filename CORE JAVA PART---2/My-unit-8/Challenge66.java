public class Challenge66 {
    public static void main(String[] args) {
        //. Create a program using continue to sum all positive numbers entered by the 
          //user; skip any negative numbers.
          
            //---------code using continue statement---///
            System.out.println("WELCOME TO ADDING THE POSITIVE NUMBERS\n");
            //1> input int array
            int[]myArr=Arrayutility.inputArray();

            //2>APPLY FOR-EACH LOOP
            int sum=0; //accumulator varaible at initial
            for(int num:myArr){
                if(num<0){
                    continue;
                }
                sum+=num;
            }
            System.out.println("THE SUM OF THE POSITIVE  NUMBERS IS " + sum);
    }
    
}
