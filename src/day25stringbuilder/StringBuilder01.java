package day25stringbuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
		// StringBuilder class i String uretmeye ve uretilen Stringleri manipule  etmeye yarar
		
		// String class i kullanarak String uretirseniz yaptiginiz degisiklikler 
		// ilk urettiginiz String'i etkilemez. Ama illa ki ilk urettigim String
		// degissin isterseniz atama yapmak zorundasiniz.
		
		//  String class'ini kullanarak urettiginiz Stringler atamasiz degistirilemedigi icin
		//  String Class'ina "immutable" denir.
		
		
		String str="Ali";
		str.substring(1); // ==> value'su "li" olan yeni bir object olusturulur.
						  //     str hala "Ali"dir
		System.out.println(str); // Ali
		
		// StringBuilder Class'ini kullanarak String uretirseniz yaptiginiz degisiklikler 
		// ilk urettiginiz String'i etkiler. Atama yapmaya gerek yoktur.
		
		 
		//  StringBuilder Class'i degisimi yansittigi icin ona  "mutable" denir.
		
		// 1.yol:
		StringBuilder strBld = new StringBuilder("Ali");
		strBld.append("Can"); // append() methodu String e yeni bir String eklemek
							 // icin kullanilir. Concatenation yapar
		
		System.out.println(strBld);
		
		//2.yol;
		StringBuilder strBld2=new StringBuilder(); //Bos bir String uretir ==> ""
		strBld2.append("Ali Can"); // Bos String'e "Ali Can" ekledim
		
		//3.yol;
		
		StringBuilder strBld3 = new StringBuilder(7); // Uzunlugu 7 karakter olan bir 
													  // bir String urettim
		
		//Olusturdugunuz String in uzunlugunu belirledikten sonra o uzunluktan az veya 
		// cok Stringler ekleyebilirsiniz. StringBuilder problem cikarmaz. 
		
		strBld3.append("Ali");
		strBld3.append("Kahraman");
		System.out.println(strBld3);
		
		
		
		
	}

}
