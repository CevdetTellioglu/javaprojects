package day32abstraction;

public class KralDairesi extends Otel {

	public static void main(String[] args) {
		KralDairesi musteri3 = new KralDairesi();
		musteri3.kahvalti();
		System.out.println(musteri3.tv("international",3)+ " Euro tv odemenizdir");
		System.out.println(musteri3.wifi(1)+ " Euro Wifi odemenizdir");
	}

	@Override
	public void kahvalti() {
		System.out.println("Kahvaltiniz teras kat Kral restaurantindadir");

	}

	public int tv(String international, int saat) {
		if (international.equals("international")) {
			return saat * 5;
		} else {
			return 0;
		}
	}

}

//Herhangi bir parent tarafindan override edilen abstract method alttaki c
//oncrete child’lar tarafindan override edilmese de olur
