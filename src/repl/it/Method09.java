package repl.it;

public class Method09 {

	public static void main(String[] args) {

		System.out.println(SayininTersi(27));
	  }
	  
	  
	public static boolean SayininTersi(int num) {
	  
	  //write your code here
	  if(num/10 > num%10) return true;
	  else return false;


	}
}
