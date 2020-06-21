package day38interviewhazirlik;

public class PassByValuePassByReference {

	public static void main(String[] args) {
		//bir method'a variable yollandiginda Java o variable'in 
		//kopyasini olusturur ve methoda kopyayi yollar bu yuzden variable'in orjinal degeri
		// method calistiktan sonra da ayni kalir 
		// Buna Pass By Value denir.
		
		
		//Pass by Reference'da ise reference'in kopyasi olsuturulur ve methoda yollanir
		//fakat referenece'in kopyasi kendsi gibi ayni objecti gostredigi icin orjinal 
		// deger degisir 
		
		//Java Pass by value kullanir
		
			int x=12;
			System.out.println(increment(x));//13
			System.out.println(x);//12
		}
		public static int increment(int a) {
			a= a+1;
			return a;
		}
	}


