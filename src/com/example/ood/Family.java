package com.example.ood;

import java.util.ArrayList;

/**
 * Write a description of class Family here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Family
{
    private String mother;
    private String father;
    private ArrayList<Person> children ;     // declare an array
    private int childCount;

    private ArrayList<Dog> myDogs;  // declare ArrayList
    // declare a collection of children - what type of object will be stored ??? 
   

   
    public Family(String ma, String pa)
    {
        mother = ma;
        father = pa;
        myDogs = new ArrayList<Dog>(); // create ArrayList
        // create the collection of children
        children = new ArrayList<Person>(); // create fixed size array
    }
    
    // using arrays
    
    //Complete the code
    /* add Person object**/
    public void addChild(Person ch)
    {
        children.add(ch);
        childCount = childCount + 1;
    }

    // output all elements
    public void showAllChildren()
    {
        for(int index=0; index<childCount; index++)
        { 
            Person xx = children.get(index);
            System.out.println(xx.getAsString());
            // OR
            // System.out.println(children[index].getAsString());
        }
    }
    
    // accumulate all elements and return as a String
    public String getAllChildren()
    {
        String s = "";
        for(int index=0; index<childCount; index++)
        { 
            Person xx = children.get(index);
            s = s + xx.getAsString() +"\n";
            //OR  in one line of code ??
        }
        return s;
    }


    /** returns the number of children in their collection
     */
    public int noOfChildren()
    {
        return childCount; 
    }
    
    
    public void removeAChild(int position)
    {
        //????
    }
    
    //Searching
    
    public void showAChild(int position) // print to Terminal window
    {
      // show one child - you need to know its position in
      if (position >=0 && position<childCount)
       {
           Person ppp  = children.get(position);
           System.out.println(ppp.getAsString());
        }
    }  
    
    
    public Person getAChild(int position)
    {
       // get a child given its position in the list. Make sure to check the parameter
        if (position >=0 && position < childCount)
        {
            return children.get(position);
        }
        return null;
    }

    /** Can you write addChild which is the equivalent of  public void addDog(String nnn, String bbb)
     * Check what data a Person  constructor requires and make sure you ask for these as parameters
     */
    public void addChild(String nnn, int ag)
    {
        if(childCount >= 5){
            System.out.println("You already have five children, you can't add another child");
            return;
        }
        Person temp;
        temp = new Person(nnn,ag); //create child object from parameter data
        children.add(temp); // add child object
        childCount++;
    }
    
    // remove a child by name ? find it first and then ??
    public void removeAChild(String name )
    {
     for(int i = 0; i< children.size(); i++){
         if(children.get(i).equals(name))
             children.remove(i);
     }
    }
    
    
    // using Arraylist
    
    /* add dog object**/
    public void addDog(Dog gg) 
    {
        myDogs.add(gg);
    }
        
    /** returns the number of dogs in the collection
     */
    public int noOfDogs()
    {
        return myDogs.size();
    }
    
    /** remove a dog at the position indicated by the parameter
     */
    public void removeDog(int position)
    {
       if (position >=0 && position<myDogs.size()) // this makes sure that position is in the right range
       {
           myDogs.remove(position);
       } 
    }
   
    /** show in the Terminal Window, the dog at the position indicated by the parameter
     * from its collection
     */
    public void showADog(int position) // print to Terminal window
    {
       if (position >=0 && position<myDogs.size())
       {
           Dog ddd;
           ddd = myDogs.get(position);
           System.out.println(ddd.getAsString());
        }
    }  
    
    /** returns a String representation of the dog in the position given 
     * by the parameter
     */
    public Dog getADog(int position)
    {
       if (position >=0 && position<myDogs.size())
       {
           Dog ddd;
           ddd = myDogs.get(position);
           return ddd;
        }
        return null;
    }

    public String getAllDogs()
    {
        String s = "";
        for(int index=0; index<myDogs.size(); index++)
        {
            Dog xx = myDogs.get(index);
            s = s + xx.getAsString() +"\n";
            //OR  in one line of code ??
        }
        return s;
    }

    /** add dog alternative **/
    public void addDog(String nnn, String bbb)
    {
        Dog temp;
        temp = new Dog(nnn,bbb); //create dog object from parameter data
        myDogs.add(temp); // add dog object
    }
    
    
   //**************using loops **************
    public void showAllDogs()
    {
        int index = 0;       
        while (index < myDogs.size()) 
        {    
            Dog temp = myDogs.get(index); 
            // process dog in a relevant way          
            System.out.println(temp.getAsString());
            index++;
        }
    } 
    
   // write a method: "getAllDogs()"
 
} 

        

