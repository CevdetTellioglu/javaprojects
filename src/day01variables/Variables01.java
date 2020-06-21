package day01variables;

public class Variables01 {

	public static void main(String[] args) {
		
		int maas = 3000;
		
		char harf= 'S' ;
		
		System.out.println(maas);
		System.out.println(harf);
		
		
		boolean isOld = true;  // booleanlar icin sadece true veya false degerlerini kullanabilrisiniz.
		System.out.println(isOld);
		
		byte derinlik = -128;
		
		System.out.println(derinlik);
		
		short sirnakNufus = 28000;
		
		System.out.println(sirnakNufus);
		
		long hucreSayisi= 1234567845645645646l ; // integer sinirini asan long variable da en sona l koymaliyiz/
	
		System.out.println(hucreSayisi);
		
		double pi = 3.1434234023923409; // java butun ondalik kesirleri double olarak kabul eder.
										// default value = 0.0
										
		System.out.println(pi);
		
		float para = 5.25f; // Eger bir ondalik kesri ondalik yapmak isterseni sonuna f ya da F koymamiz gerekiyor
							// default value = 0.0f
		
		System.out.println(para);
		
		String ogrenciIsmi = "Cevdet Tellioglu";
		
		System.out.println(ogrenciIsmi);
	
		
	}
	
}
