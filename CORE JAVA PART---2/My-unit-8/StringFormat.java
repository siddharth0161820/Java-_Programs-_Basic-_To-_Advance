public class StringFormat {
    public static void main(String[] args) {
//         String str1 = "abc";
//         String str2= "abc";
//         String str3 = new String("abc");
//         //in strings(for all objcts) == comapres the references(address ) of the two objects 
//         // for comparing the value of the object we need to use equals ()
//        boolean str4= str1==str2;
//        boolean str5= str1==str3;
//        Boolean str6= str1.equals(str3);
       
//   System.out.println(str4);
//   System.out.println(str5);
//   System.out.println (str6);
int marks =51;
String  name="Srujot";
System.out.println("Hello " + name + " your marks are : " + marks);
System.out.printf("Hello %-11S your marks are : %s ",name,marks); //advantage of this is that no need to concenate all the strings,
                                                                       //works efficiently
                                                                        //less strings required

   System.out.println(" ");                                                                   
  System.out.printf("Hello %11S your marks are : %s ",name,marks);


//System.out.printf(); //f--function
    }
         
}
