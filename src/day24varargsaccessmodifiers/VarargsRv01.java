package day24varargsaccessmodifiers;

public class VarargsRv01 {

	public static void main(String[] args) {
		// Varargs : Variables Arguments
		// Bir method olusturdugumuzda argument olarak istedigimiz 
		// kadar argument girebilmemizi saglar
		
		countNum(2);
		countNum(2,3,4);
		countNum(2,4,56,6);
		
		
		sumNums(2,3);
		sumNums(5,7,9);
		sumNums(2,3,4,5,6,7,8);
		
		printName("Ali");
		printName("Ali","Kahraman");
		printName("Ali","Can","Kahraman");

	}
	
	public static void countNum(int...a) {
		System.out.println(a.length);
	}
	
	public static void sumNums(double...b) {
		double sum = 0;
		for (double w : b) {
			sum = sum +w;
			
		}
		System.out.println(sum);
	}
	public static void printName(String...n) {
		for(String w:n) {
			System.out.print(w + " ");
		}
	}

}
