package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		// equals() methodu iki listin birbirine esit olup olmadigini kontrol eder.
		// List'lerde esit ise "True", degilse "false" return eder.
		// equals() methodunda true alabilmek icin listler birbirinin fotokopisi olmalidir
		
		// equals() methodu ayni index'de ayni elemanin olup olmadigini kontrol ediyor.
		// equals() methodu objelerin reference larina bakmaz 
		
		
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();

		System.out.println(list1.equals(list2));
		
		list1.add("A");
		list1.add("B");
		
		System.out.println(list1.equals(list2));
		
		list2.add("B");
		
		list2.add("A");
		
		System.out.println(list1.equals(list2));
		
		


		
		
	}

}
