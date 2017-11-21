package mapDemo;

import java.util.Comparator;

public class CognomeComparator implements Comparator<Persona>{
	  public int compare(Persona p1, Persona p2){
		    return p1.getCognome().compareTo(p2.getCognome());
		  }   

}
