package day19arrays;

public class ArraysRv02 {

	public static void main(String[] args) {
	//  4 elemanli char bir array olsuturun bu array e elemanlar yerlestirin
	// tum elemanlari for dongusu kullanarak ekrana yazin  ve son elemani ekrana yazdirin 
	
		char arrCh[]= {'c','e','v','o'};
		
		for (int i = 0; i < arrCh.length; i++) {
			System.out.print(arrCh[i] + " ");
			}
		//Array'in length'ini bulmak icin "ArrayIsmi.length" yazmak yeterlidir.
		// Stringlerde  de length methodu kullanilir ama String'lerde kullanilan length
		// methodu parantezlidir. yani Stringlerde ==> length() Arraylerde ==> length
		System.out.println(arrCh.length);
				
		//Array'deki son elemani yazdirmak icin length kullaniniz
		System.out.println(arrCh[arrCh.length-1]);
		
	}

}
