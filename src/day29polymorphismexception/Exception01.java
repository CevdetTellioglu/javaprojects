package day29polymorphismexception;

public class Exception01 {

	public static void main(String[] args) {
		// Exception: Istisnai hata
		// Temelde kac tur exception var 
		// temelde 2 tur exception var 
		// 1 compile time exception ; 1) Compile time exception ( Checked )
		// 							  2) Run time exception
		//Compile time exception a ornek verebilir misniz
		// Tabii ki; 1) FileNotFoundException ==> Dosya bulunamadigi zaman ortaya cikar 
		// 			 2) IOException(InputOutput Exception) Input veya Output yapilirken olusan problemlerde ortaya cikar
		//  Not: FileNotFoundException,  IOException in  child'idir?
		//  NOt: Compile Time Exception'lar mutlaka Handle edilmelidir. (halledilmelidir)
		
		
		// Checked Exception'lar 2 turlu handle edilir:
		// 			1) Method isminden sora "throws" keywrod kullanilir
		// 			2) Try-catch block kullanilir try-cqcth block kullanmak daha iyidir ; cunku readible dir
		
		

	}

}
