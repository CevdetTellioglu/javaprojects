package day16overloading;

public class OverLoadingRv01 { // Overloading asiri yukleme

	public static void main(String[] args) {
		/*
		 * iki sayinin toplamini yazdirian bir method olusturunuz.
		 */
		toplama(2,3);//Method 1 kullanir
		toplama(7); //Method 2 kullanir
		toplama(3.2,32); //Method 3 kullanir
		toplama(4,4.3); //Method 4 kullanir
	}
	
	 	/*
	 	 * Overloading yapma yollari
	 	 * 
	 	 * 1) Parametrelerin sayisini degistirerek ayni isimli methodlar olusturabilirsiniz
	 	 * 2) parametre sayisini degistirmeden herhangi bir parametrinin data typeini 
	 	 * degistirerek de ayni isimli methodlar olusturabilirsiniz.
	 	 * note ; toplama(2,3); cagrisi toplama(int num1,int num2) var oldugu surece 
	 	 * 		toplama(int num1, int num2) yi kullanir. cunku argument data type yoksa auto widening'e
	 	 * gore java kullancagi methodu secer Autowidening  e gore kullanabilecegi bir method
	 	 * yoksa Java hata verir 
	 	 * 
	 	 * 3) """FARKLI data type"""indeki parametrelerin yerlerini degistirerek de ayni isimli methodlar olusturabilirsiniz.
	 	 
	 	 */
	// method 1
	public static void toplama(int num1,int num2) {
		System.out.println(num1+num2);
		}
	// Method 2 
	public static void toplama(int num1) {
		System.out.println(num1+num1);
		}
	// Method 3
	public static void toplama(double num1,int num2) {
		System.out.println(num1+num2);
	}
	// Method 4
	public static void toplama(int num2, double num1) {
		System.out.println(num1+num2);
	}
}
