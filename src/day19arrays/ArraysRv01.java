package day19arrays;

public class ArraysRv01 {

	public static void main(String[] args) {
		
			//integer arrays olusturalim
		
		int arr1[]= new int[5];
		
		
		// System.out.println(arr1); ===> Array reference verir
		// System.out.println(arr1[2]); ==> Array in indexi 2 olan elemanini verir
		System.out.println(arr1[0]);
		System.out.println(arr1[3]);
		
		
		// indexi 0 olan arrays a 12 ata
		
		arr1[0]=12;
		arr1[1]=13;
		arr1[2]=14;
		arr1[3]=15;
		arr1[4]=16;
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		
		// Array deki elemanlari ekrana yazdirmak icin for dongusu kullaniniz
		
		for(int i=0; i<5;i++) {
			System.out.println(arr1[i]);
		}
		
			// Arrayde olmayan index e deger atamasi yapilirsa run time error alir
			// Array de olmayan index i kullanmaya calisirsak "ArrayIndexOutOfBoundsException" aliriz.
					
		arr1[5]=23;
		System.out.println(arr1[5]);
	
		
		
	}

}
