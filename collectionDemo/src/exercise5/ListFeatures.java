package exercise5;

import java.util.*;

public class ListFeatures { 
	public static void main(String[] args) {   
		Random rand = new Random(47);    
		List<Integer> integers = new ArrayList<Integer>(7); 
		System.out.println("1: " + integers); 
		int h=10;
		integers.add(h); // Automatically resizes     
		System.out.println("2: " + integers);    
		System.out.println("3: " + integers.contains(10));   
		Integer ii = integers.get(0);   
		System.out.println("4: " +  ii + " " + integers.indexOf(ii));   
		System.out.println("5: " + integers.indexOf(10)); 
		System.out.println("6: " + integers.remove(0));     // Must be the exact object: 
		System.out.println("7: " + integers.remove(ii));   
		System.out.println("8: " + integers);   
		integers.add(0, new Integer(10)); // Insert at an index 
		integers.add(1, new Integer(30));
		integers.add(2, new Integer(50));
		integers.add(3, new Integer(20));
		integers.add(4, new Integer(40));
		System.out.println("9: " + integers);   
		List<Integer> sub = integers.subList(1, 4);  
		System.out.println("subList: " + sub);     
		System.out.println("10: " + integers.containsAll(sub));   
		Collections.sort(sub); // In-place sort     
		System.out.println("sorted subList: " + sub);     // Order is not important in containsAll(): 
		System.out.println("11: " + integers.containsAll(sub));    
		Collections.shuffle(sub, rand); // Mix it up   
		System.out.println("shuffled subList: " + sub);    
		System.out.println("12: " + integers.containsAll(sub));  
		List<Integer> copy = new ArrayList<Integer>(integers);   
		sub = Arrays.asList(integers.get(1), integers.get(4));   
		System.out.println("sub: " + sub);     
		copy.retainAll(sub);    
		System.out.println("13: " + copy); 
		copy = new ArrayList<Integer>(integers); // Get a fresh copy    
		copy.remove(2); // Remove by index    
		System.out.println("14: " + copy);    
		copy.removeAll(sub); // Only removes exact objects    
		System.out.println("15: " + copy);  
		copy.set(1, new Integer(40)); // Replace an element   
		System.out.println("16: " + copy);   
		copy.addAll(2, sub); // Insert a list in the middle    
		System.out.println("17: " + copy);   
		System.out.println("18: " + integers.isEmpty());    
		integers.clear(); // Remove all elements    
		System.out.println("19: " + integers);   
		System.out.println("20: " + integers.isEmpty());   
		
		}
	} 

