package day32abstraction;

import java.util.Scanner;

public class TekKisilikOdaDeneme extends OtelDeneme {
	public static void main(String[] args) {
		
		TekKisilikOdaDeneme client1 = new TekKisilikOdaDeneme();
		client1.priceDay();
		client1.kahvalti();
		client1.tv();
		
		System.out.println(client1.wifi(1) + " Euro Wifi odemenizdir");
		

	}

	@Override

	public void kahvalti() {
		System.out.println("kahvaltiniz sucuklu yumurta");

	}
	public void priceDay() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Kac gun kalacak : ");
		int day = sc.nextInt();
		int price = day * 25;
		System.out.println("toplam konaklama ucreti :" + price);
		sc.close();
	}

	public void tv() {
		Scanner sc = new Scanner(System.in);
		System.out.println("kac saat tv izlendi:");
		int tv = sc.nextInt();
		int tvPrice=tv*3;
		System.out.println(tvPrice + " Euro tv odemenizdir");
		sc.close();
	}
	

	
	

}
