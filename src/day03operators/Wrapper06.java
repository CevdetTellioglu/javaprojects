package day03operators;

public class Wrapper06 {

	public static void main(String[] args) {
		// Niçin hata veriyor?
		//Bu hatayı iki farklı yolla çözünüz.
		 
		/*public static void main(String[] args) {
		 * 
		 * float num1  = 3.23 ;
		 * double num2 = 3.23 ;
		 * 
		 */

		float num1  = 3.23f ;
		double num2 = (double)num1;
		
		System.out.println(num2);
		
	}

}
