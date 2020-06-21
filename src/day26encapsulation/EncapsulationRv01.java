package day26encapsulation;

public class EncapsulationRv01 {
	
	private String kimlikNo = "1234129334223";
	private int krediKartNo = 12343124;
	private boolean soguk = true;
	

	public static void main(String[] args) {
		// Encapsulation data saklama (data-hiding) yontemidir.
		// Encapsulation iki stepte yapilir:
		// 1) Data'yi (variable, method) private yapmalisiniz
		// 2) public olan getter() ve setter() methodlari uretmeliyim
		// getter() data'yi sadece okumamiza yarar. getter() methodu data da degisiklik yapamaz 
		// setter() data' yi degistirmemize yarar
		

	}
	//getter() uretmek icin; 1) Access Modifier public olmalidir
	//						 2) Return Type, variable in return type ile ayni olmalidir
	//						 3) Method ismi "get + variable ismi" seklinde olmalidir.
	

	
	public String getKimlikNo() {
		return kimlikNo;
	}
	public int getKrediKartNo() {
		return krediKartNo;
	}
	// return type boolean ise getter() method un ismi is ile baslar "get" ile kullanilmaz
	public boolean isSoguk() {
		return soguk;
	}
	//setter() uretmek icin; 1) Accese Modifier public olmali 
	//						 2) Return Type void olmali 
	//  					 3) Parametre kullanilmali (%99)
	//						 4) setter() methodlarin ismi booleanlar icin de set ile baslar
	
	
	public void setKimlikNo(String kimlikNo) {
		this.kimlikNo= kimlikNo;
		
	}
	public void setKrediKartNo(int krediKartNo) {
		this.krediKartNo=krediKartNo;
		
	}
	public void setSogul(boolean soguk) {
		this.soguk=soguk;
		
	}
	
}
