package JAVA_CONCEPTS.Inheritance;

//Establishing Inheritance With an Abstract Class And  an Interface
interface Father
{
    static String myName = "Iam Father";

    public void Father_Method( String identity );
}

abstract class Mother
{
    static String myName = "Iam Mother";

    public abstract void Mother_Method( String identity );
}

class Child extends Mother implements Father
{
    //Firstly Implementing Father Interface Abstract Methods
    public void Father_Method( String identity )
    {
        System.out.println(identity);
    }

    //Secondly Implementing " Mother " Abstract Class -> Abstract Methods
    public void Mother_Method( String identity )
    {
        System.out.println(identity);    
    } 

    //Child Class Constructor
    public Child()
    {
        Father_Method( Father.myName );
        Mother_Method( Mother.myName );
        System.out.println(" Iam Child ");
    }
}

public class _07_Multiple_Inhert_method_1 
{
    public static void main(String[] args) 
    {
        //Constructor  will run and run all other methods
        Child c = new Child();
    }    
}
