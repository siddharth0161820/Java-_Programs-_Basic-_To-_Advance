public class Challenge50 {
    public static void main(String[] args) {
        //WAP TO FIND THE SUM OF TWO DIAGONAL ELEMENTS
        System.out.println("WELCOME TO DIAGONAL SUM:");
        //TAKING INPUT 2 -D ARRAY
        int[][] myArr= Arrayutility.input2DArray(); 
        //invoking/calling the methods/functions
        long sum=sumOfDiagonals(myArr);
        System.out.println("Sum of Diagonal is: " + sum);


    }
    //method/function
    //total diagonal sum
    public static long sumOfDiagonals(int[][] myArr){
        long leftSum=sumOfLeftDiagonals(myArr);
        long rightSum=sumOfRightDiagonals(myArr);
        long sum=leftSum+rightSum;
        //NOW CHECK ARRAY IS EVEN OR ODD
        if(myArr.length % 2!=0){//odd array mtb no of rows no of columns odd honge toh
         int ind=myArr.length/2; //index=ind
         sum-=myArr[ind][ind];
        }
        return sum;
    }
    //CREATING 2 MORE METODS/FUNCTIONS
    //1> SUM OF LEFT DIAGONAL
    public static long sumOfLeftDiagonals(int[][] myArr){
        long sum=0;
        int i=0;
        while(i<myArr.length){
            //we know no of rows columns same(0,0)(1,1)(2,2)
            sum+=myArr[i][i];
            i++;
        }


        return sum;
    }

    //2>SUM OF RIGHT DIAGONAL
    public static long sumOfRightDiagonals(int[][] myArr){
        long sum=0;
        int i=0;
        while(i<myArr.length){
            int col=(myArr.length-1)-i;
            //if(myArr[i]!=myArr[(myArr.length-1)-i]){
            sum+=myArr[i][col];
            i++;

        }
        return sum;
    }
    
}
