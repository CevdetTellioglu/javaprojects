package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;

public class ArrayListRv02 {

	public static void main(String[] args) {
	// List olusturun isim List01 olsun elemanlar integer olsun
		
		
		// listler data type olarak primitive'leri kabul etmez
		// Primitive'lerde data type ini non primitive yapmak icin wrapper classlari kullaniriz
		
		List<Integer> list01 = new ArrayList<>();
	
				
		//bu list in icinde eleman olup olmadigini kontrol edin. isEmpty() methodu kullanilir.
		// bos ise true dolu ise false return eder.
		System.out.println(list01.isEmpty());
		//bu listeye eleman ekleyin
		
//		Scanner scan=new Scanner(System.in);
//		list01.add(scan.nextInt()); //kullanicidan listeye eleman eklenmesi 
				
		//normal eleman ekleme
		
		System.out.println(list01.add(123));
		list01.add(124);
		list01.add(125);
		list01.add(124);
		
		System.out.println(list01);
		list01.remove(1);
		System.out.println(list01);
		
		list01.remove(0);
		System.out.println(list01);
		
		list01.remove(list01.size()-1);
		System.out.println(list01);
		
	}

}
