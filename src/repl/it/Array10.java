package repl.it;

import java.util.Scanner;

public class Array10 {

	public static void main(String[] args) {
	// Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.

		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    String[] words = sentence.split(" ");
	        String reversed = "";
	        for (int i = words.length-1; i>= 0; i--)
	        {
	            reversed = reversed + words[i] + " ";
	        }
	    //Kodlarınızı burada sonlandırınız ve verilen yardımcı kodları değiştirmeyiniz.
	    System.out.println(reversed);
	    input.close();
	  }
	}


