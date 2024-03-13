package com.example.ood;

public class Person
{
    // object fields			
	private String name;			
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private int id;

    public Person (String s, int a)
	{ 
         name = s;
		 age = a;
	}
	public Person (String s, int a, int id)
	{
		name = s;
		age = a;
		this.id = id;
	}
	
	public String getName()		
	{	
		 return name;
	}
	
	public String getAsString()
	{
	     String s ="\n  " + name + " aged: " + age ;
	     return s;
	    
	}
	
	public void addYear()
	{
        age = age + 1;
    }
} 
