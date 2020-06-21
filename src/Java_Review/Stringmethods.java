package Java_Review;

public class Stringmethods {

	public static void main(String[] args) {
		// 1. String uzunlugunu bulmak
		String string="Cevdet Tellioglu string methodlarini ogreniyor";
		int strUzunluk=string.length();
		System.out.println("(1).Stringimizin toplam uzunluğu:"+strUzunluk);
		
		//2.+ operatörü ile string birleştirmek
				String s1="Strasbourg ";
				String s2="Paris & Marseille";
				String s3=s1+s2;
				System.out.println("(2)."+s3);
		
				
		//3.Concat metodu ile string birleştirmek
				String k1="Strasbourg";
				String k2="Koln";
				String k3=k1.concat(k2);
				System.out.println("(3)."+k3);
				
		//4.String ifadeleri karşılaştırma equals ve equalsıgnoreCase metodları ile
		//equals: Büyüklük küçüklük hassasiyeti vardır.
		//egualsIgnoreCase: Büyüklük küçüklük hassasiyeti yoktur.
				String d1="Strasbourg";
				String d2="Paris";
				String d3="STRASBOURG";
				String d4="Paris";
				System.out.println("(4)."+d2+"-"+d4+"="+d2.equals(d4));
				System.out.println("    "+d1+"-"+d3+"="+d1.equals(d3));
				System.out.println("    "+d1+"-"+d4+"="+d1.equals(d4));
				System.out.println("    "+d1+"-"+d3+"="+d1.equalsIgnoreCase(d3));
				
		//5.String ifadeleri büyüklük kontrolü compareTo ve compareIgnoreCase metodları ile
		/*compareTo: Sözlük sıralamalarına göre büyüklük(se pozitif sayı) ve küçüklük(se negatif 
		    sayı) kontrolü yapar. Büyük harf hassasiyeti vardır. 
			compareToIgnoreCase: compareTo gibidir. Büyük harf hassasiyeti yoktur.*/	
				String i1="Selim";
				String i2="Selin";
				String i3="SELİM";
				String i4="SELİN";
				System.out.println("(5)."+i1+" < "+i2+" = "+i1.compareTo(i2));
				System.out.println("    "+i3+" = "+i1+" = "+i3.compareToIgnoreCase(i1));
				System.out.println("    "+i1+" < "+i4+" = "+i1.compareToIgnoreCase(i4));
				System.out.println("    "+i3+" > "+i1+" = "+i1.compareTo(i3));
				
				
				
				
				
				
				
			
		

	}

}
