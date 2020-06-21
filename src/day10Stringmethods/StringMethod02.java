package day10Stringmethods;

public class StringMethod02 {

	public static void main(String[] args) {
		// lastIndexOf() methodu aradiginiz characterin String icindeki son gorunumunun indexini return eder.
		
		// lastIndexOf() methodu 1. versiyonu
		String str1 = "Sivrihisar";
		System.out.println(str1.lastIndexOf('i')); // Ekrana 6 yazdirir. Cunku 'i' characterin String icinde 
												   // son gorunumun indexi 6 dir
		System.out.println(str1.lastIndexOf('r')); // Ekrana 9 yazdirir
		
		
		// lastIndexOf() 2. versiyonu 
		System.out.println(str1.lastIndexOf('i',5)); // Ekrana 4 yazdirir ilk 5 characterin icerisnde son gorunumun indexini
													 // return eder. 
		
		
		//lastIndexOF() 3.versiyonu
		String str2="rivrihisari";
		System.out.println(str2.lastIndexOf("ri")); //
		
		
		

	}

}
