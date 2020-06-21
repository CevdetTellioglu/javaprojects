package day20arrays;

import java.util.Arrays;

public class ArraysRv03 {

	public static void main(String[] args) {
		
			// iki arrays olusturup bu arraylerin birbirine esit olup olmadigini
			// kontrol ediniz.
			
			//NOT: iki Array in esit olabilmesi icin 
			//     1. Elemanlar ayni olmali 
			//     2. Esit elemanlarin indexleri de esit olmali 
			//{1,2,3} ve {1,2,3} aynidir.
			// {1,2,3} ve {2,3,1} esit degildir.
		
		int arr1[]= {1,2,3};
		int arr2[]= {1,2,3};
		System.out.println(arr1==arr2);
		// == referencelari da kontrol eder. Iki array farkli iki object 
		// oldugundan adresleri farklidir.

		
		System.out.println(Arrays.equals(arr1, arr2));
		// cunku Arrays.equals() methodu sadece degerleri ve indexleri kontrol eder .
		//reference lara  bakmaz.
	

	}

}
