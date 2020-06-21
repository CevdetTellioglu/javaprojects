package day15methodcreation;

public class MethodCreation01 {

	public static void main(String[] args) {
		
		
		System.out.println(toplama(3,5.2)); //8.2
		System.out.println(carpma(3,5));  //15
		
	}
		
		// Bir methodu main methodun icinden cagirmak icin mutlaka static kelimesini kullanmalisiniz.
		// Method parantezinin icinde olusturulan variab'lara "parametre" denir.
		// Methodu cagirirken method parantezinin icine yazilan degerlere "Argument" denir.
		// Parametrenin datatype ile argument in datatype 1e 1 eslesmeli == int method da cagirdigimiz da int olmali 
	
	
	
	public static double toplama(int num1,double num2) {
		return num1+num2;
		
	}

	public static int carpma(int num1, int num2) {
		return num1*num2;
	}
}
