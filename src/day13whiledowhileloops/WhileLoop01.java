package day13whiledowhileloops;



public class WhileLoop01 {

	public static void main(String[] args) {
		// While loop kullanarak ilk bes sayma sayisinin toplamini 
		// ekrana yazdiran programin toplamini yazdiriniz
		
		int num=1;
		int sum=0;
		
		while(num<=5) {
			sum=sum+num;
			num++;
		}System.out.print(sum+" ");
		
		System.out.println(" ");
		
		String str4="2"+(5+1);
	
		System.out.println(str4);
		int a=5;
		int b=2;
		int c=7;
		boolean isTrue=a+b!=c;
		System.out.println(isTrue);
		
	}

}
