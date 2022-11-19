package JAVA_CONCEPTS.Inheritance;

//Establishing Multilevel Inheritance With an Abstract Class and multiple Interfaces

//Declaring Two Interfaces
abstract class Engine
{
    static String myName = "Iam Engine";

    public abstract void Engine_Method( String identity );
}

interface Body
{
    static String myName = "Iam Body";

    public void Body_Method( String identity );
}

//First extending ENGINE and Implementing BODY
class Frame extends Engine implements Body
{
    //Firstly Implementing "Engine and Body" Abstract Methods
    public void Engine_Method( String identity )
    {
        System.out.println(identity);
    }

    public void Body_Method( String identity )
    {
        System.out.println(identity);    
    }
}

//Declaring one abstract class
interface Tires
{
    static String myName = "We are Tires";

    public void Tires_Method( String identity );
}

//Implementing FRAME and TIRES abstract class to establish multilevel and multiple inheritance
class Car extends Frame implements Tires
{
     
    //Implementing " Tires " abstract method
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


public class _08_Multilevel_Inhert_part_1 
{
    public static void main(String[] args) 
    {
        //will run all the methods called in constructor inherited through multilevel
        Car c = new Car();
    }    
}
