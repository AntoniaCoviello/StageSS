package exercise1;

import java.util.ArrayList;

public class Gerbil {
	
	int gerbilNumber;
	
	
	Gerbil(int i){
		gerbilNumber=i;
	}
	 
	public void hop() {
		System.out.println("the number is" + gerbilNumber);
		System.out.println("It's hopping");
	}
	
	public static void main(String[] args) {
		ArrayList<Gerbil> gerbils=new ArrayList<Gerbil>();
		
		gerbils.add(new Gerbil(0));
		gerbils.add(new Gerbil(1));
		gerbils.add(new Gerbil(2));
		gerbils.add(new Gerbil(3));
		gerbils.add(new Gerbil(4));
		
		for(int i=0;i<gerbils.size();i++) {
			gerbils.get(i).hop();
			
		}
	}
	
}
