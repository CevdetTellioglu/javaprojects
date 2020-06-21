package day16overloading;

public class ConstructorRv02 {

	public static void main(String[] args) {
		
		//1)Baska bir class'dan urettigimiz object i , object urettigimiz classta kullanabiliriz.
				//2)Object'in ozelliklerini degistirebiliriz, fakat bu degisim sadece o object ile
			    //  sinirli kalir. Yeni uretilecek olan object'ler bu degisimlerden etkilenmez.
				//3)Eger uretilecek her object'in degisime ugramis olmasini istiyorsaniz class'daki ozellikleri
				//  degistirmelisiniz.
		
		ConstructorRv01 hondaCar01 = new ConstructorRv01();
		
		System.out.println("New Price :"+(hondaCar01.price + 2000));
		System.out.println("Year : "+(hondaCar01.year-2));
		System.out.println("Make : "+ hondaCar01.make.replace("Honda", "Toyota"));
		System.out.println("Type : "+ hondaCar01.type.replace("Civic", "Cambry"));
		
		ConstructorRv01 hondaCar02 = new ConstructorRv01();
		
		System.out.println("New Price : "+ (hondaCar02.price));
		
		
	}

}
