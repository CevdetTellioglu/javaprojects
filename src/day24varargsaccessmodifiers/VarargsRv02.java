package day24varargsaccessmodifiers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VarargsRv02 {


	public static void main(String[] args) {
		// Varargs nin kullanimlari 
		
		// Kural 1 ; Varargs her zaman son parametre olmalidir.
		//   		cunku ilk parametre yaparsaniz girdiginiz her deger 
		//			varargs icine duser, siz asala ikinci parametreye deger veremezsiniz 
		
		
		List<Integer> list= new ArrayList<>();
		
		list.add(4);
		list.add(3);
		list.add(1,3);
		list.remove(0);
		for(Integer v:list) System.out.println(v);
		
		int[]random = {1,3,-4,12,33,-10};
		int x=33;
		int y=Arrays.binarySearch(random, x);
		System.out.println(y);
		
		valueChar("Character :",'a');
		valueChar("Character :",'a','b');
		
		product(5,6,7);
	}
	public static void valueChar(String s,char...c) {
		for(char w: c) {
			System.out.print(s);
			System.out.println(w);
		}
	}
	// Kural 2 ; Parametre olarak 1'den fazla Varargs kullanamazsiniz 
	// 			Cunku var args en sonda olmalidir, en sonda olmak tek olmayi 
	// 			gerektirir.
	
	public static void product(int x, int...y) {
		int product=1;
		for(int w:y) {
			product=product*w;
		}
		System.out.println(x);
		System.out.println(product);
	}
}
	
	

	


