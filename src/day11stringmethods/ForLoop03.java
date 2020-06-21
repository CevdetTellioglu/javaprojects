package day11stringmethods;

public class ForLoop03 {

	public static void main(String[] args) {
		// ilk dort sayma sayisinin carpimini veren for loop olusturunuz.
		
		int product=1;
		for(int i = 1; i<5; i++ ) {
			product = product*i;
		}
			System.out.println("Product :" +product); 
	
		// ilk 6 cift sayma sayisinin carpimini veren for loop
			

			int product1=1;
			for(int i = 2; i<13; i+=2 ) {
				product1 = product1*i;
			}
				System.out.println("Product :" +product1);
			
		// Matematikte birer birer geri sayim yapip carpmaya faktoriyel denir.
		// 6!=6 5 4 3 2 1 
				
				
				//// **** INTERVIEW SORUSU ****\\\\\
				
				//9! li hesaplayan programi for loop kullanarak yaziniz.
				
				int fact=1;
				for(int i=9;i>1;i--) {
					fact=fact*i;
				}
				System.out.println("9!:"+fact);
	}
	
	

}
