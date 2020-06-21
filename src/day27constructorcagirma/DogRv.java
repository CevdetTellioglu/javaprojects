package day27constructorcagirma;

public class DogRv extends MammalRv{


		public boolean sadik = true;

		public static void main(String[] args) {
			
			DogRv dog = new DogRv();
			System.out.println(dog);

		}
		public void bark() {
			System.out.println("Kopek havlar");
		}
		
		
		DogRv(){
			super();
			System.out.println("Dog parametresiz constructor");
		}
		

	}
