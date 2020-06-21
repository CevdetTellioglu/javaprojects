package day28overriding;

public class Derived {
	
	public void getDetails(String temp) {
		
	}
}

	 class Test extends Derived{
	
		// public int getDetails(String temp) {
		//	 System.out.println("Test class "+ temp);
		//	 return 0;
		// }
		
		 public static void main(String[] args) {
			Test obj = new Test();
			obj.getDetails("GFG");
			
		}
	}

//Overriding yapılan method’larin return type’lari ya ayni olmalıdır veya is-a relation olmalıdır. Compile Time Error verir