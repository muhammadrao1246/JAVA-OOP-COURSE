package JAVA_CONCEPTS;

class Exception__Handling{
    public void Exception_Handler()
    {
        try{
            int n = 1/0; //Creates ArithMetic Exception
            //We can have here more than one nested try-catch block 
            try
            { }
            catch(ArithmeticException a) { }

            // try 
            // {  }
            // catch ( IOException i) { }


            //try-finally block in supervision of main CATCH block
            try
            { }
            finally { }


            //NOTE: finally block can also be used here after catch blocks
        }
        catch( Exception e )//also possible ( ArithmeticException a ,IOException i  )
        {
            //Exception Detail Message
            System.out.println("Exception Details:  " + e.toString() + ""); 
            //Exception Detail Message
            System.out.println("Exception Details:  " + e + "");
            //Also Exception Detail Message Same As Aboves You can use any of them
            System.out.println("Exception Details:  " + e.getMessage() + " \n");

            //Exception Type ArithmeticException or IOException, etc "MOT NECESSARY TO LEARN"
            System.out.println("Exception Type:  " + e.getClass().getSimpleName() + " \n");
            
            /*  There are many other methods under Exception class object 
                ("Here is 'e' ") you can use any of them for different purposes */
            
        }
        finally 
        {
            //It is optional to include finally block
            System.out.print("I always run in either cases");
        }
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        Exception__Handling e = new Exception__Handling();
        e.Exception_Handler();
    }
}
