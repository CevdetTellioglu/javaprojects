package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods01 {

	public static void main(String[] args) {

		// Elemanlari A,B,C Stringleri olan bir list olusturun

		List<String> list = new ArrayList<>();

		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list); //[A,B,C]
		
		//list iterator olusturunuz 
		// iterator kullanirken her zaman while kullanilir 
		//listIterator ın elemanlar arasında gezmek ıcın herzaman while kullanıyoruz
		
		ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			Object element = listIterator.next();
			System.out.print(element+" ");
		}
		
		System.out.println();
		// Bir list i tersten yazdirmak icin once hasNext() kullanmalisiniz daha sonra hasPrevious() kullanmalisiniz
		while(listIterator.hasPrevious()) {
			Object element = listIterator.previous();
			System.out.print(element+" ");
		}
	}

}
