package JAVA_CONCEPTS;

class Arrays{
    //another method to use scanner without importing, highly usable incase you forgot 
    java.util.Scanner input = new java.util.Scanner(System.in);

    public void ONE_DIMENSIONAL_Arrays(){


        //=======> INTEGER ARRAYS

        //-----By Default

        //when using '[]'  before variable name
        int[] i1 = {1,2,3,4,5}; //just combined declaration and assignment
        i1 = new int[]{1}; //when again have to do we have to do this technique
        
        //when using '[]' after variable name
        int i2[] = {1,2,3,4,5}; 
        i2 = new int[]{5,4,3,2,1}; //when again initialization we have to do like this

        //-----By Taking Input filling through a loop

        int i3[] = new int[5]; 
        int[] i4 = new int[5];

        for (int i = 0; i < i3.length; i++) {
            i3[i] = input.nextInt();
            i4[i] = input.nextInt(); //Just demo you can take input here by Scanner class 
        }

        //=========>SAME METHOD WILL BE FOLLOWED BY ALL OTHER DATA TYPES THAT ARE PRIMITIVES (float, double, char)
        /* 
        //_____DECLARATION______
        DATATYPE[] VAR_NAME ;       OR      DATATYPE VAR_NAME[]; 
        VAR_NAME = new DATATYPE[ SIZE_OF_ARRAY ]    
        
        //_______INITIALIZATION_______
        --when '[]' before VAR_NAME :
                DATATYPE[] VAR_NAME = {Item1, item2, item3,.....,itemN};
        --when '[]' after VAR_NAME :
                DATATYPE VAR_NAME[] = {Item1, item2, item3,.....,itemN};
        
        */
        
        //=========> STRING ARRAYS
        
        //--------declarartion and initailization combined
        String[] s1 = {"m","u","h","a","m","m","a","d"};
        String s2[] = {"m","u","h","a","m","m","a","d"};
        //--------decalartion and initialization when separate
        String[] s3;
        s3 = new String[]{"m","u","h","a","m","m","a","d"};
        String s4[];
        s4 = new String[]{"m","u","h","a","m","m","a","d"};

        //--------When declaring fixed sized array
        String[] s5 = new String[10]; //you can also take this size from user in a variable
        String s6[] = new String[5];

        //---------When taking size input from variable
        int size = input.nextInt();
        String s7[] = new String[size];
        
        //---------You can fill array by taking input from user
        for (int i = 0; i < s7.length; i++) {
            s7[i] = input.next(); //OR input.nextLine() to take uput with spaces
             //Just demo you can take input here by Scanner class 
        }
    }
    public void TWO_DIMENSIONAL_Arrays(){


        //=======> INTEGER ARRAYS

        //------------By Default

        //          array of    5 x 1
        int i1[][] = { {1,1} ,{1,2} ,{1,3}, {4,3}, {5,4} };
        int[][] i2 = { {1} ,{2} ,{3}, {4}, {5}}; //just combined declaration and assignment
        
        //          array of    5 x 2
        i2 = new int[][] { {1,3} ,{2,1} ,{3,1}, {4,3}, {54,43}}; //when again have to do we have to do this technique
        

        //-------------By Taking Input filling through a loop

        int i3[][] = new int[5][5];  //5 rows x 5 cols 
        int[][] i4 = new int[5][5];

        for (int i = 0; i < i3.length; i++) //iterate to total number of rows times
        {
            for (int j = 0; j < i3[0].length; j++) //iterate to total number of cols times
            {
                i3[i][j] = input.nextInt();
            } 
        }

        //=========>SAME METHOD WILL BE FOLLOWED BY ALL OTHER DATA TYPES THAT ARE PRIMITIVES (float, double, char)
        /* 
        //_____DECLARATION______
        DATATYPE[][] VAR_NAME ;       OR      DATATYPE VAR_NAME[][]; 
        VAR_NAME = new DATATYPE[ NUM_OF_ROWS ][ NUM_OF_COLS ]    
        
        //_______INITIALIZATION_______
        --when '[][]' before VAR_NAME :
                DATATYPE[][] VAR_NAME = {
                                        {Item1, item2, item3},
                                        {Item1, item2, item3},
                                            .............,
                                        {ItemN, itemN, itemN},
                                        };
        --when '[][]' after VAR_NAME :
                DATATYPE VAR_NAME[][] = {
                                        {Item1, item2, item3},
                                        {Item1, item2, item3},
                                            .............,
                                        {ItemN, itemN, itemN},
                                        };
        
        */
        
        //=========> STRING ARRAYS
        
        //--------declarartion and initailization combined
        String[][] s1 = { 
                            {"m","u","h"},
                            {"a","b","c"}
                        };
        String s2[][] = {                       //Arrays of 2rows x 3cols
                            {"m","u","h"},
                            {"a","b","c"}
                        };
        //--------decalartion and initialization when separate
        String[][] s3;
        s3 = new String[][]{ {"m","u","h"}, {"a","b","c"} };
        
        //--------When declaring fixed sized array
        String[][] s5 = new String[5][5]; //you can also take this size from user in a variable
        String s6[][] = new String[5][5];

        //---------When taking size input in variable from user
        int rows = input.nextInt();
        int cols = input.nextInt();
        String s7[][] = new String[ rows ][ cols ];
        
        //---------You can fill array by taking input from user
        
        for (int i = 0; i < s7.length; i++) //iterate to total number of rows times
        {
            for (int j = 0; j < s7[0].length; j++) //iterate to total number of cols times
            {
                s7[i][j] = input.next(); //OR input.nextLine() to take uput with spaces
            } 
        }
    }

}

public class Arrays_In_Java {
    public static void main(String[] args) 
    {
        //You can also make arrays of objects  
        //Class arrays
        Arrays[] a = new Arrays[10];

        //then allocate memory to each object in array to run the constructor using loops
        for (int i = 0; i < a.length; i++) {
            a[i] = new Arrays();
        }
    }
}
