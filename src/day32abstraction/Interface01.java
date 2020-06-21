package day32abstraction;

public interface Interface01 {

	// interface icine concrete method yazamazsiniz Compile Time Error alirsiniz
	// Interface'de method olustururken kesinlikle body yazmayin
	// Interface'de methodlar kesinlikle abstract olmalidir
	// Interface'deki method abstract methodlari uretirken abstract keyword
	// kullansaniz da olur
	// kullanmasanizda olur. Cunku Interface kendi icine yazilan methodlari otomatik
	// olarak abstract olarak kabul eder.

	public void add();

	public void subtract();

	// Interface de variablelar mutlaka; public, static, final olmali ve
	// mutlaka initialize edilmelidirler. (deger atanmanli)
	// variable olusturulurken public, static, final keywordleri kullanilsa da olur
	// kullanilmasa da olur.
	// public static final keywordleri kullanildiginda da kullanilmadiginda da
	// variable public static ve finaldir

	public static final int a = 12;

	int b = 11;
	public int c = 13;
	final int d = 14;
	static int e = 15;

}
