public class Challenge67 {
    public static void main(String[] args) {
        
        //Create a program using continue to print only even numbers using continue for odd numbers.

        //----CODE USING CONTINUE-----//
        System.out.println("WELCOME TO PRINTING AN EVEN NUMBERS USING CONTUNE STATEMENT ");

        //2> input int array element
      //  int[]myArr=Arrayutility.inputArray();


        
            // //3>APPLY FOR-EACH LOOP
            // int sum=0; //accumulator varaible at initial
            // for(int num:myArr){
            //     if(num%2!=0){
            //         continue;
            //     }
            //     sum+=num;
            // }
            // System.out.println("THE SUM OF THE POSITIVE  NUMBERS IS " + sum);

            //4> USING forLOOP
            for(int i=1;i<=100;i++){
                if(i%2!=0){
                    continue;
                }
                System.out.println(i);

            }

    }
    
}
