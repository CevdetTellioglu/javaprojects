package day22arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		//toArray() methodu list  i array e cevirmek icin kullanilir
		
		List<String> list=new ArrayList<>();
		list.add("Ali");
		list.add("Can");
		System.out.println(list);
		
		
		//1.Yontem ; toArray() icinde parametre olarak new String[0] kullaniniz
		String arr[]=list.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));
	
		//2.Yontem ; Olusturdugunuz array in data type'ini Object olarak secin 
		// Object class java da butun classlarin parent'idir. Yani object class ortak adidir.
		// Object class, Java da parent i olmayan tek class'dir.
		// String, Object class in child i oldugundan data type olarak bazi durumlarda 
		// String yerine Object kullaniriz
		Object[] arr1=list.toArray();
		System.out.println(Arrays.toString(arr1));
		
//  		object nedir? örneklendirme:
//			bir class aynı zaman da cocuk ve baba olabilir.
//			object ise hz Adem dir. babası yoktur
//          javada da babası olmayan tek class object tir.  java bütün class ların babasıdır.
//          her insan nasıl hz. Adem in butun özelliklerini tasıyorsa,
//			benzer sekilde object in child ları da object in her özelliğini taşır. ama fazladan özellikleri de olabilir.
//			java da couklar baba dan daha kapsamlı olurlar.
		
		
		//asList() Array leri list'e cevirmek icin kullanilir.
		//asList() parametre olarak array'in ismini kabul eder.
		
		String arr2[]= {"Aliye" , "Canan"};
		
		Arrays.asList(arr2);
		
		List<String> list1 = Arrays.asList(arr2);
		System.out.println(list1);
		//Array'dan  list'e cevirme yaptiginizda, elde ettiginiz list uzunluk olarak esnek degildir.
		//Yani array'den olusturdgunuz list'e ekleme ve cikarma yapamazsiniz.
		
		//list1.add("Emine"); // add() yapamazsiniz rte verir  UnsupportedOperationException hata verir
		System.out.println(list1);
		
		//list1.remove("Aliye"); // remove() yapamazsiniz.
		System.out.println(list1);
		
		
		list1.set(0, "Cevdet"); // set() methodu calisir
		System.out.println(list1);
		
		Collections.sort(list1);
		System.out.println(list1);
		
		//list1.clear(); calismaz
		System.out.println(list1);
		

	}

}
