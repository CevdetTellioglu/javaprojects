package day30exceptions;

public class Example {

	public static void main(String[] args) {
	
		try {
			hop();
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
	private static void hop() {
		throw new RuntimeException("cannot hop");
	}

}
//java.lang.RuntimeException: cannot hop
