package day26encapsulation;

public class EncapsulationRv02 {

	private char ilkHarf = 'C';
	private double para = 23.75;
	private boolean emekli= false;
	

		// variable'a atanan degerlerin degistirilmesini istemiyorsaniz
		// o variable ile alakali setter() olusturulmamalisiniz
		
		// variable atanan degerin okunmaini istemiyorsaniz, o variable ile alakali
		// getter() olusturmamalisiniz
		
		// sadece getter() kullanir ve hic setter() kullanmazsaniz  variable degerleri degistirilemez demektir 
		
	
		// sadece setter() kullanir ve hic getter() kullanmazsaniz variable degerleri okunamaz demektir
		
	public static void main(String[] args) {
		
		EncapsulationRv01 obj = new EncapsulationRv01();
		System.out.println(obj.getKimlikNo());
		obj.setKimlikNo("100000000");
		System.out.println(obj.getKimlikNo());

	}
	
	public char getIlkHarf() {
	return ilkHarf;
	
	}
	
	public void setIlkHarf(char ilkHarf) {
		this.ilkHarf=ilkHarf;
		
	}
	public double getPara() {
		return para;
	}
	
	public void setPara(double para) {
		this.para = para;
		
	}
	
	public boolean isEmekli() {
		return emekli;
		
	}
	public void setEmekli(boolean emekli) {
		this.emekli=emekli;
	}

}
