package day28overriding;

public class MammalRv extends AnimalRv {
	
	public boolean birth = true ;
	public String name = "Kedi";

	public static void main(String[] args) {
		MammalRv mammal=new MammalRv();
		
	}
	
	public void feed() {
		System.out.println("Yavrularini besler");
	}

	public MammalRv() {
		// this icinde bulundugumuz class'daki variable ve methodlara ulasmanizi saglar
		System.out.println(this.birth); // true
		this.feed();//yavrularini besler
		
		//Child-Parent iliskisi varsa this kullanarak parent / Grandparent class daki
		// variable ve methodlara da ulasabilirsiniz
		// Ama parent class'lardaki variable ve methodlara ulasmak icin this kullanmayin
		// cunku child ve parent'daki ayni isimli variable ve metholarda problem yasabilirsiniz
		// Genel kullanimda this class icindekiler icin, super parent'dakiler icin kullanilie
		// farklilik yapip insanlari sasirtmayin 
	
		System.out.println(this.age); // 4
		System.out.println(this.name); // Kedi 
		this.move(); // Hayvanlar hareket eder
		System.out.println(this.name);//Kedi
		
		//Parantezsiz super parent/grandparent'lardaki variable ve methodlara ulasmanizi saglar
		// Parent'dakilere super kullanarak ulasmak daha guvenlidir.
		System.out.println(super.age); // 4
		System.out.println(super.name ); // Karabas
		super.move();// Hayvanlar hareket eder 
		
	}

}
