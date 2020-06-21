package day32abstraction;

public class TekKisilikOda extends Otel {

	public static void main(String[] args) {
		TekKisilikOda musteri1 = new TekKisilikOda();
		musteri1.kahvalti();
		System.out.println(musteri1.tv(5)+ " Euro tv odemenizdir");
		System.out.println(musteri1.wifi(1)+ " Euro Wifi odemenizdir");
	}

	@Override
	public void kahvalti() {
		System.out.println("Kahvaltiniz sandvictir");
	}

	public int tv(int saat) {
		return saat * 2;
	}

}
