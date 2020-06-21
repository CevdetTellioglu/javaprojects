package day26encapsulation;

public class Cat extends Mammal {
	
	public boolean clean = true;
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		System.out.println("Animal Classtan geldi : "+ cat.age);
		System.out.println("Animal Classtan geldi : " + cat.name);
		cat.eat();
		cat.move();
		
		System.out.println("Mammal Classtan geldi :  "+ cat.dogum);
		cat.feed();
		
		System.out.println("Cat classtan geldi :  "+ cat.clean);
		cat.meow();

	}
	public void meow() {
		System.out.println("Kediler miyavlar");
	}

}
