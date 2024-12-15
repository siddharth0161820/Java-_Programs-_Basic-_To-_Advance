public class Function {
    /////main() method is called/invoked by jvm but remaining we need to call seen above program
    public static void main(String[] args) {
        // System.out.println("In main method:");
        // myTime();
        // System.out.println("invoking mytime()method done");
        // urTime();
       // rightHalfPyramid();
       reverseRightPyramid();
       //LeftHalfPyramid();
       

    }
    //CREATING A FUNCTION/METHOD
    //ADVANTAGES OF METHODS/FUNCTION
    //1> CODE SIZE SHORT
    //2>CAN BE MAINTIANED EASILY AND CAN BE USED TIME AND AGAIN
    // public static void myTime(){
    //     System.out.println("I AM BACK WITH BEST AND MONSTER VERSION DEPENDS OF SITUATION:");
        
    // }
    // public static void urTime(){
    //     System.out.println("UNDERSTAND LIKE U KNOW zero");
    // }


    //Right Half Pyramid
    // public static void rightHalfPyramid(){
//  System.out.println("Right Half Pyramid");
// System.out.println("*");
// System.out.println("**");
// System.out.println("***");
// System.out.println("****");
// System.out.println("*****");

//using while loop and print right half pyramid
// int rows=0;
// while(rows<5){
//     System.out.print("*");
//     //APPLY LOOP UNDER LOOP
//     int pattern=0;//initialize
//     while(pattern<rows){//condition
//         System.out.print(" *");
//         pattern++;


//     }
//     System.out.println();
//     rows++;
// }
// }



    



//Reverse Right Pyramid
 public static void reverseRightPyramid(){
// System.out.println("Reverse Right Pyramid");
// System.out.println("*****");
// System.out.println("****");
// System.out.println("***");
// System.out.println("**");
// System.out.println("*");
//    int rows=5;
//    while(rows>0){
//     System.out.print("x");
//     //APPLY LOOP UNDER LOOP
//     int pattern =0;
//     while(pattern<rows){
//         System.out.print(" *");
//         pattern--;
//     }
//     System.out.println();
//     rows--;
int rows=5;
while(rows>0){
    System.out.print("*");
    //APPLY LOOP UNDER LOOP
    int pattern=1;
    while(rows>pattern){
        System.out.print(" *");
        pattern++;

    }
     System.out.println();
     rows--;
 }

    }

 // }




//Left Half Pyramid
//public static void LeftHalfPyramid(){
//  System.out.println("Left Half Pyramid");
// System.out.println("    *");
// System.out.println("   **");
// System.out.println("  ***");
// System.out.println(" ****");
// System.out.println("*****");
    
// int rows=5;
// while(rows>0){
//     System.out.print("* ");  
//     int e=5;
//     while(rows<e){
//         System.out.print("* ");
//         e--;
//     }
//     System.out.println();
//     rows--;
// }
}
   