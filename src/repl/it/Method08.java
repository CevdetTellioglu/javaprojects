package repl.it;



public class Method08 {

	public static void main(String[] args) {
  int arr [] = {1,2,3,4};
		  
		 reverse(arr);
		 
		  
	  }
	  
	  public static int[] reverse(int[] arr) {
		
		// write your code here
		
		int yeni [] = new int [arr.length];
		
		for(int i= arr.length-1;i>=0;i--) {
			
			yeni[i]=arr[arr.length-1-i];
		}
	
		
			return yeni;

	}
	
	}


