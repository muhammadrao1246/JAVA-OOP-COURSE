package JAVA_CONCEPTS.Inheritance;

import java.util.Scanner;

/* Interface Demonstration */

//Interface can extends one or more interfaces in it 
//but a simple class will be always needed to implement the interface abstract methods


//Everything in interface is defaultly public

interface calculator    //it cannot contain a constructor 
{
    //can only contain final or static scope variables 
    //with declaration and initialization at the same point
    final String operators[] = { "+","-","x","/" }; //cannot be changed it is constant
    static Double result = 0.0;

    static Scanner input = new Scanner(System.in); //to take input
    
    
    //simple methods definitions are not allowed

    //it contains only abstract , static and default methods definitions

    Double addition ( Double a, Double b );
    Double subtact  ( Double a, Double b ); //all are abstract methods
    Double multiply ( Double a, Double b );
    Double divide   ( Double a, Double b );
    
    static int menu()
    {
        for (int i = 0; i < operators.length; i++) 
        {
            System.out.println("Press "+ (i+1) +" FOR \t"+ operators[i] );    
        }
         
        return input.nextInt(); //returning inputed choice
    } 

    default Double[] take_input() //returning array of values
    {
        Double[] values = new Double[2];

        System.out.print("\n Enter First  Value: "); 
        values[0] = input.nextDouble(); 
        
        System.out.print("\n Enter Second Value: "); 
        values[1] = input.nextDouble(); 
        
        return values;
    }
    
}


public class _03_interfaces_inheritance implements calculator
{
    //must needed to implement all abstract method of interface "calculator"
    public Double addition ( Double a, Double b )
    {
        return (a+b);
    }
    public Double subtact  ( Double a, Double b )
    {
        return (a-b);
    }
    public Double multiply ( Double a, Double b )
    {
        return (a*b);
    }
    public Double divide   ( Double a, Double b )
    {
        return (a/b);
    }
    
    //_03_class contructor that will implement all of this
    public _03_interfaces_inheritance( int choice )
    {
        //will return the array of input values
        Double[] values = take_input(); //calling default method of interface to take input

        switch ( choice ) 
        {
            case 1:
            {
                System.out.println("\n\n The Result of '" + operators[0] + "' is: "+ addition(values[0], values[1]) );
                break;
            }
            case 2:
            {
                System.out.println("\n\n The Result of '" + operators[1] + "' is: "+ subtact(values[0], values[1]) );
                break;
            }   
            case 3:
            {
                System.out.println("\n\n The Result of '" + operators[2] + "' is: "+ multiply(values[0], values[1]) );
                break;
            }   
            case 4:
            {
                System.out.println("\n\n The Result of '" + operators[3] + "' is: "+ divide(values[0], values[1]) );
                break;
            }       
                
            default:
            {
                System.out.println("***********Invalid Operator Choice***********");
                break;
            }
        }

    }

    //main method of _03_ class
    public static void main(String[] args) 
    {
        //calling menu first        
        int choice = calculator.menu(); //will return the choice of user

        //throwing choice to constructor
        _03_interfaces_inheritance inter = new _03_interfaces_inheritance( choice ); 

    }
}
