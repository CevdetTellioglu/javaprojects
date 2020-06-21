package Java_Review;


import java.util.Random;
import java.util.Scanner;

public class day02 {

	public static void main(String[] args) {
		// 0 ile 1000 arası sayı
		int ramdomSayi= (int)(Math.random()*10)+10; // 10 ile 20 arası değerler
		   
			    
	    Random random= new Random();
		        
	    int randomSayi = random.nextInt(1000);
	    System.out.println(randomSayi);
		    
		
		//==========
		
		String str="Cevdet";
		
		System.out.println(str.substring(str.length()-1));
		System.out.println(str.substring(2));
		System.out.println(str.substring(0,3));
		
		//=======
		String str1 = "  Ali Can   ";
		System.out.println(str1.isEmpty());
		System.out.println(str1.trim());
		System.out.println(str1.charAt(2));
		System.out.println(str1.length());
		
		//=====
		String str2 = "Java ah java";
		
		
		System.out.println(str2.contains("x"));
		System.out.println(str2.contains("J"));
		System.out.println(str.contains("ja"));
		
		//=====
		
		char harf = 'B';

		 switch(harf) {
		        	case 'A':
		        		System.out.println("Ilk harf");
		        		break;
		        	case 'B':
		        		System.out.println("Ikinci harf");
		    
		        	case 'C':
		        		System.out.println("Ucuncu harf");
		        		break;
		        	case 'D':
		        		System.out.println("Dorduncu harf");
		                break;
		        	default:
		        		System.out.println("Bilmiyorum");
		        		
		}

		 
		 //====
		 String str3 = "Ali";
		 String str4 = "ali";
		 
		 System.out.println(str3.equalsIgnoreCase(str4));
		 System.out.println(str4.equals(str3));
		 System.out.println(str4.equalsIgnoreCase(str3));
		 System.out.println(str3.equals(str4));
		 //=====
		 String stra = "Ali";
		 String strb = "Ali";
		 
		// System.out.println(stra==stra);
		 System.out.println(stra.equals(strb));
		 System.out.println(stra==strb);
		 
		 String strz = "abc";
		 System.out.println(strz.length());
			for(int i =0; i<strz.length(); i++) {
				System.out.println(i);
			}

		}

}
