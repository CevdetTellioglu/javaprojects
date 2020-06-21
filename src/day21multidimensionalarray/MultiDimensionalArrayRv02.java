package day21multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArrayRv02 {

	public static void main(String[] args) {
		
		// Multi Dimensoanal Array olusturup deger atama
		//2.Yontem
		
		int arr[][]= {{1,2},{3},{4,5,6,7}};
		System.out.println(Arrays.deepToString(arr));
		
		System.out.println(arr[0][1]+arr[1][0]+arr[2][2]);
		
		// arr arrayindaki tum elemanlarin toplamini veren programi yaziniz.
		
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[j].length; j++) {
				sum=sum+arr[i][j];
			}
		}
		System.out.println("Tum elemanlari toplami "+sum);
				

	}

}
