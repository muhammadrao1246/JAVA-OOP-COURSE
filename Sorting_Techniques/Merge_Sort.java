package JAVA_CONCEPTS.Sorting_Techniques;


import java.util.Arrays;

public class Merge_Sort 
{
    public void merge_sorting( int[] a, int min, int max ) 
    {
        if ( min < max ) 
        {

            int mid = (min+max)/2;
        
                  
            merge_sorting(a,min,mid);
            merge_sorting(a,mid+1,max);

            merger(a, min, mid , max);
        }
        
        return;
    }
    public void merger(int[] a,int left_part, int right_part, int size) 
    {
        
        int first_half = right_part - left_part + 1; //left half total elements
        int second_half = size - right_part; //right half total elments

        //temp arrays of right left halfs
        int Left[ ] = new int[first_half]; 
        int Right[ ]  = new int[second_half];

        //allocating data to temp arrays
        for( int i = 0; i< first_half; i++ )
            Left[i] = a[ i + left_part ];

        for( int i = 0; i< second_half; i++ )
            Right[i] = a[ i + (right_part + 1) ];
        

        //holding indexes of both arrays
        int i = 0;
        int j = 0; 
        int k = left_part;


        //performing swap operation based on conditions
        while ( i < first_half && j < second_half ) //when indexes of both arrays are less thn their size
        {
            if( Left[i] <= Right[j] ) //if left side elements is small or equals
            {
                a[k] = Left[i];
                i++;
            }
            else //if right side element is small
            {
                a[k] = Right[j];
                j++;
            }
            k++;
        }

        //if remaining elements in left side pasting it in the end of a
        while ( i < first_half ) 
        {
            if(k <= size) a[k] = Left[i];
            i++; k++;   
        }

        //if remaining elements in right side pasting it in the end of a
        while ( j < second_half ) 
        {
            if(k <= size) a[k] = Right[j];
            j++; k++;   
        }

    }



    public static void main(String[] args) 
    {
        Merge_Sort m  = new Merge_Sort();
        
        int[] a={5,4,3,2,1}; //INput Array


        System.out.println("Before Sorting:\n");
        
        System.out.print((Arrays.toString(a))+"\n");


        m.merge_sorting(a, 0, a.length-1); //calling merge sort function on array 'a'

        
        System.out.println("After Sorting:\n");
        
        System.out.print((Arrays.toString(a))+"\n");
    }
    
}

