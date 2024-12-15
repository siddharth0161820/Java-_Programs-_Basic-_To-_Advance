public class Car {
    //1>DEFINING INSTANCE VARIABLE
     int noOfSeats;
     int noOfWheels;
     int noOfDoors;
     int maxSpeed;
     String carName;
     String modelNumber;
     String company;

     //2>design a constructor

       Car(int noOfDoors, int noOfSeats,int noOfWheels,int maxSpeed,String carName, String modelNumber, String company){
        this.noOfDoors=noOfDoors;
        this.noOfSeats=noOfSeats;
        this.noOfWheels=noOfWheels;
        this.maxSpeed=maxSpeed;
        this.carName=carName;
        this.modelNumber=modelNumber;
        this.company=company;

      }
      //4> defining toString() method
      //if some call/invoke toString() to our object it shows good representation of our class and method toString() gets call,
      //if not call toString() it gives classname@hashcode as output

    //   ////////////////////////////////////////
    //   @Override
    //   public String toString() {
          
    //       return "MY CAR NAME IS " + carName;
    //   }
    //   /////////////////////////////

    //4.0 geranrte tostring() by shortcut
    
      //3>CREATE OBJECT OF CLASS CAR 
    @Override
    public String toString() {
        return "Car [noOfSeats=" + noOfSeats +
        ", noOfWheels=" + noOfWheels +
        ", noOfDoors=" + noOfDoors + 
        ", maxSpeed="   + maxSpeed +
        ", carName=" + carName + 
        ", modelNumber=" + modelNumber + 
        ", company=" + company + "]";
    }

       


  
      public static void main(String[] args) {
        Car myCar =new Car(4,4,4,
                           232,"SHIKHAR","QWER","BHARAT");

                // System.out.println(myCar.toString());    //calling myCar.toString as toString() not declared in the code even then it comes in all the class
                         //jb aap println m class k object likh rhe toh   System.out.println(myCar.toString())  k wajah 
                         //  System.out.println(myCar) likjh as tostring() is implicit by defalut obj ko print krne m tostring() call hoge
                  System.out.println(myCar);

      }

     

      }


    

