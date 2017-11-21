package exercise4;

import java.util.Comparator;

public class Character implements Comparable<Character> {

	String name;

	String surname;
	
	//empty constructor
	public Character() {}
	
	//constructor with args 
	public Character(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}
    //get and set methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}



	@Override
	public int compareTo(Character o1) {
			return this.name.compareTo(o1.name);
		
		
	}




	
	
	
	
	
}
