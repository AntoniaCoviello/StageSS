package varArgsDemo;

public class VarArgsDemo {

	public static void main(String[] args) {
		// Write a method that takes a vararg String array. 
		//Verify that you can pass either a comma-separated list of Strings or
		//a String[] into this method.  
		vararg("a","b");
		String[] strings= {"c","d","e"};
		vararg(strings);
	}
	
	public static void vararg(String...strings ) {
		for (String s: strings) {
			System.out.println(s+" ");
		}
	}
}
