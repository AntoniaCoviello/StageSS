package mapDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test1 {
	public static void main(String[] args){
		  List<Persona> persone = new ArrayList<Persona>();
		  
		  //popoliamo la nostra lista
		  persone.add(new Persona(27, "marco", "bianco"));
		  persone.add(new Persona(80, "luca", "arancio"));
		  persone.add(new Persona(75, "giovanni", "rossi"));
		  persone.add(new Persona(29, "mario", "bianchi"));
		  
		  System.out.println("– LISTA NON ORDINATA –");
		  print(persone);
		  
		  /**
		  * ordiniamo la lista utilizzando il metodo sort della classe Collections
		  * tale metodo riceve una List di oggetti che devono implementare il metodo
		  * Comparable. Nel nostro caso la lista viene ordinata per età
		  */
		  System.out.println("– ORDINE PER ETA’ –");
		  Collections.sort(persone);
		  print(persone);
		  
		  /**
		  * ordiniamo la lista utilizzando il metodo sort della classe Collections
		  * tale metodo riceve una List di oggetti ed un istanza di un oggetto Comparator
		  * Nel nostro caso la lista viene ordinata per cognome
		  */
		  System.out.println("– ORDINE PER COGNOMI –");
		  Collections.sort(persone, new CognomeComparator());
		  print(persone);
		}

		//tale metodo permette di stampare la lista
		private static void print(Collection<Persona> c){
		  Iterator<Persona> it = c.iterator();

		  while (it.hasNext()){
		    Persona p = it.next();
		    System.out.println(p.getNome() + " " + p.getCognome() + " " + p.getEta());
		  }
		}
}
