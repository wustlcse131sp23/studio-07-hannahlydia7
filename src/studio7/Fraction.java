package studio7;

public class Fraction {
	
	private int numer;
	private int denom;
	
	public Fraction(int n, int d) {

		numer=n;
		denom=d;
	}
	
	public Fraction sum(Fraction a) {
		int numerator = numer*a.denom + a.numer*denom;
		int denominator = denom*a.denom;
		Fraction f = new Fraction(numerator, denominator);
		return f;
	}
	
	public Fraction multiply(Fraction a) {
		int numerator = numer*a.numer;
		int denominator = denom*a.denom;
		Fraction f = new Fraction(numerator, denominator);
		return f;
	} 
	
	public Fraction reciprocal() {
		Fraction f = new Fraction(denom, numer);
		return f;
	}
	
	public Fraction simplify() {
		Fraction f= new Fraction(numer, denom);
		if (numer<=denom)
			{for (int i=numer; i>0; i--)
				{if (numer%i==0 && denom%i==0)
					{f = new Fraction(numer/i, denom/i);
					}
				}
			}
		else 
		{for (int i=denom; i>0; i--)
			{if (numer%i==0 && denom%i==0)
				{f = new Fraction(numer/i, denom/i);
				}
			}
		}
	return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
