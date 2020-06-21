package day10Stringmethods;

public class StringMethod01 {

	public static void main(String[] args) {
		// indexOf() method'u Stringin icindeki characterin yerini belirlemek icin kullanilir.
		
		String str1 = "Javva World";
		// indexOf methodunun 1. versiyonu
		str1.indexOf('v');
		System.out.println(str1.indexOf('v')); // ekrana 2 yazdirir. Cunku index sayimi 0 baslar.
		System.out.println(str1.indexOf('W')); // ekrana 6 yazdirir. space Java icin bir character dir
		System.out.println(str1.indexOf('w')); // Java index bulamaz cunku java "case sensitive" dir.
											   // Kucuk w Stringde yok. Java character bulamayinca -1 return eder.
		System.out.println(str1.indexOf('a')); // Ekrana 1 yazdirir. birden fazla kullanilan characterler icin Java
											   // ilk characaterin indexini verir/
		
		// indexOf() methodu 2.  versiyonu
		
		System.out.println(str1.indexOf('a',2)); // Stringdeki 2.a characterinin index ini bulunuz
		System.out.println(str1.indexOf('a',4)); // 4 yazdirir
		System.out.println(str1.indexOf('a',1)); // ekrana 1 yazdirir
		System.out.println(str1.indexOf('a',5)); // ekrana -1 yazdirir.
		
		
		// "Alamanya" Stringindeki ikinci 'a' characterinin indexini bulunuz.
		
		String str2="Alamanya";
		System.out.println(str2.indexOf('a'));// bu birinci a nin indexi ==> 2
		int idx = str2.indexOf('a');
		System.out.println(str2.indexOf('a',idx+1)); // Ekrana 4 yazdirmali 
		
		//indexOf() methodunun 3. versiyonu
		
		String str3 = "Missisippi";
		System.out.println(str3.indexOf("is")); // ilk "is" Stringini bulur ve ilk harfin indexini return eder. Bur ornekte
												// i harfinin indexi olan 1 i return eder.
		
		System.out.println(str3.indexOf("si")); // ekrana 3 yazdirir 
	}

}
