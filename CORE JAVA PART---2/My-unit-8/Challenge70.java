public class Challenge70 {
 
        //  Define a Student class with fields like name and age, and use toString to print student details..

        //1> INSTANCE VARIABLE
        String  name;
        int age;
        int rollNumber;
        String myHouse;



        //2> DESIGN A CONSTRUCTOR
             
        Challenge70(String name, int age, int rollNumber, String myHouse){
            this.name=name;
            this.age=age;
            this.rollNumber=rollNumber;
            this.myHouse=myHouse;
           
          }
          //3> define toString () 
          @Override
          public String toString() {
          // TODO Auto-generated method stub
          return "Student Details: {name:"+ name 
                                  + ", age:" + age 
                                  + ", rollNumber:" + rollNumber
                                  + ", myHouse:" + myHouse  + "}";

                                 
          }

        ///////////////////NOTE : IF WE DONT DEFINE TOSTRING() WE WILL GET CLASS NAME@HASHCODE --Challenge70@68fb2c38
          public static void main(String[] args) {
            //CREATING OBJECTS FOR CHALLENGE70
            Challenge70 myChallenge70=new Challenge70("SIDDHARTH", 27,
                                                       6, "MAHADEV");
      System.out.println(myChallenge70); ///whenever u call any obj tostring() gets call to it by itself
      System.out.println(myChallenge70.toString());
          }


    }
   
   

   

