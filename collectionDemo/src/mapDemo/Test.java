package mapDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		
//***************************************************************************	
//***********   ArrayList *******************
//		
//		
//		ArrayList<Persona> lista = new ArrayList<Persona>(0);
//		lista.add(new Persona(27, "marco", "bianco"));
//		lista.add(new Persona(80, "luca", "arancio"));
//		lista.add(new Persona(75, "giovanni", "rossi"));
//		lista.add(new Persona(29, "mario", "bianchi"));
//
//		
//		Iterator<Persona> it = lista.iterator();
//		while (it.hasNext()) {
//		  Persona p = it.next();
//		  System.out.println(p);
//		}
//
//		for (int i=0; i<lista.size(); i++){
//		  Persona p = lista.get(i);
//		  System.out.println(p);
//	    }
//***************************************************************************		
		
		
//****************************************************************************
//************HashSet		
//		HashSet<Persona> hash = new HashSet<Persona>(0);
//		hash.add(new Persona(27, "marco", "bianco"));
//		hash.add(new Persona(80, "luca", "arancio"));
//		hash.add(new Persona(75, "giovanni", "rossi"));
//		hash.add(new Persona(29, "mario", "bianchi"));
//
//
//		Iterator<Persona> it = hash.iterator();
//		while (it.hasNext()){
//		  Persona p = it.next();
//		  System.out.println(p);
//		}
//****************************************************************************
		HashMap<String, Persona> hash = new HashMap<String, Persona>(0);
		hash.put("marco", new Persona(27, "marco", "bianco"));
		hash.put("luca", new Persona(80, "luca", "arancio"));
		hash.put("giovanni", new Persona(75, "giovanni", "rossi"));
		hash.put("mario", new Persona(29, "mario", "bianchi"));

		Collection<Persona> collection = hash.values();
		Iterator<Persona> it = collection.iterator();
		while (it.hasNext()){
		  Persona p = it.next();
		  System.out.println(p);
		}

		System.out.println(hash.get("marco"));
		}

	}


