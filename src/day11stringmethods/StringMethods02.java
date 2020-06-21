package day11stringmethods;

public class StringMethods02 {

	public static void main(String[] args) {
		// substring() methodu bir string in belli bir bolumunu kesip almak icin kullanilir.
		
		String str1="Java calisana kolaydir";
		//substring() 1.versiyon
		System.out.println("   substring() 1.versiyon");
		System.out.println(str1.substring(5)); // 5 index'i gosterir
		System.out.println(str1.substring(8)); // index 8 dahildir.(inclusive)
		System.out.println(str1.substring(22)); // ekranda bir sey gozukmez
		//tSystem.out.println(str1.substring(23)); // index 23 yok ama olmayan biryerden kesmek istiyorum.
												// hatali bir istektir.java 
												/*
												   Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -1
												   at java.lang.String.substring(String.java:1931)
												   at day11stringmethods.StringMethods02.main(StringMethods02.java:14)
												 */
		System.out.println(str1.substring(0));
		//substring() 2.versiyon
				System.out.println("   substring() 1.versiyon");
		System.out.println(str1.substring(5,13)); // ilk index dahil ikinci index haric / birinci inclusive ikinci exclusive
		System.out.println(str1.substring(6,12)); // alisan
		System.out.println(str1.substring(6,6)); // hic birsey yazmaz
		// System.out.println(str1.substring(7,6)); //*Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -1
													//at java.lang.String.substring(String.java:1967)
													//at day11stringmethods.StringMethods02.main(StringMethods02.java:27)
												
		
	}

}
