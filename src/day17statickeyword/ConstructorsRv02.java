package day17statickeyword;

public class ConstructorsRv02 {
		// growth() methodu bu class'da degil ConstructorsRv01 classinda
		// o yuzden java kullanmama musaade etmiyor.
		// Eger siz baska bir class'daki methodu kullanmak istiyorsaniz o class'dan
		// bir tane object olusturup o object sayesinde istediginiz methodu kullanabilirsiniz.
		
	public static void main(String[] args) {
		
		ConstructorsRv01 obj1= new ConstructorsRv01();
		
		// Buyume() methodu static oldugundan Java object kullanarak buyume() methodunu
		// cagirmamizi istemez ve kodun altini sari renkte cizer.
				
		//obj1.growth(33);
		ConstructorsRv01.growth(25);
		
		// Buyume() methodu static oldugundan Java object kullanarak buyume() methodunu
		// cagirmamizi istemez ve kodun altini sari renkte cizer.
		 
		//obj1.changeName("Kemal Can");
		ConstructorsRv01.changeName("cevo");
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		
		// Bir variable veya method static olarak olusturulmussa, o varialbe veya
		// methods object olusturmadan sadece class ismini kullanarak ulasabilirsiniz.
		
		System.out.println(ConstructorsRv03.name);
		System.out.println(ConstructorsRv03.kilo);
		ConstructorsRv03.increase(45);
		ConstructorsRv03.change("Ayhan Isik");

	}

}
