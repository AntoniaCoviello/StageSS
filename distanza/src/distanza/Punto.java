package distanza;

public class Punto {

	private int x;
	private int y;
	private int z;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Punto(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}	
	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public  double dist(int x1, int y1) {
		
		int tmp1 = (this.x - x1)*(this.x-x1); 
		int tmp2 = (this.y - y1)*(this.y-y1); 
		return Math.sqrt(tmp1+tmp2);
		
	}
	
	public  double dist(int x1,int y1,int z1) {
		
		int tmp1 = (int) Math.pow((this.x - x1), 2); 
		int tmp2 = (int) Math.pow((this.y - y1), 2); 
		int tmp3 = (int) Math.pow((this.z - z1), 2); 
		return Math.sqrt(tmp1+tmp2+tmp3);
		
	}
}
