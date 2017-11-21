package collectionDemo;

//Adding groups of elements to Collection objects. 
import java.util.*; 

class Snow {} 
class Powder extends Snow {} 
class Light extends Powder {} 
class Heavy extends Powder {} 
class Crusty extends Snow {} 
class Slush extends Snow {} 

public class AddListDemo {
	/*

	public static void main(String[] args) {   
		Collection<Integer> collection =new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));    
		Integer[] moreInts = { 6, 7, 8, 9, 10 };    
		collection.addAll(Arrays.asList(moreInts));    
  
		Collections.addAll(collection, 11, 12, 13, 14, 15);   

		Collections.addAll(collection, moreInts); 

		List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);   

		list.set(1, 99);  


		} 
		*/
	
	// Arrays.asList() makes its best guess about type. import java.util.*; 
	 

	 
 
		public static void main(String[] args) {   
			List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
			
		
	
	 
	    // Won’t compile:   
		// List<Snow> snow2 = Arrays.asList( new Light(), new Heavy());     
		// Compiler says:  
		// found   : java.util.List<Powder>     
		// required: java.util.List<Snow> 
	 
	    // Collections.addAll() doesn’t get confused:    
		List<Snow> snow3 = new ArrayList<Snow>();  
		Collections.addAll(snow3, new Light(), new Heavy()); 
	
		// Give a hint using an    
		// explicit type argument specification:  
		List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());  
		} 
		

}
