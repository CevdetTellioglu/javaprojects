package day28overriding;

public class Derived1Rv {

	public void getDetails(String temp) {
		
		
	}

}
/*
public class Test2 extends Derived1Rv {
	public void getDetails() {
		System.out.println("Test Class ");
	}

	public static void main(String[] args) {
		Derived1Rv obj = new Test2(); // line xyz
		obj.getDetails();

	}
}
*/
// Child class’daki method’larin access modifier’lari  
// ayni olmalıdır veya daha geniş olmalıdır. 
// Compile Time Error verir access modifier icin