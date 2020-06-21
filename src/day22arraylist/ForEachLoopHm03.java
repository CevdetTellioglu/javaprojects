package day22arraylist;

public class ForEachLoopHm03 {

	public static void main(String[] args) {
		//İki String array oluşturunuz ve bu array’lerdeki 
		//ortak elemanları For-each loop kullanarak bulunuz. 
		//Sonucu ekrana yazdırınız. Ortak eleman yoksa ekrana “Ortak eleman yok” yazdırınız
		
		String arr1[]= {"a","A","c","D","d","z","G"};
		String arr2[]= {"A","c","D","b","h"};
		int count=0;
		for (String w : arr1) {
			for (String z : arr2) {
				if(w==z) {
					System.out.println("Ortak elemanlar : "+ w);
				}
				count++;
			
			}
			
		}
		if(count==0) {
			System.out.println("Ayni eleman yok");
		}

	}

}
