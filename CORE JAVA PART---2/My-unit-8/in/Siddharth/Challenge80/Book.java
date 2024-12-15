package in.Siddharth.Challenge80;

public class Book extends LibraryItem{
    //ATTRIBUTES FOR BOOK/INSTANCE VARIABLES
    private String ISBN;

    //create methods/functions
    public void read(){
        int collections = 33;
        System.out.printf("READING BOOKS INCREASES intelligence and library have about  %d number of Books\n", collections);
    }
    public void ShreeBhagwatGeeta(){
        System.out.printf("%s is the key to live a meaningful and spiritual life\n",lifeLessons);
    }
     public void uniqueIdentificationNumber(){
         String ISBN = "qewd";
         System.out.printf("%s is the code to idntify boks in the library\n",ISBN);
     }
}
