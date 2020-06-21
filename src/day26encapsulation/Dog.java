package day26encapsulation;

public class Dog extends Mammal {
	
	public boolean sadik= true;

	public static void main(String[] args) {
		Dog dog= new Dog();
		System.out.println("Animal Class tan geldi : "+dog.age); // 0
		System.out.println("Animal Class tan geldi : "+dog.name); // null
		dog.eat();
		dog.move();
		
		
		System.out.println("Mammal CLass tan geldi : "+dog.dogum);
		dog.feed(); // cocuklarini besle
		
		System.out.println("Dog class tan geldi : "+ dog.sadik);
		dog.bark();
	}

	public void bark() {
		System.out.println("Kopek havlar");
	}
}
