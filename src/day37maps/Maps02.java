package day37maps;

import java.util.Hashtable;

public class Maps02 {

	public static void main(String[] args) {
		/*HashTable: HashMap ile hemen hemen aynidir
		 * 			 Farklari:
		 * 			1) HashTable Key ve Value'larda null'a musaade etmez.
		 * 			2) HashTable thread safe'dir.
		 * 			3) Console a yazdirildiginda HashMap gibi rastgele siralamada yazdirilir
		 * 			4) HashTable daha yavastir
		 * 			
		 */
		
		Hashtable<String, String> hTable = new Hashtable<>();
		hTable.put("Dil", "Kalp");
		hTable.put("Gonul", "Kalp");
		hTable.put("Dil", "Tad alma organi");
		hTable.put("ALi",""); // null olmadigindan problem yok 
		//====>>>> hTable.put(null, "agizlik"); // Run time error verir
		//====>>>> hTable.put("Kanaat", null); // Run time error verir
		// Ayni key degerini tekrar kullanirsaniz son value yu kabul eder
		
		System.out.println(hTable);
		
		//HashMap de kullandigimiz methodlarin tamami Hashtable da da kullanilabilir
		
		
		
		
		
		
		
	}
}
