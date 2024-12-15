//Variables and datatypes

//import java.text.RuleBasedCollator;

public class Datatypes {
    public static void main(String[] args) {

      /////1> INT DATATYPE

       // int myAge; //variable declaration
       // myAage=27; //variable initialisation

        // variable de claration and initialisation can be done at once
        int myAge=27;
        System.out.println(myAge);
        //change the myAge and then again print
        myAge =33;//replacing the value of age in the same memory address of variable age
        System.out.println(myAge);
       




        ////2> boolean datatype


        boolean isHealthy=true;
        System.out.println(isHealthy);
        boolean isHealthyy=false;
        System.out.println(isHealthyy);



        //////3> FLOAT datatype

        float myNumber=7.046f;
        System.out.println(myNumber);
        //NOTE ---- we can consider integer value 5 as this 5.0 also that gonnna work efficiently but 
        // it will occupy more space/memory & will affect readibiliy(will not understand why considering the value for)
        //so declare appropriate data type for better understanding and proper working.
        float myyNumber=5;
        System.out.println(myyNumber);


        /////4>double
        double myDigit =3.43;//will not face error bcz number after decimal is bydefault consider as double
        System.out.println(myDigit);
        

        //////5>String datatype
        String myInfinity="TEMIHIDI";
        System.out.println(myInfinity);


        ///////////////////////////////////////////////////////////

        //JAVA IDENTIFIERS RuleS
        //A>
        int m1$q = 32;
        int M0$qq  =21;
        System.out.println(m1$q);
        System.out.println(M0$qq);


        //c>3> identifiers should not start with digits.
        // int 2mqe = 23;
        // System.out.println(2mqe);
 



        //D>4> Java identifiers are case sensitive
        int myVariable=5;
        int myvariable=7;
        System.out.println(myVariable);
        System.out.println(myvariable);



}
}
