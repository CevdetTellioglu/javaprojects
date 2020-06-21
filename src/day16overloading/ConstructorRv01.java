package day16overloading;

public class ConstructorRv01 {
	
	int price = 20000;
	int year = 2020;
	String make = "Honda";
	String type = "Civic";
	

	public static void main(String[] args) {
		
		ConstructorRv01 hondaCar = new ConstructorRv01(); // bir tane object uretildi
		
		System.out.println("Price ; "+ hondaCar.price);
		System.out.println("Year  ; "+ hondaCar.year);
		System.out.println("Make  ; "+ hondaCar.make);
		System.out.println("Type  ; "+ hondaCar.type);
		
	}

}
