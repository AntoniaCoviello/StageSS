package constructorDemo;

public class DogMain {

	public static void main(String[] args) {
		
		Dog dog=new Dog();
		
		dog.bark();
		dog.bark("Il cane ha abbaiato");
		dog.bark("Il cane ha abbaiato", 2);
		dog.bark(2, "Il cane ha abbaiato");
		dog.myDog1();
	}

}
