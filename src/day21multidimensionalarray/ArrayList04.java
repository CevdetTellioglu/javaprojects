package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {
		// ["A" ,"C", "B", "C"] list'ini olsuturun

		List<String> list01 = new ArrayList<>();

		list01.add("A");
		list01.add("C");
		list01.add("B");
		list01.add("C");
		System.out.println(list01);
		// list'de eleman olarak B var mi ?
		
		System.out.println(list01.contains("B"));
	
		
		// list'de eleman olarak Z var mi >
		
		System.out.println(list01.contains("Z"));
		
		// list'deki elemanlari alfabetik siraya koyunuz
		// Collections ==> Bir araya getirilmis parcalar.
		// Bir list'teki elemanlari alfabetik siraya (Natural Order) dizmek icin 
		// Collections.sort() methodu kullanilir.
		// Arguments list adi yazilir.
		
 		Collections.sort(list01);
		System.out.println(list01);//  [A, B, C, C]

	}

}
