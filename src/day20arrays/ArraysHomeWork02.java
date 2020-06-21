package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysHomeWork02 {

	public static void main(String[] args) {
		// Kullanıcıya kaç elemanlı bir array gireceğini sorun. Kullanıcıdan array’in
		// elemanlarını girmesini isteyin.
		// a) Bu array’in icinde herhangi bir elemanın var olup olmadigini kontrol edin.
		// b) Bu arayın tum elemanlarını tersten yazdırın.
		// Mesela; array {1, 2, 3, 4} ise ekrana {4, 3, 2, 1} seklinde yazdırın.

		Scanner scan = new Scanner(System.in);

		System.out.println("Kac elemanli bir integer array olsuturmak istersiniz?");
		int length = scan.nextInt();

		int arr[] = new int[length];

		System.out.println("Array elemanlarini giriniz ");

		for (int i = 0; i < length; i++) {
			arr[i] = scan.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			for (int j = arr.length-1; j >= 0; j--) {
				System.out.print(arr[j]+" ");
			}
				scan.close();
	}
}