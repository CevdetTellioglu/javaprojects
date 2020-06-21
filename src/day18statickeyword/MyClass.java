package day18statickeyword;

public class MyClass {
	int x = 3;
	int y = 5;
	
	MyClass(){
		x += 1; // 3+1=4
		System.out.println("-x"+ x); // -x4
	}
	MyClass(int i){
		this(); //4
		this.y=i; //
		x += y;
		System.out.println("-x"+x);
	}
	MyClass(int i, int i2){
		this(3);
		this.x -= 4;
		System.out.println("-x"+x);
		
	}
	public static void main(String[] args) {
		MyClass mc1=new MyClass(4,3);
	System.out.println();
		
		
		/*
		 	output :
	   		   	 -x4
				 -x7
				 -x3

		 */
		
	}

}
 
		