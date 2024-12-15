public class Challenge63 {
    public static void main(String[] args) {
        // Create a program using for-each to find the maximum value in an integer array
        System.out.println("WELCOME TO FINDING TH MAXIMUM\n ");
        //1>input array from arrayutility
        int []myArr=Arrayutility.inputArray();
        //1>DECLARING INT MAX
        int max=Integer.MIN_VALUE;

        //2> //FOR - EACH LOOP
        for(int num:myArr){
            if(max<num){
                max=num;
            }
        }
        System.out.println("Maximum value of an integer array is " + max);

       


    }
    
}
