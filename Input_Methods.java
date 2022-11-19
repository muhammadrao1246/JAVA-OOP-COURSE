package JAVA_CONCEPTS;

//Importing JOptionpane class to take input and show output in GUI window
import javax.swing.JOptionPane;

//Importing Scanner class from JAVA root package in UTIL subpackage it exists
import java.util.Scanner;

//Scanner Class use to take input from console window in many types
class Scanner_Implementer
{
    //we have to first create object to scanner class passing "System.in" n its constructor
    Scanner input = new Scanner(System.in);

    public void taking_int()
    {
        //taking in variable
        int n;
        n = input.nextInt(); //take input from console window
        
        //taking in an integer array
        int arr[] = new int[5];
        arr[0] = input.nextInt();
    }

    public void taking_Double_and_Float_and_char_and_bool_and_String() 
    {
        //Taking Doubles
        double d = input.nextDouble();
        double arr[] = new double[5]; //"Double" and "double" both keywords are used for double datatype
        arr[4] = input.nextDouble();

        //Taking float
        float f = input.nextFloat();

        //taking bool
        boolean b = input.nextBoolean();

        //taking String
        String s = input.next();
        //OR
        s = input.nextLine(); //to take input with spaces
    }
}

//GUI INPUT CAN ALSO BE TAKEN USING DIALOG BOX AND CAN ALSO BE SHOWN ON SCREEN IN MESSAGE BOX
class JOptionpane_Implementer
{

    String name;
    int AridNo;

    //Input is always returned in the form of string 
    //you have to convert it to the desired datatype by type conversion
    public void TakingInput() 
    {

        name = JOptionPane.showInputDialog("Enter Your Name: ");
        
        //Using function to convert string to integer
        AridNo = 
        Integer.parseInt( 
                JOptionPane.showInputDialog(null, "Enter Your AridNo.:",0)
                );

        //Both methods do the same you can use anyone of them mentioned above
    
    }
    public void Showing_Output() 
    {
        //Show Your Name
        JOptionPane.showMessageDialog( null , name );
        
        //Show Your AridNo.
        JOptionPane.showMessageDialog(null, "20-ARID-" + AridNo);
    
        //Both methods do the same you can use anyone of them mentioned above
    
    }
}

/*
 * REMAINING ARE INPUT THROUGH COMMAND LINE ARGUMENTS
 * 
 * Step 1: you have to learn first how to run java program in cmd
 * Step 2: how to provide arguments in cmd while executing java
 */


public class Input_Methods {
    public static void main(String[] args) 
    {    
        // JOptionpane_Implementer m = new JOptionpane_Implementer();
        // m.TakingInput();
        // m.Showing_Output();
    }
}
