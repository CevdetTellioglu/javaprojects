package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class day21SlaytHm {

	public static void main(String[] args) {
		//1) Elemanları A, C, E, ve F olan bir
		// String ArrayList oluşturup ekrana yazdırınız.
		
		List<String> list01=new ArrayList<>();
		list01.add("A");
		list01.add("C");
		list01.add("E");
		list01.add("F");
		
		System.out.println(list01);

		//2) İndexsiz add() methodunu kullanarak, B’yi ekleyiniz.
		//İndex’li add() methodunu kullanarak, L’yi 1 numaralı index’e ekleyiniz.
		//ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, L, C, E, F, B.
		
		list01.add("B");
		list01.add(1,"L");
		System.out.println(list01);
		
		//3) set() methodu kullanarak, E’yi D yapınız.
		//ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, L, C, D, F, B.
		
		list01.set(3, "D");
		System.out.println(list01);
		
		//4) remove() methodu kullanarak, F’yi siliniz.
		//ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, L, C, D, B.
		
		list01.remove(4);
		System.out.println(list01);
		
		//5) sort() methodu kullanarak, elemanları alfabetik sıraya diziniz
		// ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, B, C, D, L.
		
		Collections.sort(list01);
		System.out.println(list01);
		
		//6) contains() methodu kullanarak, 
		//L’nin list’de var oldugunu ve M’nin list’de var olmadığını doğrulayınız.
		
		System.out.println(list01.contains("L"));
	
		System.out.println(list01.contains("M"));

		
		System.out.println(list01.size());
	
		list01.clear();
		System.out.println(list01);
		
		System.out.println(list01.isEmpty());
	
		
		
		
		

	}

}
