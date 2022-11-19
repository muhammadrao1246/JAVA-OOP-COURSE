package JAVA_CONCEPTS.Inheritance;

/*  ABSTRACT CLASS DEMONSTRATION */

abstract class abstract_class_1
{
    //can contain any type of variable
    int m; 
    static int n=10;
    final String s = "Cannot be changed";

    // An abstract class may contain abstract methods or simple methods
    
    abstract_class_1() //constructor
    {
        System.out.println("I am parent abstract class");
    }
    
    public abstract void parent_abstract_method();
}

//Abstract class can implement several interfaces but can extend only one abstract class (Not a simple class)
abstract class abstract_class_2 extends abstract_class_1 
{
    
    abstract_class_2( String name ) //constructor of abstract class
    {
        super(); //parent class constructor call " abstract_class_1 "

        System.out.println("I can run with super keyword in the implementer class constructor");
    }

    // An abstract class may contain abstract methods or simple methods
    //Not an abstract method
    public void name()
    {
        System.out.print("Can be contain methods defined as well");
    }

    //abstract method signature
    public abstract void realname(); //must be implemented in simple class

}

//An abstract class needs a simple class to implement all its abstract methods (necessary)
public class _02_abstract_class_inheritance extends abstract_class_2
{
    public _02_abstract_class_inheritance() //constructor
    {
        super( "Muhammad" ); // " abstract_class_2 " class constructor call
        System.out.println("I am abstract class inheritance constructor");
    }

    // " abstract_class_1 " class abstract methods are implemented down here
    public void parent_abstract_method()
    {
        System.out.println("I am abstract method of ' abstract_class_1 ' class ");    
    }
    
    // " abstract_class_2 " class abstract methods are implemented down here
    public void realname()
    {
        System.out.println("I am abstract method of ' abstract_class_2 ' class ");    
    }


    //main method of file named " _02_abstract_class_inheritance " class
    public static void main(String[] args) 
    {
        // all constructor will be called sequentially be this statement
        _02_abstract_class_inheritance abs = new _02_abstract_class_inheritance();
        
        //calling non abstract method of " abstract_class_1 " class
        abs.parent_abstract_method();
                
        //calling non abstract method of " abstract_class_2 " class
        abs.name();
        
        //calling abstract method of " abstract_class_2 " class
        abs.realname();
        
    }


}
