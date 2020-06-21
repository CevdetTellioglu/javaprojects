package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods02 {

	public static void main(String[] args) {
		// Elemanlari A,B, ve C olan bir list olustrunuz
		// List iterator kullanarak bu elemanlari AW, BW ve CW ye donusturunuz
		
		List<String> list = new ArrayList<>();

		list.add("A");
		list.add("B");
		list.add("C");

		ListIterator<String> lit = list.listIterator();

		while (lit.hasNext()) {

			Object element = lit.next();
			lit.set(element + "W");
//aslinda set methodu iterator ile hepsini degistirmmeize yardimci oldu yoksa eskiden birer birer zaten set edebiliyorduk
		}
		System.out.println(list);
		
		lit.add("Kemal");
		lit.add("Can");
		System.out.println(list);
		
	

	}

}
