package day29polymorphismexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception02 {

	// Check Exceptionlari'lari ( Compile Time Exception) handle etmek icin 2 yol
	// var ;
	// birincisi "throws" keywordunu kullanmak. bunu kulanirsaniz console da teknik
	// mesajlar gorursunuz.
	// bu yuzden cok tercih edilmez

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream file = new FileInputStream("C:/ogrenci.txt");
	}

}
// ikincis try-catch block kullanmaktir.bunu kullanirsaniz console da teknik
// mesajlar yerine
// kendi yazdiginiz mesajlari gorebilirsiniz bu yuzden try-cacth kullanmak
// tercih edilir.

class ExceptionTryCatch {

	public static void main(String[] args) {

		try {
			FileInputStream file = new FileInputStream("C:/ogrenci.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Dosyanin path'i yanlis veya dosya silinmis olabilir");
		}
	}
}