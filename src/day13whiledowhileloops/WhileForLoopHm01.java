package day13whiledowhileloops;

public class WhileForLoopHm01 {

	public static void main(String[] args) {
		// 8 den 180 e kadar 5 in kati olan tum tamsayıları ekrana yazdırınız.
		
		int num1=8;
		for(int i=num1;i<180;i++) {
			num1++;
			if (num1%5==0) {
			System.out.print(num1 + " ");
			}
			}
		
		
		System.out.println(" ");
		int num2=8;
		while(num2<=180) {
			if(num2%5==0) {
				System.out.print(num2+ " ");
			}num2++;
		}
		
		

}}
