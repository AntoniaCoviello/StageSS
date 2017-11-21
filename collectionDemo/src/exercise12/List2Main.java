//Create and populate a List<Integer>. 
//Create a second List<Integer> of the same size as the first, 
//and use ListIterators to read elements from the first List and 
//insert them into the second in reverse order.

package exercise12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class List2Main {
	public static void main(String[] args) {
	

		List<Integer> ll1 =Arrays.asList(1,2,3) ;
		List<Integer> ll2 =new ArrayList<Integer>(3); 
		
		ListIterator<Integer> lsitr=ll1.listIterator();
		while(lsitr.hasNext())    
			System.out.print(lsitr.next() + "; ");   
		System.out.println("\n");
		while(lsitr.hasPrevious())   
			ll2.add(lsitr.previous().intValue());
		 System.out.print(ll2.toString() + " "); 
			
		}
	
	}


