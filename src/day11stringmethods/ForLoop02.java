package day11stringmethods;

public class ForLoop02 {

	public static void main(String[] args) {
		// 100 den kucuk 3un kati olan sayma sayilarini yaz
		
		
		for(int i=3; i<100; i+=3) {
			System.out.print(i+" ");
		}
		System.out.println(" ");
		
		// ilk 5 sayma sayisinin toplamini veren programi for loop ile yaziniz.
		// 1,2,3,4,5
		//int sum=0 0+1=1 1+2=3 ==> 3+3=6 ==> 6+4=10 ==>10+5=15
		
		int sum=0;
		for(int i = 1; i<6; i++ ) {
			sum = sum+i;
			System.out.println("Toplam :" +sum);
		}
			System.out.println("Toplam :" +sum); // sadece en son adimi gormek isterseniz
												// yazdirma islemini for loop un disinda yapiniz.
	
			//10 dan buyuk ilk uc sayma sayisinin toplamini veren for loop yaz
			int sum1=0;
			for(int i=11; i<14; i++) {
				sum1= sum1+i;
				System.out.println(i);
				}
			System.out.println("toplam :"+ sum1);
			
			//20 den buyuk ilk 5 sayma sayisinin toplamini veren for loop olustryrun
			
			int sum3=0;
			for(int i=21; i<26; i++) {
				sum3=sum3+i;
				}
			System.out.println("Toplam :"+ sum3);
			
			// ilk elli sayma sayisini toplamini veren for loop olusturunuz
			int sum4=0;
			for(int i=1; i<51; i++) {
				sum4=sum4+i;
				}
			System.out.println("Toplam :"+ sum4);
			
			//5 ile bolunebilen 100 den kucuk sayma sayilarinin toplamini veren for loop olusturunuz
			
			int sum5=0;
			for(int i=5; i<100; i+=5) {
				sum5=sum5+i;
				}
			System.out.println("Toplam :"+ sum5);
			
			
			
	}

}
