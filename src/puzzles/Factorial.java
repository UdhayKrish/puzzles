package puzzles;

public class Factorial {

	public static void main(String[] args) {
		int n=7,fact=1;
		for(int i=1; i<=7;i++) {
			fact=fact*i;
		}
		System.out.println("the factorial num is:" +fact);

	}

}
