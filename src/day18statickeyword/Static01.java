package day18statickeyword;

public class Static01 {
	static int en = 12;
	static int boy = 10;
	static int alan;
	static double pi;
	// Eger bir variable'in degerini olustururken hesap yapmamiz gerekirse 
	//"Static block" olusturmak iyidir. yani; "int alan = en*boy" demek yerine 
	//"Static block" olusturup bu islemleri static block un icine yazmak daha iyidir.
	//"static block" variable lara deger atamak icin de kullanilabilir.
	
	//"Static Block" class'in icinde butun methodlarin(main dahil) ve constructionlarin 
	// disinda olusturulmalidir.
	
	//static block class olusturdugumuz zaman olusturulur.
	
	//static block tum methodlardan (main method dahil) ve constructor lardan once calistirilir.
	
	//birden fazla static block varsa ustteki once calisir.
	
	//Static block varlik amaci deger atamaktir.
	
	static {
		alan = en * boy;
	}
	
	static {
		pi=3.14;
	}

	public static void main(String[] args) {
		System.out.println(pi);
	}


	
	//Static Class olusturulabilir ama alt classlar(inner class) static class olabilir. 
	// Ust Classlar(outer class) Static olamazlar

	static class AltClass {
		
	}
}