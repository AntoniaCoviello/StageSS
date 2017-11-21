package collectionInterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class SetDemo {
	public static void main(String[] args) {
		int count[] = {34, 22,10,60,30,22};
	    Set<Integer> set = new HashSet<Integer>();
	  
	       for(int i = 0; i < 5; i++) {
	          set.add(count[i]);
	       }
	       System.out.println(set);
	       	
	       //**********TreeSet************************
	       TreeSet sortedSet = new TreeSet<Integer>(set);
	       System.out.println("The sorted list is:");
	       System.out.println(sortedSet);
	
	       System.out.println("The First element of the set is: "+ (Integer)sortedSet.first());
	       System.out.println("The last element of the set is: "+ (Integer)sortedSet.last());
	   
	       //**************SortedSet***********************
	       SortedSet set1 = new TreeSet(); 

	       // Add elements to the set
	       set1.add("b");
	       set1.add("c");
	       set1.add("a");

	       // Iterating over the elements in the set
	       Iterator it = set1.iterator();

	       while (it.hasNext()) {
	          // Get element
	          Object element = it.next();
	          System.out.println("SortedSet");
	          System.out.println(element.toString());
	       }
	}
}