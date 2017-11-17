package distanza;

import java.util.Scanner;

public class Distanza2Punti {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Inserisci due punti bid");
		int x1=Integer.parseInt(sc.nextLine());
		int y1=Integer.parseInt(sc.nextLine());
		int x2=Integer.parseInt(sc.nextLine());
		int y2=Integer.parseInt(sc.nextLine());
		
		Punto p1=new Punto(x1, y1);
		Punto p2=new Punto(x2,y2);
		
		System.out.println(p1.dist(x2,y2));
		
		System.out.println("Inserisci due punti trid");
		x1=Integer.parseInt(sc.nextLine());
		y1=Integer.parseInt(sc.nextLine());
		int z1=Integer.parseInt(sc.nextLine());
		x2=Integer.parseInt(sc.nextLine());
		y2=Integer.parseInt(sc.nextLine());
		int z2=Integer.parseInt(sc.nextLine());
		
		Punto p1t=new Punto(x1,y1,z1);
		Punto p2t=new Punto(x2,y2,z2);
		
		System.out.println(p1t.dist(x2,y2,z2));
	}

}
