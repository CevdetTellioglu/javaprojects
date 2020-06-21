package day33interface;

public class LuxHonda extends Araba implements IcAraba, DisAraba {

	 public static void main(String[] args) {
	        
	        LuxHonda luxHonda = new LuxHonda();
	        
	        luxHonda.benzin();
	        luxHonda.direksiyon();
	        luxHonda.kapi();
	        luxHonda.klima();
	        luxHonda.koltuk();
	        luxHonda.move();
	        System.out.println(IcAraba.price);
	        System.out.println(DisAraba.price);
	        System.out.println("Arabanin toplam fiyati "+(IcAraba.price + DisAraba.price)+" Euro'dur");
	        System.out.println(old); // iki tane old isimli variable olmadigindan 
	        // interface ismini kullanmaya gerek yok 
	        luxHonda.doseme();
	        IcAraba.isitma();
	        
	    }
	    @Override
	    public void move() {
	        
	        System.out.println("3 saniyede 100 km'lik hiza ulasir");
	        
	    }
	    @Override
	    public void kapi() {
	        
	        System.out.println("Parmak izi ayarli kapi");
	                
	    }
	    @Override
	    public void direksiyon() {
	        
	        System.out.println("Gercek deri direksiyon");
	                
	    }
	    @Override
	    public void koltuk() {
	        
	        System.out.println("Isitmali deri koltuk");
	        
	    }
	    @Override
	    public void klima() {
	        
	        System.out.println("Dijital klima");
	        
	    }
	}
