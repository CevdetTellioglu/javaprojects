package day29polymorphismexception;

public class Exception03 {

	public static void main(String[] args) {
		// Bolme islemi yapan bir program yazalim
		
		int num1 = 12;
		int num2 = 0;
		try {
		System.out.println(num1/num2);
	}catch(ArithmeticException e) {
		System.out.println("Sifir ile bolme yapilmaz");
	}catch(Exception e) {
		System.out.println("her exception olabilir");
	}
		//ArithmeticException Run Time EXception dir matematik kurallarina
		//uygun olmayan bir islem yapildiginda 
		// bu exception alinir
		
		// try dan sonra birden fazla cacth kullanilabilir. ama usttei cacth alttaki cacth in  child i olmalidir
		// cacth leri Specific'den Genel'e dogru dizmelisiniz
}
}