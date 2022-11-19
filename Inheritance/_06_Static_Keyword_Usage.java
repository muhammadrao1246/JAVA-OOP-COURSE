package JAVA_CONCEPTS.Inheritance;


class usage_of_static_keyword
{
    /*
     * static variable can be defined and can be accessed without instantiating the class
     * or by calling without an object of the class
     */
    //==========static variable value can be modified further as per required
    static String myName = "Muhammad";

    /*
     * Static variable also used to prevent overriding of method 
     */
    //=========Static Method Defined
    public static void Iam_Static_Method()
    {
        System.out.println("I cannot be overrided in the child class");
    }

    //NOTE: "Static methods are also use to be accessed without instantiating the class"
}


public class _06_Static_Keyword_Usage extends usage_of_static_keyword 
{
    // *****NOT POSSIBLE*****
    /*
     * public void Iam_Static_Method()
     * {
     *       System.out.println("No one can override me now");
     * }
     */

    public static void main(String[] args) 
    {
        usage_of_static_keyword usg   = new usage_of_static_keyword(); // object of parent class 

        _06_Static_Keyword_Usage stat = new _06_Static_Keyword_Usage(); //object of child class

        
        // *****NOT POSSIBLE*****
        /*
         *      stat.Iam_Static_Method();
         *      OR
         *      usg.Iam_Static_Method();
         */
        
        //Both Approaches of calling static  method is true because of inheritance included
        //So child class can also inherit and can call the static method

        usage_of_static_keyword.Iam_Static_Method(); //parent class
        
        _06_Static_Keyword_Usage.Iam_Static_Method(); //child class


        //USING Static Variable
        //both approaches are true because of inheritance included
        String s = usage_of_static_keyword.myName;
        s = _06_Static_Keyword_Usage.myName;        //no need to make object to access

    }
}
