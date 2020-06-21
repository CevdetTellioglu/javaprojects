package day12scopewhileloop;

public class WhileLoop01 {

	public static void main(String[] args) {
		//while ==> iken demektir.
		//While i go to school ==> ben okula giderken
		//While I go to Uskudar, it rained
		
		int num=0;
		
		while(num<4 ) {
			System.out.println("Ali");
			num++;
		}
		// While loop kullanarak birden 10 kadar 
		
		int num1=1;
		while(num1<=10) {
			System.out.print(num1+" ");
			num1++;
		}
		System.out.println(" ");
		// while loop kullanarak 1den 20 ye kadar cift tam sayilari yazdiriniz
		int num2=2;
		while(num2<=20) {
			System.out.print(num2+" ");
			num2+=2;
		} 
		System.out.println(" ");
		//2.yol 
		int num3 = 1;
		
		while (num3<=20) {
			if ( num3%2==0) {
			System.out.print(num3+" ");
			}num3++;
			//while loop kullanarak 5 ten 120 ye kadar 3 ile bolunebilen tam sayilari yazdiriniz
			
			
		int	num4=5;
			
		while(num4<=120) {
			if(num4%3==0) {
				System.out.print(num4+" ");
			}num4++;
		}
	}

	}}
