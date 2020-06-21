package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		//Array'lerde length sabitti degistirilemez
		//ArrayList'lerde (List) length esnektir.Siz eleman ekledikce
		//List length'ini artirir, siz eleman sildikce list length'ini azaltir.
		
		
		//List<String> list01 = new List<>() ; ===> olmaz
		//ArrayList<String> list01 = new List<>() ; ===> olmaz
		//ArrayList<String> list01 = new ArrayList<>() ; ===> olabilir ama cok kullanilmaz
		//List<String> list01 = new ArrayList<String>() ; ===> bu da olabilir ama az kullanilir
		
		List<String> list01 = new ArrayList<>() ; // List bir object dir
		System.out.println(list01);
		
		// List'e eleman eklemek icin add() methodu kullanilir.
		
		list01.add("Ali");
		System.out.println(list01);//Ali
		
		list01.add("Can");
		System.out.println(list01);
		
		// Veli'yi Ali ile canin arasina ekleyelim 
		
		list01.add(1,"Veli");
		System.out.println(list01);
		
		//[Han, Ali, Kemal, Veli, Can, Ayse] cikti almaya calisiniz.
		
		list01.add(0,"Han");
		list01.add(2,"Kemal");
		list01.add("Ayse");
		System.out.println(list01);
		
		//list01 in eleman sayisini ekrana yaziniz 
		
		// size() method kullanilir 
		System.out.println(list01.size());
		
		
		list01.remove(3);
		System.out.println(list01);
	}

}
