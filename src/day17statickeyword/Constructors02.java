package day17statickeyword;

public class Constructors02 {
	// buyume() methodu bu class'da degil Constructors01 classinda
	// o yuzden java kullanmama musaade etmiyor.
	// Eger siz baska bir class'daki methodu kullanmak istiyorsaniz o class'dan
	// bir tane object olusturup o object sayesinde istediginiz methodu kullanabilirsiniz.
	
	public static void main(String[] args) {
		
		Constructors01 obj1=new Constructors01();
		
		// Buyume() methodu static oldugundan Java object kullanarak buyume() methodunu
		// cagirmamizi istemez ve kodun altini sari renkte cizer.
		
		//obj1.buyume(33);
		Constructors01.buyume(25);
		// Buyume() methodu static oldugundan Java object kullanarak buyume() methodunu
		// cagirmamizi istemez ve kodun altini sari renkte cizer.
				
		
		//obj1.isimDegistir("Kemal Can");
		Constructors01.isimDegistir("Cevdet");
		System.out.println(obj1.isim);
		System.out.println(obj1.yas);
		
		
		// Bir variable veya method static olarak olusturulmussa, o varialbe veya
		// methods object olusturmadan sadece class ismini kullanarak ulasabilirsiniz.
		System.out.println(Constructors03.ad);
		System.out.println(Constructors03.kilo);
		Constructors03.artirma(45);
		Constructors03.degistirme("Ayhan Isik");
	}

}
