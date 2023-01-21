/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_collection_framework;
import java.util.LinkedList;
//Linked Lists are dynamic memory locations means no size limit you can insert, delete or update elements
//It is preferred to store data in LinkedLists which is to be manipulated frequentally 
//The location for the elements of a linked list in memory is not contagious.
//means that are elements are not placed in memory in sequence as we added them in our code in list
/**
 *
 * @author 92311
 */
public class LinkedLists 
{
    LinkedList<String> names = new LinkedList<String>();
    LinkedList<Integer> rollNO = new LinkedList<Integer>();
    LinkedList<Double> cgpa = new LinkedList<Double>();
    
    int records = 0;//current records in lists combined
    public LinkedLists()
    {
        //adding items in names array
        names.add("Zulqarnain"); //add method can be called by instantiating the array list class with specific data type
        names.add("Noor Ullah"); //add method is used to add element in array list in a sequential manner
        names.add("Zain");
        names.add(2, "Muhammad"); //value will be added at index 2
        
        
        //adding items in roll number array
        rollNO.add(1);
        rollNO.add(2); 
        rollNO.add(3);
        rollNO.add(3,4); //on specified index
        
        //adding items in cgpa array list
        cgpa.add(5.0);
        cgpa.add(5.1);
        cgpa.add(5.2);
        cgpa.add(0.0);
 
        //display data
        records= 4; //data in both array list currently
        Display(); //method defined below
        
        
        //Removing Data From ArrayList
        names.remove(1); //remove elements by specifying their index, you know in which manner you added data better
        names.remove("Zulqarnain"); //also by specifying the data itself you can remove it
        
        rollNO.remove(0);
        rollNO.remove(Integer.valueOf(3)); //for the ineteger data we have to parse an "Integer" object reprsentation of our numeric data which is in array 
    
        cgpa.remove(Double.valueOf(5.2));
        cgpa.remove(0);
        
        //display data
        records = 2; //remaining items after deletion
        Display();
        
        //Updating records in array lists
        names.set(0, "Hello");
        names.set(1, "Bye");
        
        rollNO.set(0, 507); //here element value is explicitily specified so we dont have to convert it first
        rollNO.set(1, 537);
        
        cgpa.set(0, 5.5);
        cgpa.set(0, 4.5);
        
        //display data
        records = 2; //remaining items after deletion
        Display();
        
        
        //extra functions
        names.size(); //returns size of an arraylist
        names.clear(); //clear all the elements from array list in other words makes it empty
        names.contains("Noor Ullah"); //want to search a value provide in parameter it wlll return true or false depending on its occurrence in the list
        names.isEmpty(); //returns whether an array list is empty or not
        names.addFirst("Hehe"); //can add element at start of the link list
        names.addLast("Boyyy"); //can add element at the end of the linked list
        names.getFirst(); //returns value from start of the list
        names.getLast(); //returns value from end of the list
        
        //can also be used to implement stack Data structure
        names.push("i will be appended on the end of the list");
        names.pop(); //last pushed element will be popped out or deleted
        
        
        //there are many other methods of ArrayLists you can explore them on yourself
    }
    
    public void Display()
    {
        //get method is used to access value at specified index which will represent the order in which items are added usually
        names.get(0); // it will return data "Zulqarnain" from the 'names' array
        
        //diplaying the data
        System.out.println("\n\nNames\t\tRoll No\t\tCGPA");
        for (int i = 0; i < records; i++) 
        {
            System.out.println(names.get(i)+"\t\t"+rollNO.get(i)+"\t\t"+cgpa.get(i)); //here also index start with 0 like an array
            //also here get method is called by array list object to get the value added at specified index or in specified manner
        }
    }
    public static void main(String s[])
    {
        LinkedLists a_user_defined_class = new LinkedLists();
    }
}
