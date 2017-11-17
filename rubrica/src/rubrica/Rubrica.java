package rubrica;

import java.util.ArrayList;
import java.util.Scanner;

public class Rubrica {

	public static void main(String[] args) {
		
		boolean control=false;
		
		Persona persona1=new Persona("Francesco","Via Roma", 12345);
		Persona persona2=new Persona("Antonia","Via Diaz", 4537);
		Persona persona3=new Persona("Pippo","Corso Europa", 19283);
		Persona persona4=new Persona("Baudo","Via Italia", 234516);
		Persona persona5=new Persona("Mario","Via Saporito", 3725);
		
		ArrayList<Persona> persone=new ArrayList<Persona>();
		persone.add(persona1);
		persone.add(persona2);
		persone.add(persona3);
		persone.add(persona4);
		persone.add(persona5);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("inserisci nome utente da cercare");
		String nome=sc.nextLine();
		
		for(Persona p:persone) {
			if (p.getNome().equalsIgnoreCase(nome)) {
				System.out.println("Nome: "+ p.getNome());
				System.out.println("Indirizzo: "+ p.getIndirizzo());
				System.out.println("Telefono: "+ p.getTelefono());
				control=true;
			}
		}
		if (!control) {
			System.out.println("Il nome inserito non è presente in rubrica");
		}
		
	}

}
