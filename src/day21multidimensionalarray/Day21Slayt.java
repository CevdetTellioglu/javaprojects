package day21multidimensionalarray;

import java.util.Arrays;

public class Day21Slayt {

	public static void main(String[] args) {
		
		String str="Java'yi, sevdiniz mi?";;
		
		String arr[]=str.split(",");		
		System.out.println(Arrays.toString(arr));
		String arr2[]=str.split(" ");
		System.out.println(Arrays.toString(arr2));
		String arr3[]=str.split("d");
		System.out.println(Arrays.toString(arr3));

	}

}
