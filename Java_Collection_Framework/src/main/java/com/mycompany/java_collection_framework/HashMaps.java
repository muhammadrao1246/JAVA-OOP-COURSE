/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_collection_framework;

import java.util.HashMap;

//Java HashMap class implements the Map interface which allows us to store key and value pair, where keys should be unique. 
//        If you try to insert the duplicate key, it will replace the element of the corresponding key.
//        It is easy to perform operations using the key index like updation, deletion, etc. 
//        HashMap class is found in the java.util package.
/**
 *
 * @author 92311
 */
public class HashMaps
{
    //we can HashMap as an associative array having Keys and Values holding different defined datatypes
    HashMap student_1 = new HashMap();
    HashMap student_2 = new HashMap();
    HashMap student_3 = new HashMap();
    
    public HashMaps()
    {
        //Inserting values in HashMaps
        student_1.put("Name", "Muhammad"); //can have any datatype based keys
        student_1.put("Arid No", "20-ARID-507"); //can have any type values against keys
        student_1.put(1, 4.0); //keys datatypes can also be any of the primitive or non primitives
        
        student_2.put("Name", "Noor Ullah");
        student_2.put("Arid No", "20-ARID-537");
        student_2.put(1, 4.5);
        
        student_3.put("Name", "Zulqarnain");
        student_3.put("Arid No", "20-ARID-528");
        student_3.put(1, 10.0); //:-XD
        
        //Display data
        System.out.println("\n\n---------After Inserting Data in HashMaps----------");
        Display();
        
        //Updating values in HashMaps
        //------------values can be updated also by put method which will replace the specified value
        student_2.put("Name", "Shehzar");
        student_2.put("Arid No", "20-ARID-000");
        student_2.put(1, 5.5);
        //------------the direct method for updation is replace method which will replace the old key value with the new one
        student_3.replace("Name", "Muhammad Zulqarnain ");
        
        
        //Now displaying after updating
        System.out.println("\n\n---------After Updating a HashMap----------");
        Display();
        
        //Removing Elements From HashMap
        student_3.remove("Arid No");
        student_3.remove("Name");
        student_3.remove(1);
        
        //Now displaying after removing elements
        System.out.println("\n\n---------After Removing a HashMap Values----------");
        Display();
        
        
        //extra methods
        student_1.clear(); //removes all elements from HashMap
        student_1.size(); //how many entries are there in the hashmap
        student_2.isEmpty(); //to check if the hashmap has elements or not
        student_2.putIfAbsent("Class", "BSCS-5A"); //will add or put the element in the HashMap if it does not exists
        student_2.containsKey("Class"); //will check whether there is a key exists with this name or not
        student_3.containsValue("20-ARID-507"); //will check the occurence of the value in the hashmap
    }
    
    public void Display()
    {
        //get method is used to obtain value against specified key on which the value is stored
        student_1.get("Name"); //will return the name Muhammad
        
        System.out.println("Name\t\t\t\tRoll No\t\t\t\tCGPA");
        System.out.println( student_1.get("Name") + "\t\t\t" + student_1.get("Arid No") + "\t\t\t" + student_1.get(1));
        System.out.println( student_2.get("Name") + "\t\t\t" + student_2.get("Arid No") + "\t\t\t" + student_2.get(1));
        System.out.println( student_3.get("Name") + "\t\t\t" + student_3.get("Arid No") + "\t\t\t" + student_3.get(1));
        
    }
    public static void main(String[] s)
    {
        HashMaps a_user_defined_class = new HashMaps();
    }
}
