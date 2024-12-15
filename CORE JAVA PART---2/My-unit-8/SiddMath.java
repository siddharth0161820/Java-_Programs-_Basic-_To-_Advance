public class SiddMath {
    public static void main(String[] args) {
        //-----UNDERSTAND RANDOM NUMBERS & MATH CLASS----//

        ///---IMPLEMENTING DIFFERENT MATH FUNCTIONS
        System.out.println(Math.abs(-99));
        System.out.println(Math.ceil(3.42));
        System.out.println(Math.floor(22.92));
         System.out.println(Math.round(3.42));
         System.out.println(Math.round(3.52));
          System.out.println(Math.max(22,33 ));
         System.out.println(Math.min(22,33));
         System.out.println(Math.pow(9, 02));
         System.out.println(Math.sqrt(81));
         System.out.println(Math.random());
         System.out.println(Math.PI);
         System.out.println(Math.E);

         //generating random number using for loop
         for (int i = 0; i < 10; i++) {
          //  long random=Math.round(Math.random()*100);//if want to get number in int used long as number as output will be increasing at eveery call
            int random=(int)Math.round(Math.random()*100); //do explicit casting
            System.out.println(random);
            
         }
         
          System.out.println(Math.exp(3));
          System.out.println(Math.log(3));
          System.out.println(Math.sin(30));

        }

    
        }

