package studio7;

public class Die {

	int sides;
	
	public Die(int n) {
		sides=n;
	}
	
	public int rollDie() {
		return (int)Math.random()*sides+1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
