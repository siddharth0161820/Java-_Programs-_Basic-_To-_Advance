public class ForEachLoop {
    public static void main(String[] args) {
        //-----------------UNDERSTANDING FOREACHLOOP-----------/////
        //1>MAKING/DECLARING  AN  string ARRAY AND INITIALIZING
        String[] myArr=new String[]{
            "RAHUL","SHREY","KUNAL","VEER"
          
        };
          //3>calling/invoking the method/function
      // printmyArr(myArr);
        printmyArrForEachLoop(myArr);



    }
    //2.1 METHOD/FUNCTION
    public static void printmyArrForEachLoop( String[] myArr){
         // String[] myArr as an argument to pass
        //APPLY FOR EACH LOOP
        for(String name: myArr){
            System.out.println(name);
        }
        }

    }  
        
       
    //2> METHOD/FUNCTION
    // public static void printmyArr( String[] myArr){   // String[] myArr as an argument to pass
    //     //APPLY FOR LOOP
    //     int i;
    //     for(i=0;i<myArr.length;i++){
    //         System.out.println(myArr[i]);

    //     }
        
  
