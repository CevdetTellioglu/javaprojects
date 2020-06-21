package day19arrays;

public class ArrayHomeWork01 {

	public static void main(String[] args) {
		int arr[]= {10, 20, 30, 40, 50};
		for(int i=0; i< arr.length; i++) {
			System.out.print(" "+ arr[i]);
		} // output:
			/*
			 * 10
			 * 20
			 * 30
			 * 40
			 * 50
			 * 
			 */
			
//		int arr2[2];
//		System.out.println(arr2[0]);
//		System.out.println(arr2[1]);
		
		// CTE hata verir cunku array tanimlanmadan index istenmis 
		
		
		int arr3[]= new int[2];
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		
		// 1 adet 0 yazdirir cunku java deger verilmeyen array icin default olarak arrayin butun indexlerine 0 atar
		
		int arr4[]= {1,2,3};
		int arr5[]= {1,2,3};
		if(arr4 == arr5) {
				System.out.println("Same");
		}else { 
			System.out.println("Not same");
		}
		
		//
		
		String[] cities= {"London", "Paris","Rome", "New York"};
		System.out.println(cities[cities.length-2]);
		
		// ciktisi rome olur
		
		
	}

}
