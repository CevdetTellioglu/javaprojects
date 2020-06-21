package day11stringmethods;

public class StringMethods03 {

	public static void main(String[] args) {
		// concat() method iki string i birlestirmenin diger yontemidir.
		// concatenation yapmanin diger yontemidir,
		
		String str1="Ali";
		String str2="Veli";
		System.out.println(str1+str2);
		System.out.println(str1.concat(str2));
		
		System.out.println(str1.concat(str2).concat(str1).concat(str2));
		System.out.println(str1.concat(" === ").concat(str2));

		
		//replace() 
		//var olan bir character butun gorunumlerinin yerine baska character yazmaya yarar.
		// ornek ata ==> ana 
		// replace() 1.versiyon
		System.out.println("  replace() 1. versiyon");
		String str3="ata";
		System.out.println(str3.replace("t","n"));
		String stra=str3.replace("t","n");
		System.out.println(stra.replace("a", "u"));
		
		System.out.println(str3.replace("x", "y")); // x olmadigi icin herhangi bir degisim yapmaz
		System.out.println(str3.replace("", "/"));
		System.out.println(str3.replace("t", ""));
		System.out.println(str3.replace("", " "));
		
		System.out.println(str3.replace("at", "Mustaf"));
		System.out.println(str3.replace("at", "y"));
		
		// replaceFirst() methodu degistirmek istedigimiz karakterin sadece ilk gorunumunun degistirir.
		System.out.println("  replaceFirst() methodu");
		String str4="karakartal";
		System.out.println(str4.replaceFirst("k", "K"));
		System.out.println(str4.replaceFirst("a", "e"));
		System.out.println(str4.replaceFirst("ka", "A"));
		System.out.println(str4.replaceFirst("kar", ""));
		System.out.println(str4.replaceFirst("kara", "A"));
		System.out.println(str4.replaceFirst("karakartal", "fenerbahce"));
		
		//Soru
		String text= "Ali okula gitti. Ali otobuse bindi. Ali eve geldi, Ali yemek yedi. Ali uyudu.Ali Alican ile oynadı.";
		
		System.out.println(text.replace("Ali","Veli"));
		
		// replaceAll() ve replace() methodlari tamamiyla ayni seyi yapar. replace() methodunda isterseniz
		// tek harfli karakter icin tek tirnak kullanabilirsiniz. fakat replaceAll() methodunda tek tirnak yapamazsiniz.
		
	}

}
