package JAVA_CONCEPTS;

//Method overloading defining same named methods within one class, differs each other in terms of parameter datatypes and
//number of parameters used. Every method runs individually according to its requirements.

public class MethodOverloading {

    public void showName(  )
    {
        System.out.println("My Name is Muhammad");
    }

    //Not Possible by changing return type only
    // public boolean showName(){
    //     return true;
    // }

    public void showName( String s )
    {
        System.out.println("My Name is " + s );
    }

    public void showName( String firstname, String secondname )
    {
        System.out.println("My Name is " + firstname + secondname );
    }

    public void showName( String name, int aridno )
    {
        System.out.println("My Name and AridNo. is " + name + aridno );
    }
    
    public static void main(String[] args) {
        MethodOverloading mth = new MethodOverloading();
        
        mth.showName(); //Will run the First method that takes no parameters

        mth.showName("Zain"); //will run the second method which takes exactly one parameter

        mth.showName( "Zain", "NoorUllah"); //will run the second method taking two parameters


    }
}
