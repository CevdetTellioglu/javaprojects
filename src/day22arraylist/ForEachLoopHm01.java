package day22arraylist;



public class ForEachLoopHm01 {

	public static void main(String[] args) {
		// Bir integer array oluşturunuz ve bu array’deki tum sayıların 
		// çarpımını For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.
		
		int arr[]= {1,3,5,6,7,8};
		int prod=1;
		
		for(int w:arr) {
			prod=prod*w;
			
		}
		System.out.println(prod);
		


	}

}
