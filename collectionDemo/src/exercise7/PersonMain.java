// Create a class, then make an initialized array of objects of your class. 
//Fill a List from your array. Create a subset of your List by using subList( ), 
//then remove this subset from your List.


package exercise7;

import java.util.ArrayList;
import java.util.List;


public class PersonMain {


	public static void main(String[] args) {
		
		List<Person> people= new ArrayList<Person>();
		people.add(new Person("Pippo","Pluto"));
		people.add(new Person("Paolo","Bianchi"));
		people.add(new Person("Mario","Rossi"));
		people.add(new Person("Carlo","Nero"));
		
		System.out.println(people.toString());
		List<Person> set=people.subList(2, 4);
		people.removeAll(set);
		System.out.println(people.toString());
		
		
	}
}
