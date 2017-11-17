package cicloFor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CicloFor {

	public static void main(String[] args) {
		
		/*
		// Write a program that prints values from 1 to 100
		for(int i=0;i<100;i++)
			System.out.println((i+1));
	
	
	
		//Write a program that generates 25 random int values. 
		//For each value, use an if-else statement to classify it 
		//as greater than, less than, or equal to a second randomly 
		//	generated value.
		int tmp=0;
		int x;
		for (int i=0;i<25;i++) {
			x=(int) (Math.random()*10);
			if(x<tmp) {
				System.out.println("Il numero "+x+" generato è minore di"+ tmp);
				tmp=x;
			}else if(x>=tmp){
				System.out.println("Il numero "+x+" generato è maggiore o uguale di"+ tmp);
				tmp=x;
			}
		}
		
		
		// Modify Exercise 2 so that your code is surrounded 
		//by an “infinite” while loop. It will then run until you 
		//interrupt it from the keyboard.	
		int tmp=0;
		int x;
		boolean y=true;
		while(y){
			x=(int) (Math.random()*10);
			if(x<tmp) {
				System.out.println("Il numero "+x+" generato è minore di"+ tmp);
				tmp=x;
			}else if(x>=tmp){
				System.out.println("Il numero "+x+" generato è maggiore o uguale di"+ tmp);
				tmp=x;
			}
		}
		
		
		// Write a program that uses two nested for loops 
		//and the modulus operator (%) to detect and print 
		//prime numbers (integral numbers that are not evenly 
		//divisible by any other numbers except for themselves and 1). 
		int temp=0;
		boolean y=false;
		for(int i=2;i<100;i++) {
			for(int j=2;j<i/2;j++) {
				temp = (i%j);
				if(temp==0) 
					y=true;	
			}
			if(!y) {
				System.out.println("Il numero "+i+" è un numero primo");
			}
			y=false;
		}
		
		
		// Modify Exercise 1 so that the program
		//exits by using the break keyword at value 99. 
		//Try using return instead.  
		for(int i=0;i<100;i++) {
			if(i==99)
				break;
			System.out.println((i+1));
		}
		
		// A Fibonacci sequence 
		System.out.println("1");//first Fibonacci number
		System.out.println("1"); //second Fibonacci number
		int f1=1;
		int f2=1;
		int f3=f1+f2;
		int x=100;
		do{
			System.out.println(f3);
			f1=f2;
			f2=f3;
			f3=f1+f2;
		}while((f3<x));
			
		*/
		



		 //A vampire number has an even number of digits and is formed by multiplying 
		//a pair of numbers containing half the number of digits of the result. 
		//The digits are taken from the original number in any order.
		//Pairs of trailing zeroes are not allowed. Examples: 1260 = 21 * 60 
		//use the method sortVampire 

		        for (int x = 10; x < 100; x++) {
		            String sx = String.valueOf(x); //convert int in String
		            for (int y = x; y < 100; y++) {
		                int v = x * y;
		                String sy = String.valueOf(y);
		                String sv = String.valueOf(v);
		                
		                if (sortVampire(sx + sy).equals(sortVampire(sv))) {
		                    System.out.printf("%d * %d = %d%n", x, y, v);
		                }
		            }
		        }
		    



	}
		//method sortVampire that add in a list of Character(vc), the chars of string
		//that we give in input and finally sort vc in ascending order  
    private static List<Character> sortVampire(String v) {
        List<Character> vc = new ArrayList<Character>();
        for (int j = 0; j < v.length(); j++) {
            vc.add(v.charAt(j));
        }
        Collections.sort(vc);
        return vc;
    }

}

