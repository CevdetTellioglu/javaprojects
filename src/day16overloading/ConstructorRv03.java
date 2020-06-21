package day16overloading;

public class ConstructorRv03 {
	String name = "Ali Can";
	int age = 33;
	int kilo = 85;
	String job="Automation Tester";
	boolean retired=false;
	
	ConstructorRv03(){
		
	}
	ConstructorRv03(String name, int age, boolean retired ){
		this.name=name;
		this.age=age;
		this.retired=retired;
		
		
	}

	ConstructorRv03(String name){
		this.name=name;
		
	}
	public static void main(String[] args) {
		
		ConstructorRv03 humain01 = new ConstructorRv03();
		System.out.println(humain01.name);
		
		ConstructorRv03 humain02 = new ConstructorRv03("Cevdet Tellioglu ",26,true);
		System.out.println(humain02.name);
		System.out.println(humain02.age);
		System.out.println(humain02.retired);
		System.out.println(humain02.job);
		System.out.println(humain02.kilo);
		
		ConstructorRv03 humain03 = new ConstructorRv03("Ayse Yildiz");
		System.out.println(humain03.name);
		System.out.println(humain03.kilo);
		
		

	}

}
