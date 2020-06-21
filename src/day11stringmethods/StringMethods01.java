package day11stringmethods;

public class StringMethods01 {

	public static void main(String[] args) {
		// starsWith()  methodu bir string'in istenen harfle baslayip baslamadigini 
		// kontrol eder. Istenilen harfle basliyorsa true, baslamiyorsa false return eder.
		
		String str1="Ali Can";
		//starsWith()1. versiyon
		System.out.println(" startsWith() 1. Versiyon ");
		System.out.println(str1.startsWith("A"));
		System.out.println(str1.startsWith("B"));
		System.out.println(str1.startsWith("a"));
		System.out.println(str1.startsWith("Ali"));
		
		//starsWith() 2.versiyon
		System.out.println(" startsWith() 2. Versiyon ");
		System.out.println(str1.startsWith("a", 3));
		System.out.println(str1.startsWith("a", 5));
		System.out.println(str1.startsWith("Can",4));
		
		//endsWith() methodu bir string'in istenen harfle bitip bitmedigini
		// kontrol eder. Istenilen harfle bitiyorsa true, bitmiyorsa false return eder.
		
		System.out.println(" endsWith() methodu ");
		String str2="Ayse Canan";
		System.out.println(str2.endsWith("n"));
		System.out.println(str2.endsWith("Canan"));
		System.out.println(str2.endsWith("CANAN"));
		System.out.println(str2.endsWith(""));
		
		String str3="Ali ";
		System.out.println(str3.endsWith(" "));
		System.out.println(str3.endsWith(""));
		System.out.println(str3.startsWith(""));
		
		
		
	}

}
