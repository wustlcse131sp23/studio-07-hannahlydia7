package studio7;

public class Complex {

	private double real;
	private double imaginary;
	
	public Complex(double r, double i) {
		real=r;
		imaginary=i;
		
	}
	
	public Complex sum(Complex a) {
		return new Complex((a.real+real), (a.imaginary+imaginary));
	}
	
	public Complex multiply(Complex a) {
		return new Complex((a.real*real - a.imaginary*imaginary), (a.real*imaginary + a.imaginary*real));
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
