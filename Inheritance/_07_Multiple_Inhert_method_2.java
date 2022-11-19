package JAVA_CONCEPTS.Inheritance;

//Establishing Inheritance With multiple Interface
interface Father
{
    static String myName = "Iam Father";

    public void Father_Method( String identity );
}

interface Mother
{
    static String myName = "Iam Mother";

    public abstract void Mother_Method( String identity );
}

//Implementing two intefaces to establish multiple inheritance
class Child implements Father, Mother
{
    //Firstly Implementing Father Interface Abstract Methods
    public void Father_Method( String identity )
    {
        System.out.println(identity);
    }

    //Secondly Implementing Mother Interface Abstract Methods
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



public class _07_Multiple_Inhert_method_2 
{
    public static void main(String[] args) 
    {
        // Child Constructor will run all other Methods 
        Child c = new Child();   
    }    
}
