package day27constructorcagirma;

public class Mammal extends Animal {

	public boolean dogum = true;
	
	public static void main(String[] args) {
	
		Mammal mammal = new Mammal();
		Mammal mammals = new Mammal(15);
		System.out.println(mammal);
		System.out.println(mammals);
	}
	
	
	
	public void feed() {
		System.out.println("Cocuklarini besler");
	}
	
	
	Mammal(){
		this(11); // Parent daki parametresiz constructor u calistirir
				 // super() keyword'unu kullanmazsaniz da olur ama bazilari kullanir sasirmayin
		
				// super kullanilacaksa mutlaka ilk satirda olmalidir
				// super() ve this() ayni constructor icerisinde olamaz cunku ikiside ilk satirda olmak zorunlugugu var
		
		System.out.println("Mammal parametresiz constructor");
	}
	
	public Mammal(int age) {
		super();
		System.out.println("Child Constructor called by this");
		
	}

}
