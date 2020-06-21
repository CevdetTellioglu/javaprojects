package day17statickeyword;

public class ConstructorsRv01 {
	String name = "Cevdet Tellioglu ";
	int age = 33;
	// Method ile main method ayni class'da ise methodu sadece ismini yazarak kullanabilirsiniz.
	public static void main(String[] args) {
		
		
		growth(25);
		changeName("Jeff Tellioglu");

	}
	public static void growth(int age) {
		age++;
		System.out.println(age);
		
	}
	public static void changeName(String name) {
		System.out.println(name);
	}

}
