package exercise4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Film {
	
	static Collection fill(Collection<Character> coll) {
		 coll.add(new Character("1.Flavio", "Bianchi"));
		 coll.add(new Character("2.Mario", "Rossi"));
		 coll.add(new Character("3.Francesco", "Rosso"));
		 coll.add(new Character("4.Dario", "Nero"));
		 coll.add(new Character("5.Paolo", "Neri"));
		return coll;
	}

	static void print(Collection<Character> coll) {
		for (Character c:coll) {
			System.out.println(c.name+" "+c.surname);
		}
	}
	public static void main(String[] args) {
		/*

		 
		 Iterator<Character> it=list.iterator();
		 int d=1;
		 while (it.hasNext()&&(d<=5)) {
			 Character c =it.next();
			 System.out.println(c.name+" "+c.surname);
			 if(!it.hasNext()) {
				 d++;
				 it=list.iterator();
			 }
		 }*/
		System.out.println("+++++TreeSet+++++");
		print(fill(new TreeSet<Character>()));		
		System.out.println("+++++ArrayList+++++");
		print(fill(new ArrayList<Character>()));
		System.out.println("+++++LinkedList+++++");
		print(fill(new LinkedList<Character>()));
		System.out.println("+++++HashSet+++++");
		print(fill(new HashSet<Character>()));
		System.out.println("+++++LinkedHashSet+++++");
		print(fill(new LinkedHashSet<Character>()));

	}

}
