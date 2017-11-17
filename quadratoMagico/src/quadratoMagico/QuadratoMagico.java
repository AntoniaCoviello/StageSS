package quadratoMagico;

import java.util.ArrayList;
import java.util.Random;

public class QuadratoMagico {

	static int arrayquadrato [][]= new int[3][3];

	
	
	public static void main(String[] args) {
		

		
		
		if(controlla()) {
			System.out.println("Complimenti hai vinto");
			for (int i=0;i<3;i++) {
				for (int j=0;j<3;j++) {
					System.out.print(arrayquadrato[i][j] +" ");
				}
				System.out.println();
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
	public static boolean controlla() {
		
		
		boolean result=false;
			arrayquadrato= creamatrice();
			for (int i=0;i<3;i++) {
				boolean x=controlsumrow(i);
				if(!x) {
					controlla();
					}
			}
			for (int i=0;i<3;i++) {
				boolean x=controlsumcol(i);
				if(!x) {
					controlla();
					}
			}
			boolean x=controlsumdiagp();
				if(!x) {
					controlla();
					}
			boolean y=controlsumdiags();
				if(!y) {
					controlla();
					}
			
		
		return true;
	}
	
	public  static int[][] creamatrice(){
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				arrayquadrato[i][j]=0;
			}
		}
		int i=1;
		while( i<=9) {
			int j=(int)(Math.random()*3);
			int k=(int)(Math.random()*3);
			if(arrayquadrato[j][k]==0) {
				arrayquadrato[j][k]=i;
				i++;
			}
		}
		
		return arrayquadrato;
	}
	
	public static boolean controlsumrow(int i) {
		int sum=0;
		boolean sumr=false;
		
		
			for(int j=0;j<3;j++) {
				sum += arrayquadrato[i][j];
			}
			if(sum==15) {
				sumr=true;
			}else {
				sumr=false;
				
			}
		
		return sumr;
	}
	
	public static boolean controlsumcol(int j) {
		int sum=0;
		boolean sumc=false;
		
			for(int i=0;i<3;i++) {
				sum += arrayquadrato[i][j];
			}
			if(sum==15) {
				sumc=true;
			}else {
				sumc=false;
			}
		
		return sumc;
	}
	
	public static boolean controlsumdiags() {
		int j;
		int i=0;
		int sum=0;
		boolean sumds=false;
		for (j=2;j>=0;j--) {
			sum += arrayquadrato[i][j];
			i++;
		}
		if(sum==15) {
			sumds=true;
		}else {
			sumds=false;
		}
			
		return sumds;
	}
	
	public static boolean controlsumdiagp() {
		
		boolean sumdp;
		int sum=0;
		for(int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				if(i==j)
					sum += arrayquadrato[i][j];
				
			}
		}
		if(sum==15) {
			sumdp=true;
		}else {
			sumdp=false;
		}
		return sumdp;
	}
}
