package day26encapsulation;

public class CatRv extends MammalRv {
	
	public boolean clean = true;

	public static void main(String[] args) {
		Cat catRv = new Cat();
		System.out.println("AnimalRv Classdan geldi "+catRv.age);
		System.out.println("AnimalRv Classdan geldi "+ catRv.age);
		catRv.eat();
		catRv.move();
		
		System.out.println("MammalRv Classtan geldi"+catRv.dogum);
		catRv.feed();
		
		System.out.println("CatRv classtan geldi :  "+ catRv.clean);
		catRv.meow();

	}
	public void meow() {
		System.out.println("Kediler miyavlar");
	}

}
