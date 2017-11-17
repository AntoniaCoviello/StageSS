package constructorDemo;
//Create a class called Dog with an overloaded bark( ) method.
//This method should be overloaded based on various primitive data types, 
//and print different types of barking, howling, etc., 
//depending on which overloaded version is called. 
//Write a main( ) that calls all the different versions
public class Dog {
	

	public void bark() {
		System.out.println("Il cane sta abbaiando");
	}
	
	public void bark(String s) {
		System.out.println(s);
	}
	
	public void bark (String s, int i) {
		System.out.println(s+i+"volte");
		
	}
	
	public void bark (int i, String s) {
		System.out.println(i+"volte"+s);
	}
	
	//Create a class with two methods. Within the first method,
	//call the second method twice: the first time without using this,
	//and the second time using this—just to see it working; 
	//you should not use this form in practice. 
	
	public void myDog(String mydog) {
		mydog=mydog.toLowerCase();
		System.out.println(mydog);
	}
	
	public void myDog1() {
		String x="KELLY";
		myDog(x);
		this.myDog(x);
		
		
	}
}
