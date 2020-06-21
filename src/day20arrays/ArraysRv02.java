package day20arrays;

import java.util.Arrays;

public class ArraysRv02 {

	public static void main(String[] args) {
		// Bir int  Array in elemanalarini kucukten buyuge diziniz
		// Ve ekrana 2 durumu da yazdiriniz.
		
		int arr[]= {2, 33, 13, 34, 12, 34,12, 54, 23,123 ,756,345};
		System.out.println("Siralamadan once "+ Arrays.toString(arr));
		//Arrays.sort() methodunun parametre olarak array in ismi yazilirsa 
		// o array in elemanlari kucukten buyuge siralanirr
		// (Ascending order veya natural order denir)	
		
		Arrays.sort(arr);
		System.out.println("Sifirlamadan sonra "+Arrays.toString(arr));
		
		// Soru: charlardan olusan bir Array olusturunuz ve ascending order yapiniz
		// Charlar siralanirken java Ascii kodlari kullanir 
		// buyuk harflerin ASCII kodlari kucuk harflerden azdir bu yuzden 
		// siralamada buyuk harfler once gecer/		
		
		char arr1[]= {'c','e','v','d','e','t','t','e','l','l','i'};
		System.out.println("Arrays order dan once "+Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println("Arrays order dan sonra "+Arrays.toString(arr1));
		
		//String deneyiniz.
		
		String arr2[]= {"cevdet","elif","irfan","hatice","ali"};
		System.out.println("Arrays order dan once "+ Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println("Arrays order dan sonra "+ Arrays.toString(arr2));
		
		//boolean iki elemanli array olusturn
		
		// boolean lar icin sort methodu kullanilmaz
				
	}

}
