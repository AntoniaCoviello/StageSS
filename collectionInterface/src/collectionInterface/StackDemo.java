package collectionInterface;

import java.util.List;
import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack sl=new Stack();
		
		int c=1;
		sl.push(0);
		while(c<10) {
			
			sl.push(c);
			c++;
			System.out.println("Stack is "+ sl.toString());
			sl.pop();
			System.out.println("Stack is "+ sl.toString());
		}
	}
}
