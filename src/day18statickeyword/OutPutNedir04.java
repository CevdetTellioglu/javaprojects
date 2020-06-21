package day18statickeyword;

public class OutPutNedir04 {
	int x = 10;

	public static void main(String[] args) {
		
		OutPutNedir04 t1 = new OutPutNedir04();
		System.out.println(t1.x);
		
		}
	static {
		int x=20;
		System.out.println(x+" ");
	}

}
//Java once static methodu okur daha sonra diger constructor veya main methodu okur .
//output 20
//	     10 dur

