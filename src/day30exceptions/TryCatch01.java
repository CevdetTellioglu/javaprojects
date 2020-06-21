package day30exceptions;

public class TryCatch01 {

	public static void main(String[] args) {

		int num1 = 12;
		int num2 = 0;
			
		
		// Finally{} block exception olsa da olmasa da her zaman calisir 
		// Finally{} block try-catch block tan sonra kullanilir
		
		try {
			System.out.println(num1 / num2);
		} catch (ArithmeticException e) {
			System.out.println("sifir ile bolme yapilamaz");
		} finally {
			System.out.println("Isleminiz bitmistir");
		}
		
		//Interview : final, finally, finalize keyword'lerinin farki nedir?
		/*
		  1)finally{} (block)==> try-catch block dan sonra kullanilir
		  				exception olsa da olmasa da calisir.
		  				
		  2)final(keyword) ==> Variable'larda final kullanilirsa o variable'in 
		  			  degeri degistirilemez.Mesela final pi dedigimiz zaman degeri
		  			  degistiremez. final String code = "POS";
		  			  
		  			  Method'larda final kullanilirsa method body leri degistirelemez
		  			  dolayisiyla overriding yapilamaz
		  			  
		  			  Class'larda final kullanilirsa, o class extends edilemez.
						public "final" class Animal{  } ==> public class Dog extends Animal{ } OLMAZ
					
		  3)finalize()(method) ==> finalize() methodu , Garbage Collecter in  imha edecegi datalari imha edilecek hale getirir			  
		  			  
		 */
		

	}
}
