package puzzles;

public class duplicatenumbers {

	public static void main(String[] args) {
		String str="1212345123";
		String rev="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(rev.indexOf(ch)==-1) {
				rev=rev+ch;
				
			}
		}
         System.out.println("After sorting :"+rev);
	}

}
