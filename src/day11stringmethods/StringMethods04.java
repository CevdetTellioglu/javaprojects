package day11stringmethods;

public class StringMethods04 {

	public static void main(String[] args) {
		//  valueOf() methodu rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
		//Stringlerle matematiksel islemler yapabilmemizi saglar
		
		
		//valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde 
		//olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.
		
		String paraErkek="1900";
		String paraKadin="2000";
		// Bu ailenin toplam gelirini bulunuz.
		
		System.out.println(paraErkek + paraKadin);
		System.out.println(Integer.valueOf(paraErkek)+Integer.valueOf(paraKadin));
		
		int maasErkek = 1900;
		int maasKadin = 2000;
		
		
		// maasErkek ve maasKadin sayilarini Stringe donusturun ve concatenation yao
		
		System.out.println(maasErkek +maasKadin);
		System.out.println(String.valueOf(maasErkek)+String.valueOf(maasKadin));
		
		

	}
	
}
