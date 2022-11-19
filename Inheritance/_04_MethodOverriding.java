package JAVA_CONCEPTS.Inheritance;

//Method Overriding is having same methods in inheritance ( parent+child - relationship )
// when the same method is called by instantiating child class it overrides the same method which is in the
//parent class.


class overridden
{
    public void overridden_method() //method which is going to be overrided
    {
        System.out.println("Iam the Overrided method");
    }
}

public class _04_MethodOverriding extends overridden
{
    public void overridden_method() //method which is going to overiride
    {
        System.out.println("Iam the Overrided method");
    }

    public static void main(String[] args) {
        _04_MethodOverriding mov = new _04_MethodOverriding();

        mov.overridden_method(); 
        //it will run the method which is in the child class "MethodOverriding" by overriding the parent class method
    }
    
}
