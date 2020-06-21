package day27constructorcagirma;

public class AnimalRv {
	
	public int age;
	protected String name;
	

	public static void main(String[] args) {

		AnimalRv animalRv = new AnimalRv();
		
		System.out.println(animalRv);
	}
	
	public void move() {
		System.out.println("hareket edebiliyor.");
	}

	public void eat() {
		System.out.println("yemek yiyebiliyor.");
	}
	
	AnimalRv(){
		System.out.println("Animal parametresiz constructor");
	}
	

}
