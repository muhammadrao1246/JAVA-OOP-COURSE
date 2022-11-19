package JAVA_CONCEPTS;


class TypeConversion 
{
    public void ConvertingDatatypes()
    {

        //INTEGER TO HEXDECIMAL AND OCTAL REPERESENTATION OF NUMBER
        int n = 10;
        String h = Integer.toHexString(n);
        String o = Integer.toOctalString(n);
        
        //STRING TYPE CONVERSIONS
        String s = "muhammad";
        s = s.toString();
        s = String.valueOf('A'); //character to
        s = String.valueOf(65.34f); //float to
        s = String.valueOf(65.34d); //double to
        s= String.valueOf(100); //give stringal representation of any datatype parsed in it

        //CHARACTER DATA TYPE OF CONVERSIONS
        char c='c'; //Stores only one character
        c = (char)1234; //returns character representation of ASCII CODE ( 1234 )
        c = (char)65.5; //truncate the decimal points value and return character representation of ASCII CODE ( 65 ) which is 'A'


        //FLOAT DATATYPE OF CONVERSIONS
        float f = (float)100; //integer to
        f = Float.parseFloat("10.3"); //double to
        Float F = (float)(3.5d); //double to
        F = Float.parseFloat("j"); //float representation of character which will be adcii code

        //DOUBLE DATATYPE CONVERSIONS
        Double D = Double.parseDouble("20"); //integer to
        D = (double)'A'; //character to double
        

        //=====INTEGER DATATYPE CONVERSIONS======
        int num;

        //CONVERTING FROM FLOAT TO INT
        num = (int)2.5f;        //also possible (int)(2.5f)
        //writing "f" with floating value to denote it is a float value otherwise it will take it as Double
        num = Integer.parseInt("2.55f");

        //CONVERTING FROM DOUBLE TO INT
        num = Integer.parseInt("3.5"); //simple "2.5" value is denoted as double
        num = (int)2.4; 

        //CONVERTING FROM CHAR TO INT
        num = Integer.parseInt("A"); //will return ascii code integer Representation of A = 65
        num = (int)'A'; //Also return 65
    }
}


public class TypeCasting {
    public static void main( String[] s) {
        //THIS PROGRAM JUST SPECIFY HOW MANY WAYS ARE THERE FOR TYPE CONVERSION STATICALLY
    }    
}
