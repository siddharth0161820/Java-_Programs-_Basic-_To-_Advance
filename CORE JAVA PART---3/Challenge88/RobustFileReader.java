package Challenge88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFileReader {
    public static void main(String[] args) {
        //1> TAKING USER INPUT TO READ THE FILENAME
        Scanner input = new Scanner(System.in);
        //2>READING USER INPUT
        System.out.print("Please enter the name of the file you wish to read.....!!!");
        String fileName = input.next(); //file name found

        //3>to print the content of the file over the console windows use filereader
           //use try with resource syntax to avoid exceptions..
        try(FileReader myFileReader = new FileReader(fileName)){
            int read;
            while ((read=myFileReader.read())!=-1) {
                System.out.print((char)read);
            }
        }catch (FileNotFoundException exception) {
            System.out.printf("%s not found ",fileName);
        }catch(IOException exception) {
            System.out.printf("%s Exception occurredd...\n",exception.getCause());
            System.out.printf("%s Exception occurredd...\n",exception.getMessage());
        }
        }

    }

