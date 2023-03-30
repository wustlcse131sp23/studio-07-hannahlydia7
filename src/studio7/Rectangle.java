package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle(double L, double W){
		length=L;
		width=W;
		
	}
	
	public double area() {
		return length * width;
	}
	
	public double perimeter() {
		return 2*length + 2*width;
	}
	
	public boolean isSmaller(Rectangle a) {
		if (this.area()<a.area())
		{return true;}
		else
			{return false;}
	}
	
	public boolean isSquare() {
		if (length==width)
		{return true;}
		else
			{return false;}
	}
	
	public void draw() {
		StdDraw.rectangle(0.5, 0.5, length/2, width/2);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
