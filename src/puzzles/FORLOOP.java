package puzzles;

public class FORLOOP {

	public static void main(String[] args) {
		
		int Arry[][]= {{1,2,3},{4,5,6},{7,8,9}};
		 
		for(int i=0; i<Arry.length; i++) {
			
	if(i%2==0) {
		
		for(int j=0; j<Arry.length; j++) {
			System.out.print(Arry[i][j]+" ");
		}
		System.out.println();
	}
	else {
		for(int j=Arry.length-1; j>=0; j--) {
			System.out.print(Arry[i][j]+ " ");
			
		}
		System.out.println();
	}
			
		}		
		}

	}


