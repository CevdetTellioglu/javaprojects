package day31Abstraction;

public class AbstractionRv02 extends AbstracitonRv01 {

	public static void main(String[] args) {
		Abstraction02 obj = new Abstraction02();
		obj.abstractMethod();
		obj.concreteMethod();

	}
	
	

	@Override
	public void abstractMethod() {
		System.out.println("Abstract methodunun override edilmis hali ");

		
	}

}
