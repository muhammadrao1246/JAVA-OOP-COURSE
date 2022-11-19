package JAVA_CONCEPTS.Inheritance;

class inheriting
{
    //No one Can change value of FINAL variable once it is declared and initalized
    final int n = 10;

    // ***********NOT POSSIBLE NOW FURTHER ***********
    /*
     *  n  = 100000;
     */

    //No Other Method in the Child Class can override this " Iam_Final_Method " method of this class
    public final void Iam_Final_Method() //can be overloaded
    {
        System.out.print("Iam Final Method cannot be overrided ! ");
    }
    
}

// now no other class can inherit this " Final_Class " further anymore
final class Final_Class extends inheriting
{
    // ***********NOT POSSIBLE Here***********
    /*
     * public void Iam_Final_Method()
     * {
     *      System.out.println("No one can override");
     * }
     */

}

// ***********NOT POSSIBLE***********
/*
 * class I_Cannot_inherit extends Final_Class
 * {
 * 
 * }
 */

public class _05_Final_Keyword_Usage {
    
}
