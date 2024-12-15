public class Array{
    public static void main(String[] args) {
        //ARRAY CONCEPT UTILIZATION IN CODE
        //ARRAY DECLARATION METHOD 1
      //  int[] myArr = new int[5];
        
        //ASSIGNING VALUES TO myArr variable
        // myArr[4]=435;
        // myArr[0]=43;
        // myArr[1]=1;
        // myArr[2]=433;
        // myArr[3]=431;


        //ARRAY DECLARATION METHOD 2
        int[] myArr={43,1,433,431,435};
       // int index=3;//can generate index with variable
        
        //PRINTING THE ARRAY VARIABLE
        // System.out.println(myArr[0]);
        // System.out.println(myArr[1]);
        // System.out.println(myArr[2]);
        // System.out.println(myArr[index]);
        // System.out.println(myArr[4]);
        // //System.out.println(myArr[5]);

        //PRINTING ARRAY VARIABLE USING LOOP
        int index=0; //initialization 
        while(index<myArr.length){//condition  //array length can be access by its properties myArr.length
            System.out.println(myArr[index]);
            index++;
           



        }
        //array can be of any datatype 
        //lets create for strimng datatype
         //ARRAY DECLARATION METHOD 2
       //  String[] myStrArr=new String[5];
         //assign 
        // myStrArr[0]="myself "//just assigning 1 length leaving others
        //  System.out.println(myStrArr[0]);

           //ARRAY DECLARATION METHOD 2
        String[] myNewArr={"THIS","TIME","WIN","OR","DIE"};
        System.out.println(myNewArr.length);

    }
}