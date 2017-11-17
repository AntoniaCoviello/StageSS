package arrayDemo;

import java.util.Arrays;

public class arrayDemo {

	public static void main(String[] args) {
		
	/*
		//Create an array of String objects and assign a String to each element. 
		//Print the array by using a for loop. 
		String [] strings= {"Ciao","Hello", "Bye"};
			for(String s: strings) {
				System.out.println(s + " ");
			}
	*/
	
		String s="Ciao";
		myclass[] list=new myclass[2];
		list[0]=new myclass(s);
	}

}
	class myclass{
		
		myclass(String s){
			
			System.out.println(s+" ");
		}
	}