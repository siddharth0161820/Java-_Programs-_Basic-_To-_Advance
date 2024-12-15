// Design a Course class.
//       Instance variables: courseName, enrolledStudents.
//       Static variable: maxCapacity, the maximum number of students for any course.
//       Instance methods: enrollStudent(String studentName), unenrollStudent(String studentName).
//       Static method: setMaxCapacity(int capacity), to set the maximum capacity for courses.
////////////////////////////////////////////////////
////////////////////organized manner for coding////////////
   //1> Static variable
   //2>NON-STATIC VARIABLE/INSTANCE VARIABLE
   //3>STATIC BOCK
   //4>NORMAL BLOCK/INITIALIZATION BLOCK
   //5>CONSTRUCTOR
   //6>METHODS/FUNCTIONS 
   ////////////////////////////////////////////////////////////////////////

public class Course {
   //2> static variables
   static int maxCapacity;
   //1>create instance bvariable
   String courseName;
   int enrolledStudents;
    //4>here not in question but to show methods for enrollstudent we have to show that studentenrolled  or not
    boolean isenrolled;
    boolean isunenrolled;

    //3> defining codeblocks==STATIC BLOCK
    static{
      maxCapacity=120;//initialize maximum capacity initially
  }
  //7> creating normal block/initialization block
    //to be created whenever course is made shwn below then  static block is to be increased
    {
      maxCapacity--; //object initilization
  }
   //5>defining constructor
   Course(String courseName,int enrolledStudents){
      this. courseName=courseName;//assigning values to the instance var not local var i.e. argumnets pssed so we add this keyword
      this.enrolledStudents=enrolledStudents;

   }
   //6> creating 2nd constructor with coursename compulsory,without isbn cannot create course constuctor
   Course(String courseName){
       this("courseName",22);//using constructor chaining

   }
   //8>static method for gettoatalnoofbooks()
   static int getmaxCapacity(){
      return maxCapacity;
  }

  //9> instance method
  public void enrollStudent(){
      //condition
      if(isenrolled){
          System.out.println("The student is enrolled");
      }
      else{
         this.isenrolled=true;
      }
      this.isenrolled=true;
      System.out.println("Enjoy " +this.courseName);

  }
  //method---------2
  public void unenrollStudent(){
      if(isunenrolled){
          this.isunenrolled=false;
          System.out.println("Hope you are satisfied with "+courseName);


      }else{
          System.out.println("already unenerolled");
      }
  }
  //creating objects for class Course

  public class Coursee{
   public static void main(String[] args) {
       //declaring objects for the class Course
           ////  declaring object for the class constructorstypes with color of the -----------2
           //creating multiple couse(obj) with a single class
       Course myCourse=new Course("ZINDAGI",33);
       Course myCourse1=new Course("11");
       System.out.println(Course.getmaxCapacity());
       Course myCourse2=new Course("",22);
       System.out.println(Course.getmaxCapacity());
       //calling/invoking the class
       myCourse.enrollStudent();
       myCourse1.enrollStudent();
       myCourse2.enrollStudent();
       myCourse.unenrollStudent();
       myCourse1.unenrollStudent();
       myCourse2.unenrollStudent();
       
      

   }
  } 

    
}
