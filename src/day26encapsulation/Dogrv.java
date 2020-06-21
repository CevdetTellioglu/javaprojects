package day26encapsulation;

public class Dogrv {

	public boolean sadik= true;

	public static void main(String[] args) {
		Dog dogRv = new Dog();
		System.out.println("AnimalRv Class tan geldi : " + dogRv.age); // 0
		System.out.println("AnimalRv Class tan geldi : " + dogRv.name); // null
		dogRv.eat();
		dogRv.move();

		System.out.println("MammalRv CLass tan geldi : " + dogRv.dogum);
		dogRv.feed(); // cocuklarini besle

		System.out.println("DogRv class tan geldi : " + dogRv.sadik);
		dogRv.bark();
	}

	public void bark() {
		System.out.println("Kopek havlar");
	}
}
