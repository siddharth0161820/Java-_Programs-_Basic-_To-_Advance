public class Challenge43 {
    public static void main(String[] args) {
        //WAP TO CHECK IF THE ARRAY IS SORTED OR NOT
        //SORTED MEANS IF A NUMBER IS CONTINUOUSLY INCREASING OR CONTINUOUSLY DECREASING
        //E.G---2,4,6,7,9,9,88,77,......number sorting in increasing order
        //E.G...8,7,6,5,4,4,2,1....number sorting in decreasing order
        System.out.println("WELCOME TO ARRAY SORTING CHECKPOST\n:");
        int[] numArr=Arrayutility.inputArray(); //array input done
       boolean increasing=isIncreasing(numArr);
       boolean decreasing=isDecreasing(numArr);
       if(increasing || decreasing){
        System.out.println("Array is sorted:");
       }else{
        System.out.println("Array is not sorted:");
       }



    }
    //method/funcion
    public static boolean isIncreasing(int[]numArr){
        int i=1; //i==index
        while(i<numArr.length){
            if(numArr[i]<numArr[i-1]){
                return false;
            }
            i++;
            
        }
 
        return true;
    }

    //2>method/function--2
    public static boolean isDecreasing(int[]numArr){
        int i=1; //i==index
        while(i<numArr.length){
            if(numArr[i]>numArr[i-1]){
                return false;
            }
            i++;
            
        }
        


        return true;
    }
       
    }
    

