package Equals;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {

        //1>CREATE OBJECT FOR THE PERSON
        Persons myPersons = new Persons("Sidd",26,"1000007710");
        //create one more objects for persons
       // Persons myPersons2 = new Persons("Sidd",26,"160109039");
        Persons myPersons2 = new Persons("Sidd",26,"1000007710");
        //2>Now,check the equality of the two person as same name,age and personid means overall id should tally


       if(myPersons.equals(myPersons2)) { //== comapare with equal to means comparing the address of the
           //two objects that is the storage place

           /////////////////////////////////////////////////////////////////
           //NOW THERES A CATCH HERE THAT IS TO BE UNDERSTOOD
           //equals() by default compares the references
           //here we can say then how strings is compared using equals() ,then understand that
           // string by itself defines its equals().
           //so to compare the two persons we neeed to define the equals() for the same
           ////////////////////////////
           ///////////////////////////////
           System.out.println("equals");
       }else{
           System.out.println("Not equal");

       }

    }
}
