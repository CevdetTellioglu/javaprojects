package day06review;

public class IfStatementRv03 {

	public static void main(String[] args) {
				// bir char variable olusturun bir buyuk harf deger atayin
				// eger atanan deger, haftanin gunlerinden herhangi birinin ilk harfi ise o gunleri yazdirin
				// Eger atanan deger haftanin gunlerinden birisi degilse 
				// ekrana "Boyle bir gun yok" yazdirin.
		
		char day= 'C';
		if(day=='P') {
			System.out.println("'P' ile baslayan gunler = Pazar - Pazartesi - Persembe");
		}
		if(day == 'S') {
			System.out.println("'S' ile baslayan gun = Sali");		
		}
		if(day == 'C') {
			System.out.println("'C' ile baslayan gunler = Carsamba - Cuma - Cumartesi");
		}

		// "P" olmamak VEYA "C" olmamak "S" olmamak ==> VEYA islemi icin ||
				// VEYA isleminden True sonu alabilmek icin bir tanesinin True olmasi yeterlidir
				// True || True = True
				// True || False = True
				// Fasle || False = False
				// VEYA Islemi toplama yapmaya benzer true eger 1 ise  hep 1 olur
				
				
					
				// "P" olmamak VE "C" olmamak "S" olmamak ==> VE islemi icin &&
				// VE isleminden True sonucu alabilmek icin tum conditionlar true olmalidir
				// True && True = True
				// True && False = False
				// False && False = False
				// VE islemi carpmaya benzer True eger 1 ise T&&T=t olur diger her durumda F olur
		
		if(day!='P' && day!='C' && day!='S') {
			System.out.println("Boyle bir gun yok");
		}
		
		
	}

}
