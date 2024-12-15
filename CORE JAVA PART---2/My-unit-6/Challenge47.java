public class Challenge47 {
    public static void main(String[] args) {
        System.out.println("WELCOME TO MERGING TWO SORTED ARRAYS\n");
        //WAP TO MERGE TWO SORTED ARRAY
        //INPUT TWO ARRAYS
        int[]myArr1=Arrayutility.inputArray();
        int[]myArr2=Arrayutility.inputArray();
        //CALLING/INVOKING THE METHODS/FUNCTIONS
        int []mrgArr=merge( myArr1, myArr2);
        System.out.println("YOUR MERGED ARRAY IS: ");
        //PRINTING FINAL ARRAY
        Arrayutility.displayArray(mrgArr);






    }
    //CREATE A METHOD/FUNCTION
    public static int[] merge(int[]myArr1, int[]myArr2){
        //create new array of size myaar1+myarr2;
        int newsize=myArr1.length+myArr2.length;
        //now,create new array
        int[] newsmyArr=new int[newsize];
        //use two pointer approach and declare three index i variable 
        //i,j,k ---i points first array myarr1;;j---points second array myarr2 ;;k==gives elements into new array after comparing two arry as sorted arrays
          int i=0, j=0, k=0;
          //apply loop jbtk dono array m se koi baki ho
          ////sirf itna print krne se arrayindex out of bound dega bcz array size differ krege toh comapre k baad remaining array cpy nhi hoge
    //       while(i<myArr1.length||j<myArr2.length){
    //         if(myArr1[i]<myArr2[j]){
    //             newsmyArr[k]=myArr1[i];
    //             i++;
    //             k++;
    //         }
    //         else{
    //             newsmyArr[k]=myArr2[k];
    //             k++;
    //             j++;
                
    //  ////sirf itna print krne se arrayindex out of bound dega bcz array size differ krege toh comapre k baad remaining array cpy nhi hoge
    //         }

    //       }



    //     return newsmyArr;
    ////////////////////////////////////////
    /////applying condition to work smooth and produce result of two arrays
    while(i<myArr1.length||j<myArr2.length){
                if(j==myArr1.length||
                  (i< myArr1.length && myArr1[i]<myArr2[j])){
                     newsmyArr[k]=myArr1[i];
                    i++;
                    k++;
                }
                else{
                    newsmyArr[k]=myArr2[j];
                    k++;
                    j++;
                    
                       }
    
              }
    
    
    
             return newsmyArr;
    }

    
}
