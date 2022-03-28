package puzzles;

public class Ocuurence {

	public static void main(String[] args) {
		String input="aaaabbccaAAd";
		char search='a';
		int count=0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==search)
				count++;
				
		}
		System.out.println("the char '"+search+"'appears " +count+" times.");

	}

}
