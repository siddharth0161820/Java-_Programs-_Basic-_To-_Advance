// Create a Book class for a library system.
// Instance variables: title, author, isbn.
// Static variable: totalBooks, a counter for the total number of book instances.
// Instance methods: borrowBook(), returnBook().
// Static method: getTotalBooks(), to get the total number of books in the library.

///////////////////////////////////////////
////////////////////organized manner for coding////////////
   //1> Static variable
   //2>NON-STATIC VARIABLE/INSTANCE VARIABLE
   //3>STATIC BOCK
   //4>NORMAL BLOCK/INITIALIZATION BLOCK
   //5>CONSTRUCTOR
   //6>METHODS/FUNCTIONS 
   ////////////////////////////////////////////////////////////////////////

public class Book {
//2> defining static variables
static int totalNoOfBooks;

    //1> CREATING INSTANCE VARIABLES
    String author;
    String title;
    String isbn; //isbn-international standard book number
    //4>here not in question but to show methods for bookborrowed we have to show that book isborrowed or not
    boolean isborrowed;
    boolean isreturned;

    //3> defining codeblocks==STATIC BLOCK
    static{
        totalNoOfBooks=0;//initialize total no of books initially
    }
    //7> creating normal block/initialization block
    //to be created whenever book is made shwn below then  static block is to be increased
    {
        totalNoOfBooks++; //object initilization
    }
    //5>defining constructor
    Book(String author,String title,String isbn){
       this. isbn=isbn;//assigning values to the instance var not local var i.e. argumnets pssed so we add this keyword
       this.title=title;
       this.author=author;

    }
    //6> creating 2nd constructor with isbn compulsory,without isbn cannot create book constuctor
    Book(String isbn){
        this("isbn","unkonown","unknown");//using constructor chaining

    }
    //8>static method for gettoatalnoofbooks()
    static int gettoatalnoofbooks(){
        return totalNoOfBooks;
    }

    //9> instance method
    public void borrowBook(){
        //condition
        if(isborrowed){
            System.out.println("Book is already borrowed");
        }
        else{
           this.isborrowed=true;
        }
        this.isborrowed=true;
        System.out.println("Enjoy " +this.title);

    }
    public void returnBook(){
        if(isborrowed){
            this.isborrowed=false;
            System.out.println("Hope you enjoyed the book");


        }else{
            System.out.println("This book  already in the library");
        }
    }
    //creating objects for class Book

   public class Bookk{
    public static void main(String[] args) {
        //declaring objects for the class Book
            ////  declaring object for the class constructorstypes with color of the -----------2
        Book myBookk=new Book("1","Design","Robert Frost");
        Book myBookk1=new Book("11","Designlife","Robert Frostttttt");
        System.out.println(Book.gettoatalnoofbooks());
        //calling/invoking the class
        myBookk.borrowBook();
        myBookk.returnBook();
        myBookk.returnBook();
        myBookk1.borrowBook();
        myBookk1.returnBook();

    }
   } 
}
 