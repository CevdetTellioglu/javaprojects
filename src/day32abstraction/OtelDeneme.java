package day32abstraction;

public abstract class OtelDeneme {

	public static void main(String[] args) {

	}

	public abstract void kahvalti();

	public int wifi(int kisiSayisi) {
		return kisiSayisi * 2;
	}

	public abstract void priceDay();

	public int totalprice(int tv,int kisiSayisi) {
		return tv+kisiSayisi;
	}
}
