package day11stringmethods;

public class ForLoop01 {

	public static void main(String[] args) {
		// for(Starting Value ; Ending Condition;Increasing or Decreasing the value){
		// }
		
		
		// 6,5,4,3 ve 2 yi ekrana yazdiran bir loop olusturunuz.
		
		
		for(int i=6 ; i>-2 ;i--) {
			System.out.print(" "+ i);
			
			
		}
		//3,4,5,6,7 sayi al
		System.out.println(" ");
		
		for(int i=3; i<8; i++) {
			System.out.println(i);
		}
		
		//ilk 100 sayma sayisini ekrana yazdiran ve aralarinda bosluk olan programi yaziniz.
		//for loop kullaniniz.
		
		for(int i=1 ; i<=100; i++) {
			System.out.print(" "+i);
		}
			System.out.println(" ");
		
		//ilk 100 sayma sayisini yuzden 1 e kadar yanyana arasinda bosluk birakarak yazdirin.
			
		for(int i=100 ;  i>0 ; i--) {
			System.out.print(" "+ i );
			
		}
		System.out.println(" ");
		// ilk 50 cift sayma sayisiniz ekrana yazdiran  for loop olsuturunuz
		//2,4,6,...100
		for(int i=2; i<=100;i+=2) {
			System.out.print(i+" ");
		}
		
		System.out.println(" ");
		// ilk 50 tek sayma sayisiniz ekrana yazdiran  for loop olsuturunuz
		//1 3 5....100
		
		for(int i=1; i<=99;i+=2) {
			System.out.print(i+" ");
		}
		

	}

}
