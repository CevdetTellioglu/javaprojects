package repl.it;

import java.util.Scanner;

public class String03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    
	    String st= input.nextLine();
	    String arananKelime = input.nextLine();
	    boolean isFound = st.indexOf(arananKelime)!=-1? true: false;
	   
	    System.out.println(isFound);
	    
	    
	    String str1=input.nextLine();
	     String str2=input.nextLine();
	     
	     System.out.println(str1.contains(str2));
	     
	     String st1= input.nextLine();
		    System.out.println((st1.length()-1)-st1.lastIndexOf(st1));
	     input.close();

	}

}
