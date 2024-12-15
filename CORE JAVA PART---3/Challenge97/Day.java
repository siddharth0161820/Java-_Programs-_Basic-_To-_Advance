//Enhance the Day enum by adding an attribute that
//indicates whether it is a weekday or weekend. Add a
//method in the enum that returns whether it's a weekday or
//weekend, and write a program to print out each day along
//with its type..

package Challenge97;

public enum Day {
   SUNDAY(false),
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false);



 //2>Adding attributes to it
  private final boolean isWeekDay;

  //3>create constructor
  Day(boolean isWeekDay) {
   this.isWeekDay = isWeekDay;
  }

  //4>define method()
 //Add method in the enum that returns whether it's a weekday or weekend,
 public String getType(){
   //use ternary operator
  return isWeekDay ? "Weekday" : "Weekend";
 }



}
