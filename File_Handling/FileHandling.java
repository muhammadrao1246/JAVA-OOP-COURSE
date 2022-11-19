package JAVA_CONCEPTS.File_Handling;

//File Class is used to Create File by Specified name and type
import java.io.File;

//FileWriter class is used to Write on the Specified file that is pointed or created with "File" class object
import java.io.FileWriter;

//Scanner class is also used to read data from the specified file that is pointed or created with "File" class object
import java.util.Scanner;

//IOException class is included to capture errors that could be 
//caused by missing file or some other problem
import java.io.IOException;


//File_Creator class is used to create text file within safe try-catch block
class File_Creator
{
    //opening or creating the specified file and pointing to it
    File file = new File("JAVA_CONCEPTS/File_Handling/text.txt"); //you can specify path on your own preferences
        
    File_Creator() //File_Creator class constructor
    {
        //will detect the error and will handle in catch block
        try 
        {
            file.createNewFile();
            System.out.println("\n\n=====File Created !=====");
        } 
        catch (IOException e) //will catch input output exception or error and show it
        {
            System.out.println("\n\nException Caught: " + e);
        }
    }
}

//File_Writer inheriting File_Creator to access the "file" object who created the text file and pointing to it
class File_Writer extends File_Creator
{
    File_Writer() //File_Writer class constructor
    {
        super(); // will run the parent "File_Creator" class constructor
        
        //will detect the error
        try 
        {
            //will create the writer object which will write to the specified file
            FileWriter pen = new FileWriter(file);

            pen.write("My Name Is Muhammad Bin Zulfiqar"); //text to be written in text file

            System.out.println("\n\n=====File has Been Written !====="); // success message

            pen.close(); //closing the writer
        } 
        catch (IOException e) //will catch input output exception or error and show it
        {
            System.out.println("\n\n Exception Caught: " + e);
        }
    }
}

//File_Reader inheriting File_Writer to access "file" object pointing to the file created before
class File_Reader extends File_Writer
{
    File_Reader()  //File_Reader Constructor
    {
        super();  // will run the parent "File_Writer" class constructor
        String data = ""; 
        try 
        {
            //reader object has access to file which is pointed by "file" object
            Scanner reader = new Scanner(file);

            //will read till next line available means reads one whole line at a time until " \n "
            while ( reader.hasNextLine() ) 
            {
                data += reader.nextLine();   //will append all readed lines to the end of data variable
            }

            reader.close();//will close the object "reader" pointing
        } 
        catch (IOException e) 
        {
            System.out.println("\n\n Exception Caught: " + e);
        }
        finally
        {
            //will run in either cases if error generated or not
            System.out.println("\n\n=======Text File Data =======\n" + data + "\n\n");
        }
    }
}

public class FileHandling 
{
    public static void main(String[] args) 
    {
        //this below object will run the File_Reader class constructor 
        //as well as other class constructors in sequence because multilevel inheritance is formed
        File_Reader r = new File_Reader();
    }
}
