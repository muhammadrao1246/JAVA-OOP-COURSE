/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_collection_framework;

import java.util.Iterator;
import java.util.TreeMap;
/*Java TreeMap class is a red-black tree based implementation.
It provides an efficient means of storing key-value pairs in sorted order.
The important points about Java TreeMap class are:

Java TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
Java TreeMap contains only unique elements.
Java TreeMap cannot have a null key but can have multiple null values.
Java TreeMap is non synchronized.
Java TreeMap maintains ascending order.*/
/**
 *
 * @author 92311
 */
public class TreeMaps 
{
    //it stores data in a tree form sorted manner
    TreeMap alphabets = new TreeMap();
    
    public TreeMaps()
    {
        //Inserting items in treemap
        alphabets.put("A", "Apple");
        alphabets.put("C", "Cat");
        alphabets.put("D", "Dog");
        alphabets.put("S", "Sun");
        alphabets.put("Q", "Qasim");
        alphabets.put("B", "Ball");
        
        //display data after insertion
        System.out.println("\n\n---------After Inserting Data in TreeMap----------");
        Display();
        
        
        //Updating values in Tree map
        //------------values can be updated also by put method which will replace the specified value
        alphabets.put("A", "Ashhal");
        alphabets.put("S", "SuperJin");
        
        //------------the direct method for updation is replace method which will replace the old key value with the new one
        alphabets.replace("Q", "Qasim Suri");
        
        //display data after updation
        System.out.println("\n\n---------After Updating a TreeMap----------");
        Display();
        
        
        //Removing data from the tree
        alphabets.remove("A");
        
        //displaying after removal
        System.out.println("\n\n---------After Removing a TreeMap Values----------");
        Display();
        
        
        //Extra Supportive MEthods
        alphabets.clear(); //removes all elements from TreeMap
        alphabets.size(); //how many entries are there in the Treemap
        alphabets.isEmpty(); //to check if the treemap has elements or not
        alphabets.putIfAbsent("E", "Ellie"); //will add or put the element in the TreeMap if it does not exists
        alphabets.containsKey("Class"); //will check whether there is a key exists with this name or not
        alphabets.containsValue("Apple"); //will check the occurence of the value in the hashmap
        
    }
    
    public void Display()
    {
        //by get method we can obtain value at specified key in tree map
        alphabets.get("A");
        
        //Iterator i = alphabets.entrySet().toArray(); 
        //uou can traverse alon all the tree elements by converting the entry set to array
        
        
        //we can represent whole tree's elelments as array representation
        System.out.println(alphabets);    
    }
    
    public static void main(String[] s)
    {
        TreeMaps a_user_defined_class = new TreeMaps();
    }
}
