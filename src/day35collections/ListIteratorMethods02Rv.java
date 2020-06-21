package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods02Rv {

	public static void main(String[] args) {
		//Elemanlari A,B, ve C olan bir list olusturunuz
		//List iterator kullanarak bu elemanlari AW, Bw CW ye donusturoutunuz
		
		List<String> list	= new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		ListIterator<String> lit = list.listIterator();
		while (lit.hasNext()) {
			Object element = lit.next();
			lit.set(element+"W");
//aslinda set methodu iterator ile hepsini degistirmemize yardimci 
//oldu yoksa eskiden birer birer zaten set edebiliyorduk

		}
		System.out.println(list);
		lit.add("Kemal");
		lit.add("Can");
		System.out.println(list);
	}

}
