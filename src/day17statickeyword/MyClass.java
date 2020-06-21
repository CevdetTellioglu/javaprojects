package day17statickeyword;

public class MyClass {
	
	int x;
	static int y;
	
	MyClass(int i){
		x += i;
		y += i;
		
	}

	public static void main(String[] args) {
		
		new MyClass(2);
		MyClass mc = new MyClass(3);
		System.out.println(mc.x);
		System.out.println(y);
		System.out.println(mc.x+ ","+MyClass.y);
		System.out.println(mc.x+ ","+MyClass.y);
	}

}
