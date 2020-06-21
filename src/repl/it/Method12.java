package repl.it;

import java.util.Arrays;

public class Method12 {
//Methoda iki sayı girelim ve  bize bir array dönsün. Array elemanları 1.sayının 2. sayı kadar kendisi ile toplamından oluşsun.
	public static void main(String[] args) {
		System.out.println(Arrays.toString(arrayOfMultiples(7,5)));
	  }
	  public static int[] arrayOfMultiples(int num, int length) {
	    int arr[] =  new int[length];
	    for(int i =0; i<length; i++ ) {
	      arr[i]=num*(i+1);
	    }
	    return arr;
	}
	
}
