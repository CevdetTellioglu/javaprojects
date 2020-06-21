package day30exceptions;

public class Example03 {

	public static void main(String[] args) {
		try {
			hop();
		} catch (Exception e) {
			e.printStackTrace();
			//printStackTrace(); methodu exception'larin nerede olusutugunun 
			//detayli bilgisini verir
			// not: hatalari olusum sirasina gore verir yani Exception satirlarini
			// olusum sirasina gore consolda gosterir 
			
			
		}
	}

	private static void hop() {
		throw new RuntimeException("cannot hop");
		
	}

}
