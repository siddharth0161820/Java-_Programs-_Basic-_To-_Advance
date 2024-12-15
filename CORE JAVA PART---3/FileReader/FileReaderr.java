package FileReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderr {
    public static void main(String[] args) {

        ///1> Declaring filename in text format
        String fileName = "java-course.txt";

        ////2>TO READ THIS FILE USE TRY WITH RESOURCE SYNTAX TO AVOID EXCEPTIONS
        try(FileReader myFileReader = new FileReader(fileName)) { //object for filereader created
            int read = 0;
            do {
                read = myFileReader.read();
                System.out.print((char) read);
            } while (read!=-1);

        }catch (IOException exception) { //IOEXCEPTION IS INPUTOUTPUT EXCEPTION IS
            System.out.printf("%s Exception occurredd...\n",exception.getCause());
            System.out.printf("%s Exception occurredd...\n",exception.getMessage());
        }
        }
    }


