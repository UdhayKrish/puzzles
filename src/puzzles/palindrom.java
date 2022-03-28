package puzzles;

public class palindrom {

	public static void main(String[] args) {
		
		int n =121,r,s=0;
		int t=n;
		while(n>0) {
			r=n%10;
			n=n/10;
			s=s*10+r;
			
		}
		if(t==s) {
			System.out.println("The given number is polidrom");
		}
		else {
			System.out.println("not a polindrum");
		}
	}

}
