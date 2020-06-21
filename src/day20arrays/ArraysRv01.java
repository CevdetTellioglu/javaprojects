package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysRv01 {

	public static void main(String[] args) {
		 /*
		  *  Kullanıcıdan kaç elemanlı bir array girmesini  isteyin.
          Bu array’i olusturup tum elemanlarını ekrana yazdırın.
          Bu arayın ilk elemanını son eleman yapın ve tum elemanlarını ekrana yazdırın.
          Mesela; array {1, 2, 3} ise ekrana {2, 3, 1} seklinde yazdırın.
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Lutfen kac elemanli bir array olusturacaksiniz onu belirtin");
		int length=sc.nextInt();
		
		int arr[]=new int[length];
		
		System.out.println("Array elemanlarini giriniz");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			//Arrays.toString() methoduna parametre olarak array in ismini yazarsaniz.
			// o arrayin tum elemanlarini ekranda gorursunuzu.	
		}System.out.println(Arrays.toString(arr));
		
		int arrSon[]=new int[length];
		
		for (int i = 0; i < length; i++) {
			arrSon[i=1] = arr[i];		
		}
		arrSon[length-1]=arr[0];
		System.out.println(Arrays.toString(arrSon));
	sc.close();
	}

}
