package JAVA_CONCEPTS.Inheritance;

//Establishing Inheritance With an Abstract Class and multiple Interfaces

//Declaring Two Interfaces
interface Engine
{
    static String myName = "Iam Engine";

    public void Engine_Method( String identity );
}

interface Body
{
    static String myName = "Iam Body";

    public abstract void Body_Method( String identity );
}

//Declaring one abstract class
abstract class Tires
{
    static String myName = "We are Tires";

    public abstract void Tires_Method( String identity );
}

//Implementing two intefaces and one abstract class to establish multiple inheritance
class Car extends Tires implements Engine, Body
{
    //Firstly Implementing "Engine and Body" Interfaces Abstract Methods
    public void Engine_Method( String identity )
    {
        System.out.println(identity);
    }

    public void Body_Method( String identity )
    {
        System.out.println(identity);    
    } 

    //Secondly Implementing " Tires " abstract method
    public void Tires_Method( String identity )
    {
        System.out.println(identity);    
    } 

    //Child Class Constructor
    public Car()
    {
        Engine_Method( Engine.myName );
        Body_Method( Body.myName );
        Tires_Method( Tires.myName );
        System.out.println("Iam a Fully Completed Car");
    }
}


public class _07_Multiple_Inhert_method_3 
{
    public static void main(String[] args) 
    {
        Car c = new Car();   
    }
}
