package day25stringbuilder;

public class StringBuilderRv01 {
	public static void main(String[] args) {
		
		//StringBuilder class i string uretmeye ve Stringleri manipule etmeye yarar.
		
		
		//String class i kullanarak String Uretirseniz yaptiginiz degisiklikler
		// ilk urettiginiz String i etkilemez ama illa ki ilk urettirigm string i 
		// degissin isterseniz atama yapmak zorundasiniz 
		
		// String Class'ini kullanarak urettiginiz Stringler atamasiz degistirelemedigi icin 
		// String Class ina "immutable" denir
		
		
		String str="Ali";
		str.substring(1);
		// value'su "li olan yeni bir object olsuturulur
		// str hala "ali" dir.
		System.out.println(str); 
		
		// StringBuilder Class ini kullanarak String uretirseniz yqptiginiw degisiklikler
		// ilk urettiginiz String i etkiler. aatama  yapmaya gerek yoktur.
		
		// StringBuilder Class i degisimi yansittigi icin ona 'mutable' denir.
		
		// 1.yol:
		StringBuilder strBld = new StringBuilder("Ali");
		strBld.append("Can");
		// append() methodu String  e yeni bir String eklemek icin kullanilir.
		
		System.out.println(strBld);
		
		// 2.yol 
		StringBuilder strBld2 = new StringBuilder();// Bos bir string uretir ==>""
		strBld2.append("Ali Can"); //Bos String e "Ali Can" ekledim 
		
		
		//3.yol
		
		StringBuilder strBld3= new StringBuilder(7);// Uzunlugu 7 karakter olan bir 
													// bir String urettim
		
		// olusturugunzu String in uzunlugunu belirkledikten sonra o uzunluktan az 
		// veya fazla Stringler ekleyebilrisiniz. StrignBuilder problem cikarmaz.
		
		strBld3.append("Ali");
		strBld3.append("Kahraman");
		System.out.println(strBld3);
		
		
		
		
	}

}
