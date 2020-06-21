package day06ifstatement;

public class IfStatement04 {

	public static void main(String[] args) {
		// Bir tane Strin variable olusturun ve bir gun ismini kucuk harflerle deger olarak atayin
		// Eger atadiginiz deger hafta ici gunlerinden biri ise
		// ekrana “hafta ici” yazdirin.
		// Eger atadiginiz deger hafta sonu gunlerinden biri ise
		// ekrana “hafta sonu” yazdirin.
		
		
		 String day1="carsamba";
		 
		 if (day1.equals("pazartesi")|| day1.equals("sali") || day1.equals("carsamba") || day1.equals("persembe") || day1.equals("cuma")){
			 	System.out.println(day1 +" bir haftaici gunudur.");	 	
		 }
		 if (day1.equals("cumartesi")|| day1.equals("pazar")) {
			 System.out.println(day1 +" hafta sonu gunudur.");
		 }
	}

}
