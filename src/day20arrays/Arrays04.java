package day20arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		// Bir array in icinde belli bir elemanin var olup olmadigini kontrol
		// ediniz
		
		
		//binarySearch() methodu bu is icin kullanilir.
		// ONEMLI NOT: binarySearch() methodunu kullanmadan once sort() methodunu
		// kullanmak zorundasiniz.
		// aksi takdirde binarySearch() methodu manaku bir sonuc vermez.
		
		int arr[]= {1,5,2,4,3};
		
		// yukarida verilen array'de 3 eleman olarak var mi ?
	
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr,3)); 
		System.out.println(Arrays.binarySearch(arr,3));//2
		//binarySearch() methodu aranan eleman var oldugunda index ini return eder 
		
		
		System.out.println(Arrays.binarySearch(arr,5)); //4
		System.out.println(Arrays.binarySearch(arr,12));
		// olmayan elemanlar icin negatif sayilar return eder 
		// negatif olmasi o elemanin array de olmadigi anlaina gelir
		// sayi kismi ise o eleman var olsaydi kacinci eleman olurdu 
		// anlaminda dir
		
		int arr1[] = {2, 11, 0, 23, 7};  
		Arrays.sort(arr1);
		for(int i=4; i>=0; i--) {	
			System.out.print(arr1[i] + " ");// Array da listeyi sondan basa dogru yazdirma 
			
		}		
					int arr3[] = {1, 2, 3};
					int arr2[] = {1, 2, 3};
					System.out.println(Arrays.equals(arr3, arr2));
		

	}

}
