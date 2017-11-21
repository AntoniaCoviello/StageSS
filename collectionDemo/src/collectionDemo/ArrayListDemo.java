package collectionDemo;

import java.util.*; 

	class Apple {  
		private static long counter;  
		private final long id = counter++;   
		public long id() { 
			return id;
			} 
		}
	
	class Orange {}  
	
	
	public class ArrayListDemo {

	public static void main(String[] args) {    
		ArrayList<Apple> apples = new ArrayList<Apple>();    
		for(int i = 0; i < 3; i++)      
			apples.add(new Apple());     // Not prevented from adding an Orange to apples:apples.add(new Orange());      
		 
		for(int i = 0; i < apples.size(); i++)    
			System.out.println((apples.get(i)).id());       // Orange is detected only at run time  
		
		for(Apple a:apples) {
			System.out.println(a.id());
		}
	}
	
	}