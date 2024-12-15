//Enhance the Day enum by adding an attribute that
//indicates whether it is a weekday or weekend. Add a
//method in the enum that returns whether it's a weekday or
//weekend, and write a program to print out each day along
//with its type....
package Challenge97;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("Printing all the days of the week ");

        //5>write a program to print out each day along
        ////with its type..
        for (Day day : Day.values()) {
            System.out.printf("%s :%s\n",day,day.getType());
            
        }

    }
}
