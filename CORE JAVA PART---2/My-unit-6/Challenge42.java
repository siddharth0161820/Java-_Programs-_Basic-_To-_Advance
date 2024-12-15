
public class Challenge42 {
    public static void main(String[] args) {
        //WAP TO FIND MAXIMUM AND MINIMUM ELEMENT IN AN ARRAY
        //input a number to find element in array
       
        System.out.println("WELCOME TO MAXIMUM AND MINIMUM ELEMENT IN AN ARRAY\n");
        //INPUT NUMBER
        int[] myNums=Arrayutility.inputArray();
        int max=printMaxElement(myNums);
        int min=printMinElement(myNums);
        System.out.println("THE MAXIMUM NUMBER IN THE ARRAY  IS: " + max);
        System.out.println("THE MINIMUM NUMBER IN THE ARRAY IS: " + min);
     
        
    }
    //create the method/fnction
    public static int printMaxElement(int[]myNums){
        if(myNums.length==0){
            return Integer.MIN_VALUE;///MIN VALUE IS THE MINIMUM VALUE INTEGER HOLDS RETURN THAT constant

        }
        int max=myNums[0]; //array at 0th index ko maximum considr kro
        int i =1; //first ko maximum mann lya ab array 1st index se chalega aur usko max consider wala se compare kro
        while(i<myNums.length){
            //check my max=mynums[0] < mynums[i]
            if(max<myNums[i]){
                max=myNums[i];//agar max chota h kisi element se toh uss respective element ko max mann lo

            }
            i++;
        }


        

        return max;
    }

     //create the method/fnction
     public static int printMinElement(int[]myNums){
        int min=Integer.MAX_VALUE;//min k lye jo maximum value hai usko min mann lo
        int i=0; //bcz hum log 0th index ko consider nhi kye hai free h wo
        while(i<myNums.length){
            if(min>myNums[i]){
                min=myNums[i];
            }
            i++;

        }
        
        return min;
    }
    
}
