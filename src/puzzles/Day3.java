package puzzles;

public class Day3 {

	public static void main(String[] args) {
	 String str= "Define the word";
	 String[] arry=str.split(" ");
     String print=" ";
     
     
	 for(int i=0; i<arry.length; i++) {	 
		 
	 for(int j=arry[i].length()-1;  j>=0;  j--)	{ 
		 print=print+arry[i].charAt(j);	 
	 }
	 System.out.println(arry[i]);
//	 print=print+"";
	}
	 print=print+"";
       System.out.println("answer"+print);
       
       
  
    
    
    
    
    
}
}