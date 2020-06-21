package day37maps;

import java.time.LocalTime;
import java.util.HashMap;

public class Maps01 {

	public static void main(String[] args) {
		// Map bir interface dir. Map interface'inin 3 Tane class i vardir
		// 1) HashMap: HashMap key-value yapisini kullanir. key ve value
		/*
		 * key ve value programci tarafindan yazilir Key ve value'da null degeri
		 * kullanilabilir.Key'de birden fazla null degeri kullanilirsa Java son
		 * kullanilan null'i kabul eder. Value de 1 den fazla null degeri kullanilabilir
		 * Not: HashMap console a yazdirildiginda hem key degerleri hem de value
		 * degerleri aralarina = sembolu konularak yazdirilir HashMap ler ekrana
		 * yazdirirken rastgele siralama yapar HashMap mapler arasinda en hizlisidir
		 * HashMap ler "thread safe" degildir
		 * 	// bir application buna müsaitse buna “thread safe” deniyor, yani aynı anda başka şeyler yapabiliyor.
		 */
		LocalTime time = LocalTime.now();
		System.out.println(time);
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(33, "Ali");
		hashMap.put(132, "Veli");
		hashMap.put(223, "Mine");
		hashMap.put(4, "Kemal");
		System.out.println(hashMap);// {33=Ali, 132=Veli, 4=Kemal, 223=Mine}

		System.out.println(hashMap.remove(4));// Kemal
		System.out.println(hashMap);// {33=Ali, 132=Veli, 223=Mine}

		System.out.println(hashMap.remove(132, "Veli"));// true
		System.out.println(hashMap.remove(223, "Ayse"));// false
		System.out.println(hashMap);// {33=Ali, 223=Mine}
		
		System.out.println(hashMap.get(223));//Mine
		System.out.println(hashMap.get(100));//null
		
		System.out.println(hashMap.keySet()); // [33, 223]    sadece keyleri verir.
		System.out.println(hashMap.values()); // [Ali, Mine]  sadece value leri verir.
		
		System.out.println(hashMap.size()); //2
		
		System.out.println(hashMap.containsKey(223)); // true
		System.out.println(hashMap.containsKey(4)); // false
		
		System.out.println(hashMap.containsValue("Mine")); // true
		System.out.println(hashMap.containsValue("Cevdet")); // false
		
		hashMap.replace(223, "Cevdet");
		System.out.println(hashMap);
		
		hashMap.clear();
		System.out.println(hashMap); // {}
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);
		
		
		// 2) HashTable
		/*
		 * 
		 */
		// 3) TreeMap
		/*
		 * 
		 */
	}

}
