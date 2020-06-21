package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {

	public static void main(String[] args) {
		// [Ali, Can, Ayse, Ali] olusturun 
		List<String> list01=new ArrayList<>();
		
		list01.add("Ali");
		list01.add("Can");
		list01.add("Ayse");
		list01.add("Ali");
		System.out.println(list01);
		
	
		list01.remove("Ali");
		System.out.println(list01);// birden fazla eleman varsa ilkini siler
		
		
		
		list01.remove("cevdet"); 
		System.out.println(list01);
	//cevdet yok o yuzden silmiyor fakar hata da vermiyor.
	//hiç birsey yapmıyor
	//sayıyla yapınca exeption verir. olmayan index i kullanmak 
	//her zaman exeption veirr
	//Remove methodun içine sayı yazarsak onu sayı olarak dusunur ama sayı dısında birsey yazarsam onu index olarak dusunmez.
		
		System.out.println(list01.remove("Ali")); //true
		System.out.println(list01.remove("Kemal"));//false
		
		System.out.println(list01.remove(0));// ilk elemani sildim iste bu sildigim eleman
		
		// "Ayse" elemanini "Guzel Ayse" yapalim. set() methodu kullanilir.
		System.out.println(list01);
		System.out.println(list01.set(0, "Aysegul"));//degistirileni verir		
		list01.set(0, "Aysegul");
		System.out.println(list01);// degiseni verir
		
		// List'e "Kenan" ve "Zeynep" ekleyin
		
		list01.add("Kenan");
		list01.add("Zeynep");
		System.out.println(list01);
		
		list01.clear();
		list01.isEmpty();
		System.out.println(list01);
		
		
	}

}
