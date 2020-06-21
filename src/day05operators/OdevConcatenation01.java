package day05operators;

public class OdevConcatenation01 {

	public static void main(String[] args) {
		
		
		int numA = 2;
		int numB = 3;
		String str1 = "Cok";
		String str2 = "Çalış";
		
		//Aşağıdaki çıktıları ekrana yazdırmak icin program yazınız.
		//A) Çok Çalış B) 5 Çok C) Çalış23 D) Çok1
		
		System.out.println("A = "+str1 + " "+str2);
		System.out.println("B = "+(numA+numB)+" "+ str1);
		System.out.println("C = "+ str2+numA+numB);
		System.out.println("D = "+ str1+(numB-numA));

	
		
		int numc = 4;
		int numd = 5;
		String strr="Ali";
		System.out.println(numc+numd+strr);
		
	}

}
