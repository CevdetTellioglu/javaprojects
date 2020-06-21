package day19arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// Integer array olusturalim

		int arr1[] = new int[5];

		// Note :
		// System.out.println(arr1); ==> Array in refenrence ini verir.
		// System.out.println(arr1[2]); ==> Array in index i 2 olan elemanini ekrana
		// yazdirir
		System.out.println(arr1[0]);
		System.out.println(arr1[3]);

		// indexi 0 olan arrays a 12 ata

		arr1[0] = 12;
		arr1[1] = 27;
		arr1[2] = 33;
		arr1[3] = 67;
		arr1[4] = 22;
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		// Array deki elemanlari ekrana yazdirmak icin for dongusu kullaniniz

		for (int i = 0; i < 5; i++) {
			System.out.println(arr1[i]);
		}

		// Arrayde olmayan index e deger atamasi yapilirsa run time error alir
		// Array de olmayan index i kullanmaya calisirsak
		// "ArrayIndexOutOfBoundsException" aliriz.
		arr1[5] = 23;
		System.out.println(arr1[5]);
	}

}
