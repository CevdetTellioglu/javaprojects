package day25stringbuilder;

public class StringBuilderRv02 {

	public static void main(String []args) {
		// substring() methodu atama yapmadan String i degistirmez
		
		
		StringBuilder str1 = new StringBuilder("animals");
		
		//str1 = str1.substring(3); hata verir.
		//Cunku substring() methodue String Class indan
		//gelir ve bir String retun eder. Halbuki str1 String degil StringBuilder dir.
		//Java da data tipleri uyusmadigindan dolayi atamayi kabul etmez
		// Bu hatadan kurtulmak icin iki yol vardir.
		
		// 1.yol: String class'indan yeni bir String uretip atama yapiniz.
		String str2 = str1.substring(3);
		System.out.println(str2);
		
		//2.yol: str1.substring(3) ifadesini direkt System.out.println() icine yazin
		
		System.out.println(str1.substring(3));
		
		System.out.println(str1.substring(1,4)); // nim
		
		
		// indexOf() methodu belli bir character'in indexini return eder.
		System.out.println(str1.indexOf("m")); // 3
		
		//length() methodu String Class'indan gelir ve String in uzunlugunu return eder.
		System.out.println(str1.length());//7
		
		//charAt() methodu istenen index'teki character i return eder.
		System.out.println(str1.charAt(5)); // index i 5 olan l harfi dir.
		
		//insert() methodu istenen index e istenen karakteri eklemeye yarar.
		// insert() methodu StringBuilder e direkt degistirir.
		
		str1.insert(0, "X"); // Xanimals
		System.out.println(str1);
		
		
		//delet() methodu istenen index araligindaki karakteri siler.
		str1.delete(0,1);
		System.out.println(str1); //animals
		
		//deleteCharAt() istenen index deki characteri siler.
		
		str1.deleteCharAt(str1.length()-1); // son karakteri  sileriz
		System.out.println(str1);
		
		//String i tersten yazdir;
		// reverse() methodu
		
		str1.reverse();
		System.out.println(str1);//lamina
		
		//toString() methodu StringBuilder i String e cevirmek icin kullaniliri
		
		str1.toString();
		System.out.println(str1); // str1 artik StringBUilder degil String dir
	
		//StringBuilder Java'nin 5. versiyonunda olsuturuldu. StringBuffer'lar
				//StringBuilder'larin eski versiyonudur.
				//StringBuilder lar daha hizli calisirlar 
				//Bu yuzden StringBuilder kullanmayi tercih edin. 
				
	}
}
