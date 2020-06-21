package day22arraylist;

public class ForEachLoopHm04 {

	public static void main(String[] args) {
		//Bir String oluşturunuz, bu String’deki
		//character’leri yukarıdan aşağıya for-each loop kullanarak yazdırınız.
		//İpucu: split()
		
		String str="Cevdet";
		
		String harf[]=str.split("");
		
		for (String w : harf) {
			System.out.println(w);
			}
		
	
	}

}
