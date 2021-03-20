package oops.Practice;

public class Cuboid extends Shape {
	
	private int width;
	private int height;

	public Cuboid(int x , int y) {
		this(x,y,0,0); // Calls 2nd Constructor
	}
	
	
	//2nd Constructor
	public Cuboid(int x, int y,int width,int height) {
		super(x, y);
		this.width=width;
		this.height=height;
		
	}

	
}
