package day19arrays;

public class Arrays02 {

	public static void main(String[] args) {
		//  4 elemanli char bir array olsuturun bu array e elemanlar yerlestirin
		// tum elemanlari for dongusu kullanarak ekrana yazin  ve son elemani ekrana yazdirin 
		
		
		char arr2[] = new char[4];
		arr2[0]='c';
		arr2[1]='e';
		arr2[2]='v';
		arr2[3]='o';
		
		
		for(int i=0; i<4 ; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println(arr2[3]);
		
		//Array'in length'ini bulmak icin "ArrayIsmi.length" yazmak yeterlidir.
		// Stringlerde  de length methodu kullanilir ama String'lerde kullanilan length
		// methodu parantezlidir. yani Stringlerde ==> length() Arraylerde ==> length
		System.out.println(arr2.length);
		
		//Array'deki son elemani yazdirmak icin length kullaniniz
		System.out.println(arr2[arr2.length-1]);
		
	}

}
