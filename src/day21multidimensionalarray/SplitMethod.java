package day21multidimensionalarray;


import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
	
		String str1="Ali Can okula basladi, nasil oldu? iyi oldu ama zor.";
		String word[]=str1.split(" ");
		
		System.out.println(Arrays.toString(word));
		System.out.println("Kelime sayisi: "+ word.length);
		
		
		String str2 = "Kahramanmaraslilar iyi mi?";
		String harf[] = str2.split("");
		System.out.println(Arrays.toString(harf));
		System.out.println("harf sayisi: "+ harf.length);
		
	
		
	}

}
