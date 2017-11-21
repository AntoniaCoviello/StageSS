package exercise2;

import java.util.*; 

public class SetDemo {
	public static void main(String[] args) { 
		List<Integer> c =  new ArrayList<Integer>();  
		//Set<Integer> c =  new HashSet<Integer>(); 
		for(int i = 0; i < 10; i++)    
			c.add(i); // Autoboxing  
		//c.add(0);
		for(Integer i : c)     
			System.out.print(i + ", "); 
		}
}




