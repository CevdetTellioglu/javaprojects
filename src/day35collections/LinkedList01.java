package day35collections;

import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
		// Linked List'de head haric her eleman icin bir data bir de pointer var.
		// head'de sadece pointer var 
		// her elemanin pointer i bir sonraki elemani gosterir, son eleman'in(tail) pointer'i 
		// Null gosterir
		// Data ve pointer iceren her elemanin diger adi "Node" dur.
		// Linked List eleman eklemek ve cikarmak durumlarinda basarilidir.
		// 
		
		// Linked list objesi olusturunuz 
		LinkedList<String> linkList = new LinkedList<>();
		linkList.add("Mark");
		linkList.add("Amanda");
		linkList.add("John");
		linkList.add("Ann");
		linkList.add("Pamela");
		System.out.println(linkList);
		
		linkList.remove(2); // remove() methodu index e gore eleman siler
		System.out.println(linkList);
		linkList.removeFirst();
		System.out.println(linkList);
		linkList.removeLast();
		System.out.println(linkList);
		
		
		linkList.add(1, "Ali");
		System.out.println(linkList);
		linkList.addFirst("Kemal");
		System.out.println(linkList);
		linkList.addLast("Zeynep");
		System.out.println(linkList);
		
		linkList.set(1, "Ajanda");
		System.out.println(linkList);
		
		LinkedList<String> linkList2 = new LinkedList<>();
		linkList2.add("X");
		linkList2.add("Y");
		
		
		linkList2.addAll(linkList);
		System.out.println(linkList2);
		
		linkList.addAll(3,linkList2);
		System.out.println(linkList);
		
		System.out.println(linkList2.contains("Can"));//false
		System.out.println(linkList2.contains("Ali"));//True
		
		linkList2.clear(); // clear() methodu listin elemanlarini siler, sizde bos bir list kalir 
		System.out.println(linkList2);
		// linkedList de her elaman bir sonraki elemana baglidir.
        //diyelim ki bir program yazarken bir list olusturmamiz lazim(eleman silmek ve eleman eklemek icin)
		//o zaman linkedlist kullanmaliyim cunku hatasiz ve hizli calisir.
		//tek tek indexlere bakmaz. direk navigasyon cihazi gibi o indexdeki elemani bulur.
	}

}
