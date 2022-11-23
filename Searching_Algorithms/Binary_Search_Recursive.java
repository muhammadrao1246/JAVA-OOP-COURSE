package JAVA_CONCEPTS.Searching_Algorithms;

//To binary Search an array the inputed array must be sorted first
public class Binary_Search_Recursive 
{
    
    public static void Binary_Search_Algorithm(int a[],int keyValueToBeSearched,int begin, int end)
    {
        if (begin < end) 
        {
            int mid = (begin + end)/2;
            if ( a[mid] == keyValueToBeSearched ) //value found at mid index we computed yet 
            {
                System.out.println("Your Searched Value "+keyValueToBeSearched+" iS Found At Index: "+mid);
                return;
            }
            else if ( keyValueToBeSearched < a[mid] ) //go on left portion of the mid as searched value is lesser than mid indexed value
            {
                Binary_Search_Algorithm(a, keyValueToBeSearched, begin, mid-1);
            }
            else if( keyValueToBeSearched > a[mid] ) //go on right portion of the mid as searched value if > than mid indexed value
            {
                Binary_Search_Algorithm(a, keyValueToBeSearched, mid+1, end);
            }
        }
        else //the value you searched is not found because begin point and ending point are turned equal
        {
            System.out.println("Key Value You Searched Is Not Found");
            return;
        }
    }
    public static void main(String[] args) 
    {        
        int[] arr = {1,2,3,4,5,6,7,8,9,10}; //sorted array
        
        //providing array , first index, last index and searched value ( 8 ) as parameter
        Binary_Search_Recursive.Binary_Search_Algorithm(arr, 8, 0, arr.length-1); 
    }
}
