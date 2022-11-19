package JAVA_CONCEPTS.Inheritance;

//ESTABLISHING SINGLE INHERITANCE CONCEPT

//defining a parent class
class parent{
    parent() //parent class's constructor
    { 
        System.out.println("I am Parent Class");
    }
}

//child class inheriting parent class by keyword "extends"
class child extends parent{
    child() //child class's constructor
    { 
        super();//running parent class constructor "NOTE: always place super at top"
        System.out.println("I am Child Class");
    }
}

public class _01_SingleInheritance {
    public static void main(String[] args) {
        child c = new child(); //will run the parent constructor as well as child constructor
        //but runs parent constructor first
    }
}
