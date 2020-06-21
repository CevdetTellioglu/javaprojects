package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysRv04 {

	public static void main(String[] args) {
		// Bir array in icinde belli bir elemanin var olup olmadigini kontrol
		// ediniz

		// binarySearch() methodu bu is icin kullanilir.
		// ONEMLI NOT: binarySearch() methodunu kullanmadan once sort() methodunu
		// kullanmak zorundasiniz.
		// aksi takdirde binarySearch() methodu manaku bir sonuc vermez.

		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen 5 adet sayi giriniz ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}

		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		// binarySearch() methodu aranan eleman var oldugunda index ini return eder.
		int search = Arrays.binarySearch(arr, 99);
		System.out.println(search + " adet var ");
		// olmayan elemanlar icin negatif sayilar return eder 
		// negatif olmasi o elemanin array de olmadigi anlaina gelir
		// sayi kismi ise o eleman var olsaydi kacinci eleman olurdu 
     	// anlaminda dir
				
sc.close();
	}

}
