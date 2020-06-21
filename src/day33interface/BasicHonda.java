package day33interface;

public class BasicHonda extends Araba implements IcAraba, DisAraba {
	public static void main(String[] args) {
		
		
		// Class ==> interface : implements
		// Class ==> Class : extends
		// Interface ==> Interface : extends
		
		
		BasicHonda basicHonda = new BasicHonda();
		basicHonda.diesel();
		basicHonda.direksiyon();
		basicHonda.kapi();
		basicHonda.klima();
		basicHonda.koltuk();
		basicHonda.move();

	}

	@Override
	public void kapi() {
		System.out.println("Dokunmatik kapilar");

	}

	@Override
	public void direksiyon() {
		System.out.println("kemik direksiyon");

	}

	@Override
	public void koltuk() {
		System.out.println("Isitmali koltuk");

	}

	@Override
	public void klima() {
		System.out.println("manuel klima");
	}

	@Override
	public void move() {
		System.out.println("10 saniye'de 100 km yapmaz ");

	}

}
