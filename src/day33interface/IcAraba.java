package day33interface;

public interface IcAraba {

	int price = 2000;
	boolean old = true;

	public default void doseme() {
		System.out.println("Interface'de default keyword ile doseme yaptim");
	}
	// Default keywordu kullanirsak body eklemek zorundayiz 
	// Aksi takdirde Compile Time Error Aliriz
	//public default void  isitma();
	
	
	public static void isitma() {
		System.out.println("Interface de static keyword ile isitma yaptim ");
	}
	
	public abstract void direksiyon();

	public void koltuk();

	abstract void klima();

}
