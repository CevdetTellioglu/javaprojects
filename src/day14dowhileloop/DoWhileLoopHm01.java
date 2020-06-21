package day14dowhileloop;

public class DoWhileLoopHm01 {

	public static void main(String[] args) {
		// 9 den 190 e kadar 7 nin kati olan 
		//tüm tamsayıları ekrana yazdırınız.
		
		int num1=9;
		
		do {
			if(num1%7==0) {
			
			System.out.print(num1+" ");
			
			}num1++;
		}while(num1<190);

		
			}

}
