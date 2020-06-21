package day28overriding;

public class Derived3 {
	
	protected final void getDetails() {
		System.out.println("Derived Class");
	}
}
/*
public class Test extends Derived3{
	protected final void getDetails() {
		System.out.println("Test class");
	}
	public static void main(String[] args) {
		Derived3 obj = new Derived3();
		obj.getDetails();
	}
}
*/

//final method’lar override yapılamaz.
//Compile Time Error verir.