package WrapperClasses;

public class TestingWrapper {
    public static void main(String... args) {
        //1>Understanding Wrapper classes
      //  Integer first = new Integer(440);//'Integer(int)' is deprecated
        // since version 9 and marked for removal
                     ////////OR//////
        //Integer first = Integer.valueOf("33");
                       //////////OR/////////////
        Integer first = 333; //object=primitive datatype int//Automatic conversion between the
                     // primitive types and their corresponding wrapper classes
                     //accurate name for it is autoboxing
        System.out.println(first);

        /////////UNBOXING///////
        //back to primitive datatype from wrapper class
        int second = first;    //primtive=object


        //2>Now primitive datatypes became
        // wrapper classes so we are able to call/invoke many methods over it
        first.describeConstable();

        //3> BENEFIT OF WRAPPER CLASSES
             ///CAN STORE NULL VALUES TO WRAPPER CLASSES
       Integer first1 = null;
    }
}
