package day31Abstraction;

public abstract class Abstraction01 {

	public static void main(String[] args) {
		// Abstract class'lardan obje uretilemez.
		// Constructor lari yoktur.
		// Abstract class'lar concrete(body'li) ve abstract(body'siz) methodlar
		// icerebilir.
		// Abstract classlarin hem concrete class hem de abstract class olan child lari
		// olabilir.
		// === > Abstract class'in child'i concrete class ise Abstract class daki
		// Abstract methodlari mutlaka override etmeli ve onlara body eklemelidir
		// Override yapma zorunlulugunun faydasi;
		// child classlarda mecburen olmasi gereken methodlari
		// bu sekilde belirlemis oluruz
		// Abstract class'in child'i abstract class ise Abstract class daki
		// herhangi birseyi override etmek zorunda degildir.

	}

	public  void concreteMethod() {
		System.out.println("ben concrete'im");
	}

	public abstract void abstractMethod();

}
