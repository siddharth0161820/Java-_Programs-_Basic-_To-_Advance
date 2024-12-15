public class Challenge71 {
    //Concatenate and Convert: Take two strings, concatenate them, and convert the result to uppercase.
     public static void main(String[] args) {
        String myFirstName = "Siddharth";
        String mySecondName = "Kumar";
        //String myFullName = myFirstName + " " + mySecondName;
        String myFullName = myFirstName.concat(" ").concat(mySecondName);
        System.out.println(myFullName);
        
        //converting name to uppercase
        System.out.println(myFullName.toUpperCase());
     }

    
}



















// StringBuilder myStringBuilder = new StringBuilder("JUST MAKE IT HAPPEN ");
// myStringBuilder.append("THE CONSTRUCTOR AND THE DESTROYER OF THE UNIVERSE: MAHADEV IS WITHIN YOU,OM NAMAH SHIVAAY ");
// myStringBuilder.append("infinity ");
// myStringBuilder.append(3333);
// System.out.println(myStringBuilder.toString());