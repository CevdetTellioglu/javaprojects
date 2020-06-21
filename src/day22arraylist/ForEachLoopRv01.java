package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoopRv01 {

	public static void main(String[] args) {
		// For Each Loop, for loop'un ust versiyonudur. 
		// Diger adi "Enhanced (Zenginlestirilmis) For Loop"
			int arr[]= {12,21,13,43};
		
		//For loop kullanarak elemanlari ekrana yazdirmak 
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
				}
			//for each loop kullanarak elemanlari ekrana yazdirin
			System.out.println();
			for(int w : arr) {
				System.out.print(w+" ");
			}
			System.out.println();
			//String iceren bir array olusturun, elemanlarini yan yana aralarina bosluk koyarak 
			//for each loop ile ekrana yazdirin
			
			String arr1[]= {"Cevdet","Tellioglu","Fransa "};
			for (String w : arr1) {
				System.out.print(w+" ");		
			}
			System.out.println();
			//Integer elemanlar iceren bir list olusturun.For each loop kullanarak
			//bu elemanlarin toplamini ekrana yazdirin.

			List<Integer> list1=new ArrayList<>();
			list1.add(3);
			list1.add(5);
			list1.add(7);
			list1.add(9);
			
			int sum=0;
			
			for (Integer w : list1) {
				sum+=w;	
			}
			System.out.println(sum);
			System.out.println();
			
			// { {1,2},{5},{6,7,8,}} array'indeki tum elemanlarin toplamiini bulunuz .
			
			int arr2[][]={ {1,2},{5},{6,7,8,}};
			int sum1=0;
			
			for (int[] w : arr2) {
				for (int z :w) {
					sum1=sum1+ z;
				}
				
			}System.out.println(sum1);
			

		
			

	}

}
