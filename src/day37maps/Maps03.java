package day37maps;

import java.time.LocalTime;
import java.util.TreeMap;

public class Maps03 {

	public static void main(String[] args) {
		/*
		 * TreeMap: 1) TreeMap key'lerde null kullanmaya musaade etmez 
		 * 			ama  value'larda istedigimiz kadar  null kullanmaya musaade eder
		 * 			2) TreeMap'leri Console'a yazdirmak istediginizde 
		 * 				key'ler natural order'a gore siralanir
		 * 			3) TreeMap en yavastir
		 * 			
		 */
		LocalTime time = LocalTime.now();
		System.out.println(time);
		TreeMap<String, Integer> tMap = new TreeMap<>();
		tMap.put("Kanaat", null);
		tMap.put("Bezelye", 7);
		tMap.put("Elma", 10);
		tMap.put("Armut", 8);
		System.out.println(tMap);
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);
	}

}
