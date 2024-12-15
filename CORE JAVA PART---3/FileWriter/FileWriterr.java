package FileWriter;


import java.io.FileWriter;
import java.io.IOException;

public class FileWriterr {
    public static void main(String[] args){
  //  public static void main(String[] args)  throws IOException { //my method() will throw IOEXCEPTION
        // if dont want to handle the exception but  main() is not called by anyone so
        // that we dont shift responsibilty  to others we will crash directly

        ///1> Declaring filename in text format
        String fileName = "java-course.txt";

        //2> Creating object for the class FileWriter
        ;
        try(FileWriter myFileWriter = new FileWriter(fileName)) {//use try with resource syntax to avoid any exception ;;by default java close the resource and handle the exceptions

            // CHECKED EXCEPTIONS  NEEDED TO BE HANDLED
            //NOW, calling the different methods of filewriter
            myFileWriter.write("I am Learning the best youtube java course till now\n");
            for (int i = 0; i < 1000; i++) {
                myFileWriter.write("*");
            }
            myFileWriter.flush();
            System.out.println("File written successfully..........");

        }catch(IOException exception) { //IOEXCEPTION IS INPUTOUTPUT EXCEPTION IS
            System.out.printf("%s Exception occurredd...\n",exception.getCause());
            System.out.printf("%s Exception occurredd...\n",exception.getMessage());

        }
        }


    }

