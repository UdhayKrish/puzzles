package puzzles;

public class Day3puzzle {

	public static void main(String[] args) {
	  String str = "welcome to talenton";

	  String [] array=str.split(" ");
	  String print="";
	  
	  for(int i=0; i<array.length;i++) {
		  
                 for(int j=array[i].length()-1; j>=0; j--) {
                	 
    	  print=print+array[i].charAt(j)+ " ";
    	  
    	  
      }
	  print=print+" ";
	  System.out.println(array[i]);
	}
	  System.out.println("ansewr"+print);
}
}