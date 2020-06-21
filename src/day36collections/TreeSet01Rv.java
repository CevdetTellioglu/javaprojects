package day36collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01Rv {

	public static void main(String[] args) {
		// TreeSet : 1) HashSet ile hemen hemen aynidir. Dublication a musaade etmez 
		//				key-value yapisi kullanir
		//			 2) TreeSet elemanlarini natural order a gore dizer.
		//				HashSet ise, rastgele elemanlari dizer
		//			 3) HashSet ile farki ; HashSet daha hizlidir
		//			 4) Natural ORder a bir bir set lazim oldugunda HashSet olusturulur,
		//				elemanlar eklenir , sonra bu HashSet TreeSet e donusturulur boylelikle TreeSet in hiz 
		//				problemi halledilir. Direkt TreeSet olusturma genellikle kullanilmaz
		
		TreeSet<String> tSet = new TreeSet<>();
		tSet.add("ABC");
		tSet.add("String");
		tSet.add("Test");
		tSet.add("Pen");
		tSet.add("Ink");
		tSet.add("Jack");
		System.out.println(tSet);//[ABC, Ink, Jack, Pen, String, Test]
		
		//HashSet olusturup Javanin elemanlari hizli eklemesini saglariz 
		
		HashSet<String> hSet1 =new HashSet<>();
		hSet1.add("ABC");
		hSet1.add("String");
		hSet1.add("Test");
		hSet1.add("Pen");
		hSet1.add("Ink");
		hSet1.add("Jack");
		System.out.println(hSet1);
		
		// Olusturdugumuz HashSet i TreeSet e constructor una parametre olarak koyup TreeSet e ceviririz 
		//Boylelikle elemanlari natural order yapma ozelliginden istifade etmis oluruz.
		TreeSet<String> tSet1 = new TreeSet<>(hSet1);
		System.out.println(tSet1);
		
		
	}

}
