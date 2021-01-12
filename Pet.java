import java.util.Scanner;
import javax.swing.JOptionPane;

public class Pet() {
	private String name, type, input;
	private int age;
	private String location;

public static void main(String n, int i){
//Create instance variables, Pet name = new Pet();
this.name = name;
this.type = type;
this.age = age;
this.location = location;

//Creating two argument constructors
//	Pet(int i, String n){
//		age = i;
//		name = n;
//	}

// Store the value of ...
input = JOptionPane.showInputDialog("What is the" + "name of the Pet?");
	n = String.parseString(input);
/*	name.setname(animal); */

//setter method for name
	public void setname(String n){
		this.name = n;
	}
//getter method for name
	public String getname(){
		return name;
	}

input = JOptionPane.showInputDialog("How many years old" + "is the Pet?");
i = Integer.parseInteger(input);
//setter method for age
	public void setage(int i){
		this.age = i;
	}
//getter method for age
	public int getage(){
	if(isValid(age))
		System.out.println("that's a valid age");
	else
		System.out.println("that is not a good age");
	return age;
	}

input = JOptionPane.showInputDialog("Where is the" + "Pet's location?");
area = String.parseString(input);
//setter method for location
	public void setlocation(area){
		this.location = area;
	}
//getter method for location
	public String getlocation(){
		return location;
	}
//getter method for type
	public String gettype(){
		return type;
	}
	System.exit(0);
  }

public Class Food(String otherfood, meat, vegetable){
	private String meat;
	private String vegetable;
	private String otherfood;

public static void Food(String meat, vegetable){
	this.meat = meat;
	this.vegetable = vegetable;
	this.otherfood = otherfood;

input = JOptionPane.showInputDialog("Where is the" + "Pet's location?");
meat = String.parseString(input);
//setter method for meat
public void setmeat(String meat){
	this.meat = meat;
}
//get method for meat
public String getmeat(){
	if(returnString(meat))
	public static void character(String meat){
		String name;
		name = "The food you selected was" + meat;
	}
	else 
		System.out.println("That is not valid.");
	return meat;
}

input = JOptionPane.showInputDialog("Where is the" + "Pet's location?");
vegetable = String.parseString(input);
//setter method for vegetable
public void setvegetable(String vegetable){
	this.vegetable = vegetable;
}
//get method for vegetable
public String getvegetable(){
	if(returnString(vegetable))
	public static void character(String vegetable){
		String name;
		name = "The food you selected was" + vegetable;
	}
	else 
		System.out.println("That is not valid.");
	return vegetable;
}

input = JOptionPane.showInputDialog("Where is the" + "Pet's location?");
otherfood = String.parseString(input);
//setter method for otherfood
public void setotherfood(String otherfood){
	this.otherfood = otherfood;
}
//get method for otherfood
public String getotherfood(){
	if(returnString(otherfood))
	public static void character(String otherfood){
		String name;
		name = "The food you selected was" + otherfood;
	}
	else
		System.out.println("That is not valid.");
	return otherfood;
	}
	System.exit(0);
}
//method that returns a string
	public class returnString {
	public static void main(String[] args){
		String word;
		word = character;
		System.out.println(word);
	}
}
//method that returns a boolean
public static boolean isValid(int number){
	boolean status;
	if (number >= 1 && number <= 100)
		status = True;
	else
		status = False;
	return status;
	}
}
}