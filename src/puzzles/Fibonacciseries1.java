package puzzles;

public class Fibonacciseries1 {

	public static void main(String[] args) {
		int n= 10,  first=0, secound=1;
         
		System.out.println("fibonacci series till" +n+"terms");
		
		for(int i=1; i<=n; ++i) {
		 
			System.out.println(first+ " ,");
			
			int nextTerm =first + secound;
			    first=secound;
			    secound=nextTerm;
			
			
		}
		
		
	}

}
