package day28overriding;

public class DerivedRv {
	public void getDetails(String temps) {

	}
}

class Test1 extends DerivedRv{
	/*
	 * public int getDeatils(String temp){
	 * 
	 * System.out.println("Test class"+ temp); 
	 * return 0;
	 * }
	 */

	public static void main(String[] args) {
		Test1 obj = new Test1();
		obj.getDetails("GFG");
	}

}
// Overriding yapılan method’larin return type’lari ya
// ayni olmalıdır veya is-a relation olmalıdır.
// Compile Time Error verir