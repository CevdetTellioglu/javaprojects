package day30exceptions;

public class Example03Rv {

	public static void main(String[] args) {
		try {
			hop();
		}catch(Exception e ) {
			e.printStackTrace();
		}
		/*
		 printStackTrace() methodu exceptionlarin nerde olustugunun 
		 detayli bilgisini verir
		 not: hatalari olusum sirasina gore verir yani Exception satilarni
		 olsuum sirasina gore consolda gosterir
		 */

	}
private static void hop() {
	throw new RuntimeException("cannot hop");
}
}
