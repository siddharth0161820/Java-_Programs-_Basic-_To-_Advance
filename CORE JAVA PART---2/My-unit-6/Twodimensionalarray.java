public class Twodimensionalarray {
    public static void main(String[] args) {
        //DESIGNING 2-d ARRAY
        //ARRAY DECLARATION METHOD--1
        int[][] myArr=new int[2][3];
        //INSEERTING ELEMENTS
        myArr[0][0]=1;
        //INITIALIZING ARRAY WITH DATA==method2
      //  int[][] arr = {};//no of elements defined inside is zero so size will be zero
      int[][] arr = {{1,2,3},{8,9,0}}; //here size of outer array is 2
      System.out.println(arr.length);
      
      //int[][] arr = {{1,2,3},{8,9,0},{7,8,4}}; traverse 2d array of this elements we need 2 loops 1st loop will see rows ;2nd will see columns
       

      
      // System.out.println(arr.length);//2
    //   System.out.println(arr[1].length);
    //APPLY LOOP FOR TRAVERING
    //1> LOOP
    int rows=0;
    while(rows<arr.length){
        //apply loop under loop--2nd loop
        int columns=0;
        while (columns<arr[rows].length) {
            System.out.print(arr[rows][columns] + " ");//" "   this is to give space between two matrix 
            columns++;
            
        }
        System.out.println();

        rows++;

    }
    }
    
}
