package day20arrays;

import java.util.Arrays;

public class ArraysSlayt20 {

	public static void main(String[] args) {
		System.out.println("1.example");
		
		int arr[] = { 2, 1, 7, 6 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		// 2.example
		System.out.println(" ");
		System.out.println("2.example");

		String str[] = { "Ali", "Ahmet", "Kemal", "Can" };
		Arrays.sort(str);
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
		System.out.println(" ");
		System.out.println("3.example");
		//3.example
		
		int arr2[]= {2,1,7,6};
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.binarySearch(arr2, 2));//1
		System.out.println(Arrays.binarySearch(arr2, 7));//3
		System.out.println(Arrays.binarySearch(arr2, 3));//-3
		System.out.println(Arrays.binarySearch(arr2, 9));//-5
		
		System.out.println("4.example");
		
		String str2[]= {"A","C","B","D"};
		Arrays.sort(str2);
		System.out.println(Arrays.toString(str2));
		System.out.println(Arrays.binarySearch(str2,"A"));//0
		System.out.println(Arrays.binarySearch(str2,"C"));//3
		System.out.println(Arrays.binarySearch(str2,"E"));//-5
		System.out.println(Arrays.binarySearch(str2,"G"));//-5
		
		System.out.println("5.example");
		
		int arr1[]= {10,20,30,40,50};
		for (int j = 0; j < arr1.length; j++) {
			System.out.print(" "+ arr1[j]);	
		}
		 
		System.out.println("6.example");
		int arr3[]=new int[2];
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		
		
		System.out.println("7.example");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
