package day06review;

public class IfStatementRv04 {

	public static void main(String[] args) {
		//  Bir tane String variable olusturun ve bir gun ismini kucuk harflerle deger olarak atayin
		// Eger atadiginiz deger hafta ici gunlerinden biri ise
		// ekrana “hafta ici” yazdirin.
		// Eger atadiginiz deger hafta sonu gunlerinden biri ise
		// ekrana “hafta sonu” yazdirin.
		
		String day= "carsamba";
	
		if(day=="pazartesi" || day=="sali"||day=="carsamba"||day=="persembe"||day=="cuma") {
			System.out.println( day+ " haftaici'dir. ");
			}
		if(day=="cumartesi" || day == "pazar") {
			System.out.println(day + " haftasonu'dur.");
		}
		
		

	}

}
