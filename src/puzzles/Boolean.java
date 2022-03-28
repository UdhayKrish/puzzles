package puzzles;

public class Boolean {

	public static void main(String[] args) {
		boolean fruit1=true;
		boolean fruit2=true;
		boolean fruit3=false;
		
		boolean ans= false;
		if(fruit1) {
			ans=fruit2 ||fruit3;
		}
		else {
			ans=fruit2 && fruit3;
		}
		if(ans) {
			System.out.println("two fruits are true");
		}
		else {
			System.out.println("two fruits are not true");
		}
	}

}
