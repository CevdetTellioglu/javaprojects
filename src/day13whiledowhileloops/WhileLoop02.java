package day13whiledowhileloops;

public class WhileLoop02 {

	public static void main(String[] args) {
		// ilk 5 sayma sayisinin toplamini ekrana 
		// yazdiran programi yaziniz
		

		int num=1;
		int product=1;
		
		while(num<=5) {
			product=product*num;
			num++;
		}System.out.println(product+" ");
		
	}

}
