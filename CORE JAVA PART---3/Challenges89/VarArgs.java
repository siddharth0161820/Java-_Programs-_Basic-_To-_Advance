// Write a method concatenate Strings that takes variable arguments
// of String type and concatenates them into a single string.


package Challenges89;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println(concatenate("Siddharth","in the next line","we gotta know your surname"));
        System.out.println(concatenate("Kumar"));
        System.out.println(concatenate("yup","Thanks"));
    }
    //Method/function()
    public static String concatenate(String... strs) {//... means can get many arguments
        //1>to concetinate multiple strings use/create  string builder object
        StringBuilder sb =new StringBuilder();
        for (String str : strs) { //to concetinate all the strings use for-each loop
            //2> to add strings means to appends
            sb.append(str).append(" ");
            
        }
        return sb.toString();


    }
}
