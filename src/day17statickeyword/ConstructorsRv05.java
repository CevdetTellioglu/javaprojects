package day17statickeyword;

public class ConstructorsRv05 {

	public static void main(String[] args) {
		
		
		ConstructorsRv04 obj1=new ConstructorsRv04();
		System.out.println(obj1.num1);
		//System.out.println(obj1.num2);//num2 static oldugundan object kullanarak cagirmami Java istemiyor. altini sari isaretliyor
		System.out.println(ConstructorsRv04.num2);// Class ismi ile cagirmami Java guzel karsiladi 
		
	

	}

}
