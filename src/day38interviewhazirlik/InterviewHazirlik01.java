package day38interviewhazirlik;

public class InterviewHazirlik01 {

	//1) Java "Platform Independent" programlama dilidir.
	//		Yani ; herhangi bir platformda yazilan JAva kodu diger platformlarda da calisir.
	//		Mesela kodu  Mac'de yazdiniz, Windowsda da calisir
	
	//2) IDE ===> Integrated Development Environment demektir. Eclipse ve IntelliJ piyasada 
	// 				kullanilan meshur iki IDE dir.
	
	//3) Constructor ===>  Yeni bir object uretilirken Constructor aktive olur ve object'i uretir
	//					   Return Type i yoktur
	//					   Ismi Class ismi ile ayni olmalidir.
	//					   Object uretmek icin  Constructor uretmek zorunda degiliz. Cunku Java
	//					   her class icin default bir constructor uretmistir.
	//					   Default Constructor'lar parametresizdir.
	//					   Biz herhangi constructor urettigimizde default constructor'lar yok olur
	//					   Constructor'lar Overload edilebilirler.
	//					   Constructor'lar child class"lardan cagrilabilirler, ama override edilemezler,
	
////// 	***//4) OOP Concept Nedir? ******
	//					OOP concept a)Inheritance b)Encapsulation c) Polymorphism 
	//								d) Abstraction e)Interface icerir.
	
	//5)Inheritance nedir ?
	//				Inheritance parent(super class)- child(sub class) iliskisidir.
	//				A class i B class ina extends ederse A child olur, B parent olur 
	//				A class i B interface ine implements ederse A child olur B parent olur
	//				A class i B interface ine extends ederse A child olur B parent olur
	//				Child perent'taki kodlarin public ve protected olanlarini kullanabilir.
	//				Reusability(tekrar kullanabilme), short coding(kodu kullanabilme), 
	//              maintenance(tamir) faydalari vardir
	
	//6)Encapsulation nedir?
	//					Data hiding(data gizlemek) demektir. Datalar Private yapilarak gizlenir.
	//					Gizlenen data'lar getter() ile okunur, setter() ile update edilir
	//					Degistirilmesini istemedigimiz kodlari koruma altina almak icin kullanilir.
	//					Maintenance faydasi  da vardir 
	//					Kodun hic degistirilmesini istemiyor sadece okunmasini istiyorsaniz o  zaman 
	//					setter() olusturmayiniz(immutable class)
	//					Kodun ne degistirilmesini ne de okunmasini istiyorsaniz o  zaman 
	//					getter() da setter() olusturmayiniz
	
	
	//7)Polymorphism nedir?
	//				Polymorphism(Coklu yapi) overloading ve overriding'dir,
	
	//8) Abstract Class nedir?
	//					Abstract Class uretmek icin abstract keyword kullanmaliyiz
	//					Abstract Classlardan object uretilemez (instantiate yapilamaz)
	// 					Abstract Class'larda hem abstract hem de concrete methodlar bulunabilir.
	//					Abstract Methodun oldugu class kesinlikle abstract olmalidir
	//					Abstract methodlarin (body'siz) concrete child'lar tarafindan override
	//					edilme zorunlulugu vardir. Concrete'ler override edilmese de olur
	//Mutlaka soyle	*****Abstract class'i child class'lari bazi gorevleri yapmak zorunda 
	//				*****birakmak icin olustururuz.
	
	
	//9) Interface nedir?
	//			Java normalde multiple inheritance a musaade etmez bu yuzden Abstract class
	//			kullandigimizda multiple inheritance yapamayiz. Fakat bazi projelerde
	//			multiple inheritance kullanmak zorunda kaliriz. bunu Java bize interface
	//			kullanma hakki vererek halletmistir. Cunku interface'lere multiple
	//			implements yapilabilir
	
	//10) Overloading nedir?
	//			Method ismi ayni tutularak parametlerin sayilari, yerleri veya
	//			data type'leri degistirilerek methodlar olusturmadir.
	//			Overloading compile time'dir. Yani overloading'de yaptiginiz hata 
	//			code yazarken belli olur
	//			Ayni isme sahip methodlara farkli islemler yapabilmek icin
	//			Mesela substring(4) ve substring(4,7) methodlarinin fonksiyonlari 
	//				esasinda aynidir. ikisi de bir String'in belli bir bolumunu almaya 
	//			yarar. Fakat bazi durumlarda bitis indexini soylemek gereki bazi durumlarda gerekmez
	//			bunun icin parametreleri farklilastiririz Bu da overloading'i dogurur.
	
	//11) Overriding nedir? 
	//				Method Signature'a(Method ismi + parametreler) dokunmuyoruz, sadece body'i 
	//				degistiriyoruz. Overriding inheritance olunca olur.
	//				Ayni method'un farkli kullanimlari icin overriding gereklidir
	//				Animal da ses(){ses cikarir} ==> Dog(){havlama} ==> kedi(){Miyavlama}
	//				Overriding run time error verir
	
	
	//12) Array ile ArrayList arasindaki farklar nelerdir?
	//							Array olusturulurken uzunlugu belli edilmek zorundadir
	//							ve daha sonra uzunluk degistirilemez. Fakat ArrayList'lerde 
	//							baslangicta uzunlugu belirtme zorunlulugumuz yok. eleman ekledikce
	//							uzunluk artar, eleman sildikce uzunluk azalir
	
	//13) String ile StringBuilder arasindaki fark nedir?
    // 					String'ler immutable'dir, StringBuilder is mutable'dir.
    // 					StringBuilder class'i daha fazla kullanisli methodlara sahiptir.
    // 					Mesela; bir String'i tersten yazdirmak icin kullanilan reverse() gibi

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
