public class Escapesequence {
    public static void main(String[] args) {


        ////1>\t  ---insert a tab in the text at this point
                   //  \t ---it gives a tabspace between two words
                   System.out.println("Jai Mahakal Infinity!");
        System.out.println("Jai Mahakal \t Infinity!"); 

        /////2>\b  -----\b is a backspace character 
            ///  it moves the cursor one character back with or without deleting the character(depending upon compiler)
            System.out.println("Jai Mahakal Infinity!");
            System.out.println("Jai Mahakal \b Infinity!");

        /////3>\n ---this \n escape sequence is for a new line
        System.out.println("Jai Mahakal Infinity!");
        System.out.println("Jai Mahakal \n Infinity!");


        //////4> \r --- this \r escape sequence is a carriage return character.
                  //it moves the output point back to the beginning of the line without moving.
                  System.out.println("Jai Mahakal Infinity!");
                  System.out.println("Jai Mahakal \r Infinity!");



                  
        //////5> \f --- this \f escape sequence is a form feed character.
                  //it's an old technique and used to indicate page break.
                  System.out.println("Jai Mahakal Infinity!");
                  System.out.println("Jai Mahakal \f  Infinity!");


         //////6> \' --- this \' escape sequence is a for printing a single quotation mark on the text string
                  System.out.println("Jai Mahakal Infinity!");
                  System.out.println("Jai Mahakal \'OM NAMAH SHIVAAY!\' Infinity!");



        //////7> \'' --- this \'' escape sequence is a for printing a DOUBle quotation mark on the text string
                  System.out.println("Jai Mahakal Infinity!");
                  System.out.println("Jai Mahakal \"OM NAMAH SHIVAAY!\" Infinity!");


        //////8> \\ --- this \\ escape sequence is a for printing a backslash(\) D on the text string
                   System.out.println("Jai Mahakal Infinity!");
                   System.out.println("Jai Mahakal \\-Infinity!");
 
 







        
    }
    
}
